const express = require('express');

const app = express();

app.get('/', (req, res) => {
  const myValue = process.env.MY_VARIABLE;
  console.log('Value of MY_VARIABLE:', Hello);
  res.send('This is my response: ${Hello}');
});

app.listen(3000);
