<<<<<<< HEAD
import React from 'react';
import TodoItem from './TodoItem';

const TodoList = ({ todos, toggleComplete, removeTodo }) => (
  <>
    {todos.map((todo, index) => (
      <TodoItem
        key={index}
        index={index}
        todo={todo}
        toggleComplete={toggleComplete}
        removeTodo={removeTodo}
      />
    ))}
  </>
);

export default TodoList;
=======
import React from 'react';
import TodoItem from './TodoItem';

const TodoList = ({ todos, toggleComplete, removeTodo }) => (
  <>
    {todos.map((todo, index) => (
      <TodoItem
        key={index}
        index={index}
        todo={todo}
        toggleComplete={toggleComplete}
        removeTodo={removeTodo}
      />
    ))}
  </>
);

export default TodoList;
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
