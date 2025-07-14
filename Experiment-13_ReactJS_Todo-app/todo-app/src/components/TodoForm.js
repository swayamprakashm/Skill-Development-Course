<<<<<<< HEAD
import React, { useState } from 'react';

const TodoForm = ({ addTodo }) => {
  const [text, setText] = useState('');

  const handleSubmit = e => {
    e.preventDefault();
    if (!text.trim()) return;
    addTodo(text);
    setText('');
  };

  return (
    <form onSubmit={handleSubmit}>
      <input 
        value={text}
        onChange={e => setText(e.target.value)}
        placeholder="Enter a todo"
      />
      <button type="submit">Add</button>
    </form>
  );
};

export default TodoForm;
=======
import React, { useState } from 'react';

const TodoForm = ({ addTodo }) => {
  const [text, setText] = useState('');

  const handleSubmit = e => {
    e.preventDefault();
    if (!text.trim()) return;
    addTodo(text);
    setText('');
  };

  return (
    <form onSubmit={handleSubmit}>
      <input 
        value={text}
        onChange={e => setText(e.target.value)}
        placeholder="Enter a todo"
      />
      <button type="submit">Add</button>
    </form>
  );
};

export default TodoForm;
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
