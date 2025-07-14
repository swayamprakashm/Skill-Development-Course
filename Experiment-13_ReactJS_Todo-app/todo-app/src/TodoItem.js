<<<<<<< HEAD
const TodoItem = ({ todo, index, toggleComplete, removeTodo }) => (
    <div className={`todo ${todo.completed ? 'completed' : ''}`}>
      <span>{todo.text}</span>
      <div>
        <button onClick={() => toggleComplete(index)}>✔️</button>
        <button onClick={() => removeTodo(index)}>❌</button>
      </div>
    </div>
  );
=======
const TodoItem = ({ todo, index, toggleComplete, removeTodo }) => (
    <div className={`todo ${todo.completed ? 'completed' : ''}`}>
      <span>{todo.text}</span>
      <div>
        <button onClick={() => toggleComplete(index)}>✔️</button>
        <button onClick={() => removeTodo(index)}>❌</button>
      </div>
    </div>
  );
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
  