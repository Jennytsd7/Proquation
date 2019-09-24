/**
 * 
 */

var evalStr = '';
var buttons = document.querySelectorAll(".btn");
buttons.foreach(item) {
  item.addEventListener('click',function(){
      evalStr += item.value;
      calcExpression(evalStr);
  })
}

function calcExpression(strEval) {
	var result = eval(strEval);
	document.querySelector('.result').textContent = result; 
}