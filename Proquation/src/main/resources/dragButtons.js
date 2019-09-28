var button = document.querySelector('#num_1');
var container = document.querySelector('.dragButtons');

/* events fired on the draggable target */
document.addEventListener("drag", function(event) {

}, false);

document.addEventListener("dragstart", function(event) {
    // store a ref. on the dragged elem
    dragged = event.target;
    // make it half transparent
    //event.target.style.opacity = .5;
}, false);

/* events fired on the drop targets */
document.addEventListener("dragover", function(event) {
    // prevent default to allow drop
    event.preventDefault();
}, false);

document.addEventListener("drop", function(event) {
    // prevent default action (open as link for some elements)
    event.preventDefault();
    // move dragged elem to the selected drop target
    if (event.target.className == "dragButtons") {
        //event.target.style.background = "";
        //dragged.parentNode.removeChild( dragged );
        let cloneButton = dragged.cloneNode(true);
        event.target.appendChild(cloneButton);
    }
}, false);