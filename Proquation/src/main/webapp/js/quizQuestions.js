

/**
 * @author Swarnalatha Srenigarajan, Rahul Suresh
 * version 2
 * This function stores the values entered for
 * each question field and stores the values as a json
 */

const continueButton = document.querySelector('#continueButton');
const submitButton = document.querySelector('#submitButton');

continueButton.addEventListener('click', ()=> {
	submitform();
	location.reload();
});

function submitButtonListener() {
	submitform();
	pageLoad();
	sessionStorage.removeItem('questions');
}

pageLoad();

function pageLoad() {
	const questionsDiv = document.getElementById('questions');
	var questionsJson = sessionStorage.getItem('questions');
	questionsDiv.value = JSON.stringify(questionsJson);
}

function submitform(){
	var questionsJson = sessionStorage.getItem('questions');
	var questionsCount = sessionStorage.getItem('questionsCount');
	if(questionsJson == null) {
		questionsJson = {"Questions":{}};
		questionsCount = 0;
	}
	else {
		questionsJson = JSON.parse(sessionStorage.getItem('questions'));
	}
	console.log(questionsJson);
	const questionNumber = document.getElementById('questionNumber').value;
	const question = document.getElementById('question').value;
	const option1 = document.getElementById('option1').value;
	const option2 = document.getElementById('option2').value;
	const option3 = document.getElementById('option3').value;
	const option4 = document.getElementById('option4').value;
	const correctanswer = document.getElementById('correctAns').value;
    if(questionNumber.length == 0 || question.length == 0 || option1.length == 0 || option2.length == 0 || option3.length == 0 || option3.length == 0 || option4.length == 0 || correctanswer.length == 0) {   	
    	alert("Enter all the fields");
    }
    else {
    	let questionToAdd = {"QuestionNumber": questionNumber,"Question": question,"Option1": option1,"Option2": option2,"Option3": option3,"Option4": option4,"CorrectAnswer": correctanswer};
    	questionsJson["Questions"][questionsCount] = questionToAdd;
    	questionsCount++;
    	console.log(questionsJson["Questions"]);
    	sessionStorage.setItem('questions', JSON.stringify(questionsJson));
    	sessionStorage.setItem('questionsCount', questionsCount);
    }
}