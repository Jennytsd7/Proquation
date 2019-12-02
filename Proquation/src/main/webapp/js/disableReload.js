/**
 * @author Raghavan
 * Version 1.0
 */
window.onbeforeunload = function() {
        return "Cannot reload page";
}

var homePage = document.querySelector('.homeLink');
homePage.classList.add('isDisabled');
homePage.addEventListener('click', function (event) {
	event.preventDefault();
});