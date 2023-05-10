const quizForm = document.getElementById("quiz-form");
const resultDiv = document.getElementById("result");

quizForm.addEventListener("submit", function(event) {
  event.preventDefault();

  const q1 = parseInt(quizForm.elements["q1"].value);
  const q2 = parseInt(quizForm.elements["q2"].value);
  // Adicione mais perguntas aqui

  const totalScore = q1 + q2; // Adicione mais respostas aqui

  let resultClass = "";

  if (totalScore <= 4) {
    resultClass = "good";
  } else if (totalScore <= 6) {
    resultClass = "moderate";
  } else {
    resultClass = "bad";
  }

  resultDiv.className = resultClass;
  result
