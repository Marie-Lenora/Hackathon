import { search } from "./CustomerEdit";
document.getElementById("logBut").onclick = function(){

//var userN = document.getElementById("userN").value;
var Pass = document.getElementById("Pass").value;

if(search(Pass)){


    window.open("http://127.0.0.1:5500/browser.html");
}


console.log(userN, Pass);  
 
}