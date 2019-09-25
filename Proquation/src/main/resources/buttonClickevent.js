/**
 * 
 */
var result;
var evalStr = '';
var buttons = document.querySelectorAll(".btn");
buttons.forEach(item => {
  item.addEventListener('click',function(){
      evalStr += item.value;
      calcExpression(evalStr);
  })
});

function calcExpression(strEval) {
	result = eval(strEval);
	displayResult();
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