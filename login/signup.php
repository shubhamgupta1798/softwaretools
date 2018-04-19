<!DOCTYPE html>
<html>
<head>
	<link rel="icon" type="image/gif" href="tax.png" sizes="100x100"/>
	<title>
		Welcome to TAXIDI
	</title>
<style>
.form{
	border-radius: 25px;
    border: 2px solid #73AD21;

}
body
{
	  background-size: 100% ;
		background-repeat: no-repeat;
}
#rcorners2 {
    border-radius: 25px;
    border: 8px solid black;
    padding: 20px;

}
</style>
<script>
	var cap;
function validateForm(){
	var nam= document.getElementById("name").value;
	var unam=document.getElementById("uname").value;
	var pass=document.getElementById("pass").value;
	var cpass=document.getElementById("cpass").value;
	var mail=document.getElementById("mail").value;
	var cmail=document.getElementById("cmail").value;
	var capti=document.getElementById("capti").value;
	if(!nam){
	alert("Please Enter Your Name");
	document.getElementById("name").focus();
    	return false;
	}
	if(!unam){
	alert("Please Enter Your Username");
	document.getElementById("uname").focus();
    	return false;
	}
	if(!pass){
	alert("Please Enter Your Password");
	document.getElementById("pass").focus();
    	return false;
	}
	if(pass.length<8){
	alert("Password must be 8 characters");
	document.getElementById("cpass").focus();
    	return false;
	}
	if(!cpass){
	alert("Please Enter Confirm Password");
	document.getElementById("cpass").focus();
    	return false;
	}
	if(pass!=cpass){
	alert("Passwords do not match");
	document.getElementById("cpass").focus();
    	return false;
	}
	if(!mail){
	alert("Please Enter Your email id");
	document.getElementById("mail").focus();
    	return false;
	}
	if(!cmail){
	alert("Please Enter confirm Email");
	document.getElementById("cmail").focus();
    	return false;
	}


	if(mail!=cmail){
	alert("Emails do not match");
	document.getElementById("cmail").focus();
    	return false;
	}
	if(cap!=capti){
	alert("Captcha does not match");
	document.getElementById("capti").focus();
	refreshCaptcha();
    	return false;
	}
}
function refreshCaptcha() {
  cap = Math.floor((Math.random()*1000000) +1);
  document.getElementById("capt").innerHTML = cap;
}
</script>
</head>
<body onload="refreshCaptcha()" background="adrenaline.jpg" background-size: 50% 50%;>

	<h1 style="text-align:center;padding:50px 0px;font-size:40px">User Registration</h1>
<form method="post"  name="myform" onsubmit="return validateForm()"  action="" style="width:25%;margin-left:27%;">
<fieldset id="rcorners2" style="background: linear-gradient(to bottom, #a8c9ff 0%, #ccffff 100%);">

<legend><b></b></legend>
<font color="red">* Required field</font>
<br>
<br>
Name:<span style="color:red">*</span>
<input type="text" id="name" style="float:right; margin-right:100px;">
<br>
<br>
Username:<span style="color:red">*</span>
<input type="text" id="uname" name="uname" style="float:right; margin-right:100px;">
<br>
<br>
Password:<span style="color:red">*</span>
<input type="password" id="pass" name="pass" style="float:right; margin-right:100px;" required>
<br>
<br>
Confirm Password:<span style="color:red">*</span>
<input type="password" id="cpass" style="float:right; margin-right:100px;" required>
<br>
<br>
Email Address:<span style="color:red">*</span>
<input type="email"  id="mail" style="float:right; margin-right:100px;" required>
<br>
<br>
Confirm email Address:<span style="color:red">*</span>
<input type="email"  id="cmail" style="float:right; margin-right:100px;" >

<br>
<br>
Captcha: <span style="color:red">*</span>
<p id="capt" style="  margin-top:5px; float:right;margin-right:580px;"></p>
<div style="  margin-top:5px; float:right;margin-right:430px;"><input type="text" id="capti"  required>
<input type="button" value="Refresh" onclick="refreshCaptcha()"></div>
<br>
<br>
<div style="margin-top:70px;">
<input type="Submit" value="Register" id="Register" name="ok" width="25%"> or
<input type="Reset" value="Cancel" name="Cancel" width="25%"></div>
</form>
</body>
<script>
</script>
<?php
session_start();
if(isset($_POST['ok'])){
$con=mysqli_connect("127.0.0.1","root","","login")or
    die("Could not connect: ");
     mysqli_select_db($con,"login")or
    die("Could not select db: ");
		$a=$_POST['uname'];
		echo($a);

		$b=$_POST['pass'];
		echo($b);

$qry = "INSERT INTO log(username, password) VALUES ('$a','$b')";
$result = mysqli_query($con,$qry);


if($result)
	{echo "welcome to taxidi";
		$_SESSION['un']=$_POST['uname'];
		header('Location: login-na.php');
	}
else
	echo ("SORRY... YOU ENTERD WRONG ID AND PASSWORD... PLEASE RETRY... ");


}


?>
</html>
