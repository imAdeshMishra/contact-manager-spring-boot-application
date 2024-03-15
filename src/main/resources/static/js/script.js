console.log("This is script file");

setTimeout(function () {
  var alertMessage = document.getElementById("alertMessage");
  if (alertMessage) {
    alertMessage.style.display = "none";
  }
}, 2000);

function validateName() {
  var nameField = document.getElementById("name_field");
  var errorMessage = document.getElementById("name_error_message");
  if (!nameField.value) {
    errorMessage.textContent = "Name is required";
    nameField.classList.add("is-invalid");
    return false;
  } else {
    errorMessage.textContent = ""; // Clear error message
    nameField.classList.remove("is-invalid");
    return true;
  }
}

document
  .getElementById("register_form")
  .addEventListener("submit", function (event) {
    if (!validateName()) {
      event.preventDefault(); // Prevent form submission if validation fails
      var errorMessage = document.getElementById("name_error_message");
      errorMessage.style.display = "block"; // Show the error message
    }
  });
