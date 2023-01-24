let min = 46;
let quarter;

if(min > 59) {
    console.log("Podana liczba jest za duża. Maksymalna liczba to 59.");
} else {
  if (min >= 0 && min < 15) {
    quarter = "pierwszej";
  } else if (min >= 15 && min < 30) {
    quarter = "drugiej";
  } else if (min >= 30 && min < 45) {
    quarter = "trzeciej";
  } else {
    quarter = "czwartej";
  }

  console.log("Liczba " + min + " trafiła do " + quarter + " ćwierci godziny.");
}