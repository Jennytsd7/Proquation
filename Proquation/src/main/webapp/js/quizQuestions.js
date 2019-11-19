
/**
 * @author Janani Anand 
 * version 1 
 * This function stores the values entered for
 * each question field and stores the values as a json
 */

function submitform(){
	const questionNumber = document.getElementById('questionNumber').value;
	const question = document.getElementById('question').value;
	const option1 = document.getElementById('option1').value;
	const option2 = document.getElementById('option2').value;
	const option3 = document.getElementById('option3').value;
	const option4 = document.getElementById('option4').value;
	const correctanswer = document.getElementById('correctanswer').value;
	var questionsJson = {};
    if(questionNumber.length == 0 || question.length == 0 || option1.length == 0 || option2.length == 0 || option3.length == 0 || option3.length == 0 || option4.length == 0 || correctanswer.length == 0) {   	
    }
    else {
    	questionsJson = {
    			"Questions" : [
    			    			  {"QuestionNumber": questionNumber,
    			    				"Question": question,
    			    				"Option1": option1,
    			    				"Option2": option2,
    			    				"Option3": option3,
    			    				"Option4": option4,
    			    				"CorrectAnswer": correctanswer}
    			    				]
    			    	}
    	
    }
    console.log(questionsJson);
    	
}