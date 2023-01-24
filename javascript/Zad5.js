//Opcja z dwuwymiarową tablicą bez switch lub if
let lang = "pl";

let arr = [
    ["poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela"],
    ["monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"]
];

        console.log(arr[lang === "pl" ? 0 : 1]);
    
    
 //Opcja drugą z opcją switch-case   
let lang2 = "pl";
        let arr2;
        
        switch (lang2) {
            case "pl":
                arr2 = ["poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota", "niedziela"];
                break;
            case "en":
                arr2 = ["monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"];
                break;
        }
        
        console.log(arr2);