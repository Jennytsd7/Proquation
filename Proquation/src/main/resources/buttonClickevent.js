/**
 * 
 */

var evalStr = '';
var buttons = document.querySelectorAll(".btn");
function updateStr(str) {
	evalStr += str;
}

function calcExpression(strEval) {
	var result = eval(strEval);
	document.querySelector('.result').textContent = result; 
}