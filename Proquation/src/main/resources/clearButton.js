/** The clearButton function clears all the buttons that were dragged into the sandbox panel
 * 
 */
var sandbox = document.querySelector(".dragButtons");
var clearButton = document.querySelector(".clearButton");

clearButton.addEventListener("click", () => {
	if(sandbox.children.length != 0) {
		let buttonsPanel = Array.from(sandbox.children);
		buttonsPanel.forEach((element) => {
			sandbox.removeChild(element);
		});
	}
});