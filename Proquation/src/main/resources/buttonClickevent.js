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
	let resultContainer = document.querySelector('.result_content');
	
	if(checkValid == 'valid') {
		if(result != 'Infinity' && !isNaN(result))
			resultContainer.textContent = result;
		else
			resultContainer.textContent = 'Division by 0 not allowed';
	}
	
	else
		resultContainer.textContent = 'Not a valid expression';

}

function checkValidExpression(strCheck){
	let lastElement = strCheck[strCheck.length - 1];
	if(lastElement == '+' || lastElement == '-' || lastElement == '*' || lastElement == '/')
		return 'invalid';
	else
		return 'valid';
}