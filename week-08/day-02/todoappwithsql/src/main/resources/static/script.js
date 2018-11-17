const doneToggler = document.getElementById("is-active");
const doneCheckbox = document.getElementById("is-active-checkbox");
const importantToggler = document.getElementById("is-important");
const importantCheckbox = document.getElementById("is-important-checkbox");
const todos = Array.from(document.querySelectorAll("li"));

const showAllTasks = function () {
    for (let todo of todos) {
        todo.classList.remove("hidden")
    }
}

const hideDoneTasks = function () {
    let doneTasks = document.querySelectorAll(".done");
    doneTasks.forEach(t => t.parentElement.classList.add("hidden"));
}

const hideUnimportantTasks = function () {
    let unimportantTasks = todos.filter(t => !t.children[2].children[0].classList.contains("fa-exclamation-circle"));
    unimportantTasks.forEach(t => t.classList.add("hidden"));
}

doneToggler.addEventListener("click", function () {
    if (!importantCheckbox.checked) {
        if (doneCheckbox.checked) {
            showAllTasks();
        } else {
            hideDoneTasks();
        }
    }
})

importantToggler.addEventListener("click", function () {
    doneCheckbox.disabled = !doneCheckbox.disabled;
    if (importantCheckbox.checked) {
        showAllTasks();
    } else {
        hideUnimportantTasks();
    }
    if (doneCheckbox.checked) {
        hideDoneTasks();
    }
})




