/**
 * 
 */

var evalStr = '';
var buttons = document.querySelectorAll(".btn");
function updateStr(str) {
	evalStr += str;
	calcExpression(evalStr);
}

function calcExpression(strEval) {
	var result = evaluate(strEval);
	document.querySelector('.result').textContent = result; 
}