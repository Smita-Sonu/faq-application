const expandBtns = document.querySelectorAll(".expand-btn");

expandBtns.forEach(btn => btn.addEventListener("click", onclick));

function onclick(event) {
    const currentBtn = event.target;

    currentBtn.innerText = currentBtn.innerText === "+" ? "-" : "+";

    const currentParent = currentBtn.closest('.faq');

    const currentAnswer = currentParent.querySelector(".answer");
    currentAnswer.classList.toggle('hide');
}