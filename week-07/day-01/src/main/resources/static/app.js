var paragraph = document.querySelector("p");

paragraph.style.fontSize = Math.random() * 100 + 30 + "px";
var red = Math.random() * 256;
var green = Math.random() * 256;
var blue = Math.random() * 256;
paragraph.style.color = "rgb(" + red + ", " + green + ", " + blue + ")";