var doneToggler = document.getElementById("is-active");
var doneCheckbox = document.getElementById("is-active-checkbox");
var importantToggler = document.getElementById("is-important");
var importantCheckbox = document.getElementById("is-important-checkbox");
var todos = document.getElementsByTagName("li");

var hideDoneTasks = function () {
    for (var i = 0; i < todos.length; i++) {
        if (todos[i].children[1].classList.contains("done")) {
            todos[i].classList.add("hidden");
        }
    }
}
var showAllTasks = function () {
        for (var i = 0; i < todos.length; i++) {
            todos[i].classList.remove("hidden");
        }
}

var hideUnimportantTasks = function () {
    for (var i = 0; i < todos.length; i++) {
        if (!todos[i].children[2].firstElementChild.classList.contains("fa-exclamation-circle")) {
            todos[i].classList.add("hidden");
        }
    }
}

doneToggler.addEventListener("click", function (ev) {
    doneCheckbox.checked ? showAllTasks() : hideDoneTasks();
})

importantToggler.addEventListener("click", function (ev) {
    doneCheckbox.disabled = !doneCheckbox.disabled;
    importantCheckbox.checked ? showAllTasks() : hideUnimportantTasks();
    if (doneCheckbox.checked){
        hideDoneTasks();
    }
})




