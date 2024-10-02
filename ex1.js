const express = require('express');

const app = express();

app.get('/', (req, res) => {
  const myValue = process.env.MY_VARIABLE;
  console.log('Value of MY_VARIABLE:', myValue)
  res.send('This is my response: ${myValue}');
});

app.listen(3000);
