/** @author Swarnalatha Sreenigarajan, Raghavan Sreenivasa
 *  version 1.0
 *  This handles draggable functionality of buttons
 */

var button = document.querySelector('#num_1');
var container = document.querySelector('.dragButtons');

/* Look for drag events on the page */
document.addEventListener("drag", function(event) {

}, false);

/* Get the element that is being dragged */
document.addEventListener("dragstart", function(event) {
    dragged = event.target;
}, false);

/* Check for drag event to stop */
document.addEventListener("dragover", function(event) {
    event.preventDefault();
}, false);

/* If the button is dropped in the sandbox panel, clone the button and append in the HTML */
document.addEventListener("drop", function(event) {
    event.preventDefault();
    if (event.target.className == "dragButtons") {
        let cloneButton = dragged.cloneNode(true);
        cloneButton.removeAttribute('draggable');
        event.target.appendChild(cloneButton);
        updateStr(cloneButton.value);
    }
}, false);