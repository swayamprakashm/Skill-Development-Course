<<<<<<< HEAD
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package websocket.snake;

import java.awt.Color;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/websocket/snake")
public class SnakeAnnotation {

    public static final int PLAYFIELD_WIDTH = 640;
    public static final int PLAYFIELD_HEIGHT = 480;
    public static final int GRID_SIZE = 10;

    private static final AtomicInteger snakeIds = new AtomicInteger(0);
    private static final Random random = new Random();


    private final int id;
    private Snake snake;

    public static String getRandomHexColor() {
        float hue = random.nextFloat();
        // sat between 0.1 and 0.3
        float saturation = (random.nextInt(2000) + 1000) / 10000f;
        float luminance = 0.9f;
        Color color = Color.getHSBColor(hue, saturation, luminance);
        return '#' + Integer.toHexString(
                (color.getRGB() & 0xffffff) | 0x1000000).substring(1);
    }


    public static Location getRandomLocation() {
        int x = roundByGridSize(random.nextInt(PLAYFIELD_WIDTH));
        int y = roundByGridSize(random.nextInt(PLAYFIELD_HEIGHT));
        return new Location(x, y);
    }


    private static int roundByGridSize(int value) {
        value = value + (GRID_SIZE / 2);
        value = value / GRID_SIZE;
        value = value * GRID_SIZE;
        return value;
    }

    public SnakeAnnotation() {
        this.id = snakeIds.getAndIncrement();
    }


    @OnOpen
    public void onOpen(Session session) {
        // If the messages take longer than TICK_DELAY to be sent, the game isn't going to work properly.
        session.getUserProperties().put("org.apache.tomcat.websocket.BLOCKING_SEND_TIMEOUT",
                Long.valueOf(SnakeTimer.TICK_DELAY));
        this.snake = new Snake(id, session);
        SnakeTimer.addSnake(snake);
        StringBuilder sb = new StringBuilder();
        for (Iterator<Snake> iterator = SnakeTimer.getSnakes().iterator();
                iterator.hasNext();) {
            Snake snake = iterator.next();
            sb.append(String.format("{\"id\": %d, \"color\": \"%s\"}",
                    Integer.valueOf(snake.getId()), snake.getHexColor()));
            if (iterator.hasNext()) {
                sb.append(',');
            }
        }
        SnakeTimer.broadcast(String.format("{\"type\": \"join\",\"data\":[%s]}", sb.toString()));
    }


    @OnMessage
    public void onTextMessage(String message) {
        if ("west".equals(message)) {
            snake.setDirection(Direction.WEST);
        } else if ("north".equals(message)) {
            snake.setDirection(Direction.NORTH);
        } else if ("east".equals(message)) {
            snake.setDirection(Direction.EAST);
        } else if ("south".equals(message)) {
            snake.setDirection(Direction.SOUTH);
        }
    }


    @OnClose
    public void onClose() {
        SnakeTimer.removeSnake(snake);
        SnakeTimer.broadcast(String.format("{\"type\": \"leave\", \"id\": %d}", Integer.valueOf(id)));
    }


    @OnError
    public void onError(Throwable t, Session session) throws Throwable {
        /*
         * Assume all errors are fatal. Close the session and remove the snake from the game.
         */
        session.close();
        /*
         * Correct action depends on root cause. Protect against infinite loops while looking for root cause.
         */
        int count = 0;
        Throwable root = t;
        while (root.getCause() != null && count < 20) {
            root = root.getCause();
            count ++;
        }
        if (root instanceof IOException) {
            /*
             * User going away can present in different ways depending on their platform and exactly what went wrong.
             * Assume that any IO issue is some form of the user going away and ignore it.
             */
        } else {
            throw t;
        }
    }
}
=======
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package websocket.snake;

import java.awt.Color;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/websocket/snake")
public class SnakeAnnotation {

    public static final int PLAYFIELD_WIDTH = 640;
    public static final int PLAYFIELD_HEIGHT = 480;
    public static final int GRID_SIZE = 10;

    private static final AtomicInteger snakeIds = new AtomicInteger(0);
    private static final Random random = new Random();


    private final int id;
    private Snake snake;

    public static String getRandomHexColor() {
        float hue = random.nextFloat();
        // sat between 0.1 and 0.3
        float saturation = (random.nextInt(2000) + 1000) / 10000f;
        float luminance = 0.9f;
        Color color = Color.getHSBColor(hue, saturation, luminance);
        return '#' + Integer.toHexString(
                (color.getRGB() & 0xffffff) | 0x1000000).substring(1);
    }


    public static Location getRandomLocation() {
        int x = roundByGridSize(random.nextInt(PLAYFIELD_WIDTH));
        int y = roundByGridSize(random.nextInt(PLAYFIELD_HEIGHT));
        return new Location(x, y);
    }


    private static int roundByGridSize(int value) {
        value = value + (GRID_SIZE / 2);
        value = value / GRID_SIZE;
        value = value * GRID_SIZE;
        return value;
    }

    public SnakeAnnotation() {
        this.id = snakeIds.getAndIncrement();
    }


    @OnOpen
    public void onOpen(Session session) {
        // If the messages take longer than TICK_DELAY to be sent, the game isn't going to work properly.
        session.getUserProperties().put("org.apache.tomcat.websocket.BLOCKING_SEND_TIMEOUT",
                Long.valueOf(SnakeTimer.TICK_DELAY));
        this.snake = new Snake(id, session);
        SnakeTimer.addSnake(snake);
        StringBuilder sb = new StringBuilder();
        for (Iterator<Snake> iterator = SnakeTimer.getSnakes().iterator();
                iterator.hasNext();) {
            Snake snake = iterator.next();
            sb.append(String.format("{\"id\": %d, \"color\": \"%s\"}",
                    Integer.valueOf(snake.getId()), snake.getHexColor()));
            if (iterator.hasNext()) {
                sb.append(',');
            }
        }
        SnakeTimer.broadcast(String.format("{\"type\": \"join\",\"data\":[%s]}", sb.toString()));
    }


    @OnMessage
    public void onTextMessage(String message) {
        if ("west".equals(message)) {
            snake.setDirection(Direction.WEST);
        } else if ("north".equals(message)) {
            snake.setDirection(Direction.NORTH);
        } else if ("east".equals(message)) {
            snake.setDirection(Direction.EAST);
        } else if ("south".equals(message)) {
            snake.setDirection(Direction.SOUTH);
        }
    }


    @OnClose
    public void onClose() {
        SnakeTimer.removeSnake(snake);
        SnakeTimer.broadcast(String.format("{\"type\": \"leave\", \"id\": %d}", Integer.valueOf(id)));
    }


    @OnError
    public void onError(Throwable t, Session session) throws Throwable {
        /*
         * Assume all errors are fatal. Close the session and remove the snake from the game.
         */
        session.close();
        /*
         * Correct action depends on root cause. Protect against infinite loops while looking for root cause.
         */
        int count = 0;
        Throwable root = t;
        while (root.getCause() != null && count < 20) {
            root = root.getCause();
            count ++;
        }
        if (root instanceof IOException) {
            /*
             * User going away can present in different ways depending on their platform and exactly what went wrong.
             * Assume that any IO issue is some form of the user going away and ignore it.
             */
        } else {
            throw t;
        }
    }
}
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
