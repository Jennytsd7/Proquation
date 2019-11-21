 // @author Janani Anand 
 // version 1 
 // To test the json data for given question
 
var quesData = {
	"Questions": {
		"0": {
			"QuestionNumber": "1",
			"Question": "what",
			"Option1": "a",
			"Option2": "b",
			"Option3": "c",
			"Option4": "d",
			"CorrectAnswer": "d"
		},
		"1": {
			"QuestionNumber": "2",
			"Question": "how",
			"Option1": "a",
			"Option2": "b",
			"Option3": "c",
			"Option4": "d",
			"CorrectAnswer": "c"
		}
	}
}

loadQuestions();

function loadQuestions(){
	var questionJson = sessionStorage.getItem('questions');
	var questionsCount = sessionStorage.getItem('questionsCount');
	if(questionJson == null) {
		//questionsJson = document.querySelector(".questions").innerHTML;
		questionsCount = 0;
	}
	else
		questionsJson = JSON.parse(sessionStorage.getItem('questions'));
	
	questionsJson = quesData;
	
	var currentQuestion = questionsJson['Questions'][questionsCount];
	
	const questionNumber = document.getElementById('questionNumber');
	const question = document.getElementById('question');
	const option1 = document.getElementById('option1');
	const option2 = document.getElementById('option2');
	const option3 = document.getElementById('option3');
	const option4 = document.getElementById('option4');
	const option1label = document.getElementById('option1label');
	const option2label = document.getElementById('option2label');
	const option3label = document.getElementById('option3label');
	const option4label = document.getElementById('option4label');
	
	const correctanswer = currentQuestion['CorrectAnswer'];
	
	questionNumber.innerHTML = "Question: " + currentQuestion['QuestionNumber'];
	question.innerHTML = currentQuestion['Question'];
	option1.value = currentQuestion['Option1'];
	option1label.innerHTML = currentQuestion['Option1'];
	option2.value = currentQuestion['Option2'];
	option2label.innerHTML = currentQuestion['Option2'];
	option3.value = currentQuestion['Option3'];
	option3label.innerHTML = currentQuestion['Option3'];
	option4.value = currentQuestion['Option4'];
	option4label.innerHTML = currentQuestion['Option4'];
    	
    console.log(questionsJson);
    	
}