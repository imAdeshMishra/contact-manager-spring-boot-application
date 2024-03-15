console.log("This is script file");

setTimeout(function () {
  var alertMessage = document.getElementById("alertMessage");
  if (alertMessage) {
    alertMessage.style.display = "none";
  }
}, 2000);
