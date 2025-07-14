<<<<<<< HEAD
import React from 'react';

const TodoItem = ({ todo, index, toggleComplete, removeTodo }) => (
  <div style={{ 
    textDecoration: todo.completed ? 'line-through' : '' 
  }}>
    {todo.text}
    <button onClick={() => toggleComplete(index)}>✔️</button>
    <button onClick={() => removeTodo(index)}>❌</button>
  </div>
);

export default TodoItem;
=======
import React from 'react';

const TodoItem = ({ todo, index, toggleComplete, removeTodo }) => (
  <div style={{ 
    textDecoration: todo.completed ? 'line-through' : '' 
  }}>
    {todo.text}
    <button onClick={() => toggleComplete(index)}>✔️</button>
    <button onClick={() => removeTodo(index)}>❌</button>
  </div>
);

export default TodoItem;
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
