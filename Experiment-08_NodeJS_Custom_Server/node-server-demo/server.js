<<<<<<< HEAD
const http = require('http');

// Create the server
const server = http.createServer((req, res) => {
  res.writeHead(200, {'Content-Type': 'text/plain'});
  res.end('Hello from Node.js custom server!\n');
});

// Start listening on port 3000
server.listen(3000, () => {
  console.log('Server is running on http://localhost:3000');
});
=======
const http = require('http');

// Create the server
const server = http.createServer((req, res) => {
  res.writeHead(200, {'Content-Type': 'text/plain'});
  res.end('Hello from Node.js custom server!\n');
});

// Start listening on port 3000
server.listen(3000, () => {
  console.log('Server is running on http://localhost:3000');
});
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
