/** @author Janani Anand, Raghavan Sreenivasa
 * 	version 1.2 
 *  The clearButton function clears all the buttons that were dragged into the sandbox panel
 * 
 */
const sandbox = document.querySelector(".dragButtons");
const clearButton = document.querySelector(".clearButton");
const deleteButton = document.querySelector(".deleteButton");

clearButton.addEventListener("click", () => {
	if(sandbox.children.length != 0) {
		let buttonsPanel = Array.from(sandbox.children);
		buttonsPanel.forEach((element) => {
			sandbox.removeChild(element);
			updateEvalStr('');
			updateStr('');
		});
	}
});

deleteButton.addEventListener("click", () => {
	if(sandbox.children.length != 0) {
		let buttonsPanel = sandbox.children;
		sandbox.removeChild(buttonsPanel[buttonsPanel.length - 1]);
		removeLastfromEvalStr();
	}
});