// Your existing code
const names = document.querySelector(".names");
const email = document.querySelector(".email");
const joined = document.querySelector(".joined");
const navBar = document.querySelector("nav");
const navToggle = document.querySelector(".navToggle");
const navLinks = document.querySelectorAll(".navList");
const darkToggle = document.querySelector(".darkToggle");
const body = document.querySelector("body");

body.classList.toggle('dark');



// Function to toggle the logo based on the theme
function toggleLogo() {
    const darkLogo = document.querySelector(".logo.dark-logo");
    const lightLogo = document.querySelector(".logo.light-logo");

    if (body.classList.contains('dark')) {
        darkLogo.style.display = "block";
        lightLogo.style.display = "none";
    } else {
        darkLogo.style.display = "none";
        lightLogo.style.display = "block";
    }
}

// Event listeners
navToggle.addEventListener('click', () => {
    navBar.classList.toggle('close');
});

navLinks.forEach(function (element) {
    element.addEventListener('click', function () {
        navLinks.forEach((e) => {
            e.classList.remove('active');
            this.classList.add('active');
        });
    });
});

darkToggle.addEventListener('click', () => {
    body.classList.toggle('dark');
    toggleLogo(); // Call the function to toggle the logo
});
    
