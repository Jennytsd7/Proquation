/**
 * 
 */
var result;
var evalStr = '';
var buttons = document.querySelectorAll(".btn");

//function to compute the Expression string
function updateStr(str) {
	evalStr += str;
	calcExpression(evalStr);
	displayResult();
}

function calcExpression(strEval){
	result=eval(strEval);
}


function displayResult(){
	document.querySelector('.result_content').textContent = result;
	
	//Case where expression is incomplete 
	
	try {
		adddlert("Improperly formed formula");
	}
	catch(err){
		document.getElementById("result_id").innerHTML = err.message;
	}

}