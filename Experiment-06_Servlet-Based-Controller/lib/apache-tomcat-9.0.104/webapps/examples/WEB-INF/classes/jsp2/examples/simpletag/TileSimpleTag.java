<<<<<<< HEAD
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jsp2.examples.simpletag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Displays a tile as a single cell in a table.
 */
public class TileSimpleTag extends SimpleTagSupport {
    private String color;
    private String label;

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write(
                "<td width=\"32\" height=\"32\" bgcolor=\"" + this.color +
                "\"><font color=\"#ffffff\"><center>" + this.label +
                "</center></font></td>" );
    }

    public void setColor( String color ) {
        this.color = color;
    }

    public void setLabel( String label ) {
        this.label = label;
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
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jsp2.examples.simpletag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Displays a tile as a single cell in a table.
 */
public class TileSimpleTag extends SimpleTagSupport {
    private String color;
    private String label;

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write(
                "<td width=\"32\" height=\"32\" bgcolor=\"" + this.color +
                "\"><font color=\"#ffffff\"><center>" + this.label +
                "</center></font></td>" );
    }

    public void setColor( String color ) {
        this.color = color;
    }

    public void setLabel( String label ) {
        this.label = label;
    }
}
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
