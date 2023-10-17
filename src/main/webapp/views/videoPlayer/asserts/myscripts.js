document.addEventListener("DOMContentLoaded", function () {
    var button = document.getElementById("dropdown-button");
    var menu = document.getElementById("dropdown-menu");

    button.addEventListener("click", function () {
        if (menu.style.display === "none" || menu.style.display === "") {
            menu.style.display = "block";
        } else {
            menu.style.display = "none";
        }
    });
});
