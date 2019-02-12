


(function calculate() {

 var p= prompt("Please enter Amount");

 var r= prompt("Please enter Rate");

 var n= prompt("Please enter Years");


  var result = document.getElementById("result");

  result.innerHTML = "The interest is " + (p*n*r/100);

} ());
