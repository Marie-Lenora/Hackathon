import { database,addCustomer,size } from "./CustomerEdit";

document.getElementById("SignUpBut").onclick = function(){


    var userN = document.getElementById("SignUpName").value;
    var Pass = document.getElementById("SignUpPass").value;
    
    database[size].addCustomer(userN,Pass);

    console.log(userN, Pass);  
     
    }