/**
 * 
 */

var buttons= document.querySelectorAll(".btn");
var exp="";

buttons.forEach((button) => {
  button.addEventListener('click', function(){
      expression+=button.value;
      evaluateExpression(exp);
  });
});