function loginValidate() {
    var user = document.getElementById("username").value;
    var pass = document.getElementById("password").value;

    if (user === "") {
        alert("Username cannot be empty");
        return false;
    }

    if (pass === "") {
        alert("Password cannot be empty");
        return false;
    }

    if (pass.length < 5) {
        alert("Password must be at least 5 characters");
        return false;
    }

    alert("Login Successful!");
    return true;
}
