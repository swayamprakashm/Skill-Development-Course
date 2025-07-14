<<<<<<< HEAD
const EventEmitter = require('events');

// Create an emitter
const emitter = new EventEmitter();

// Register an event
emitter.on('greet', (name) => {
  console.log(`Hello, ${name}!`);
});

// Emit the event
emitter.emit('greet', 'Prakash');
=======
const EventEmitter = require('events');

// Create an emitter
const emitter = new EventEmitter();

// Register an event
emitter.on('greet', (name) => {
  console.log(`Hello, ${name}!`);
});

// Emit the event
emitter.emit('greet', 'Prakash');
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
