/**
 * 
 */

var evalStr = '';
var buttons = document.querySelectorAll(".btn");
buttons.foreach(item) {
  item.addEventListener('click',function(){
      evalStr += item.value;
      Arthimetic(evalStr);
  })
}
