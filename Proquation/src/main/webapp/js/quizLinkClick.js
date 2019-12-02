/**
 * @author Raghavan
 * Version 1.0 
 */
var quizLinks = document.querySelectorAll('.quizLink');
quizLinks.forEach((item)=>{
	item.addEventListener('click', (e)=>{
		var clickedNumber = e.target.innerHTML.charAt(e.target.innerHTML.length - 1);
		sessionStorage.removeItem('quiz_clicked');
		sessionStorage.setItem('quiz_clicked', clickedNumber);
		location.href = "/Proquation/studentViewQuestions.jsp";
	})
});