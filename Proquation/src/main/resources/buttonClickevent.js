/**
 * 
 */
var result;
var evalStr = '';
var buttons = document.querySelectorAll(".btn");
function updateStr(str) {
	evalStr += str;
	result = evaluate(evalStr);
	displayResult(evalStr);
}

function displayResult(strEval){

	
	let checkValid = checkValidExpression(strEval);
	
	if(checkValid == 'valid')
		document.querySelector('.result_content').textContent = result;
	
	else
		document.querySelector('.result_content').textContent = 'Not a valid expression';

}

function checkValidExpression(strCheck){
	let lastElement = strCheck[strCheck.length - 1];
	if(lastElement == '+' || lastElement == '-' || lastElement == '*' || lastElement == '/')
		return 'invalid';
	else
		return 'valid';
}