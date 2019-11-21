 // @author Janani Anand 
 // version 1 
 // To test the json data for given question

const nextButton = document.querySelector('#next');
const submitButton = document.querySelector('#submit');

next.addEventListener('click', () => {
	loadQuestions();
});

loadQuestions();

function loadQuestions(){
	var quesData = {
			"Questions": {
				"0": {
					"QuestionNumber": "1",
					"Question": "What is the sum of 7+5",
					"Option1": "10",
					"Option2": "11",
					"Option3": "12",
					"Option4": "9",
					"CorrectAnswer": "12"
				},
				"1": {
					"QuestionNumber": "2",
					"Question": "Which of these adds upto 8",
					"Option1": "4+4",
					"Option2": "2+7",
					"Option3": "5+4",
					"Option4": "2+4",
					"CorrectAnswer": "4+4"
				},
				"2": {
					"QuestionNumber": "3",
					"Question": "What is the sum of 5 cents and 1 dime",
					"Option1": "10 cents",
					"Option2": "13 cents",
					"Option3": "11 cents",
					"Option4": "15 cents",
					"CorrectAnswer": "15 cents"
				}
			}
		}
	var questionsJson = sessionStorage.getItem('questions');
	var questionsCount = sessionStorage.getItem('questionsCount');
	if(questionsJson == null && questionsCount == null) {
		//questionsJson = document.querySelector(".questions").innerHTML;
		sessionStorage.setItem('questions', questionsJson);
		questionsCount = 0;
	}
	else
		questionsJson = JSON.parse(sessionStorage.getItem('questions'));
	
	questionsJson = quesData;
	console.log(questionsJson);
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
	
	questionsCount++;
	sessionStorage.setItem('questionsCount', questionsCount);
	sessionStorage.removeItem('questions');
}