const obj = {
    "Warszawa": "Polska",
    "Paryż": "Francja",
    "Londyn": "Wielka Brytania"
  };
  
  for (const key in obj) {
    console.log(`${key} - ${obj[key]}`);
  }