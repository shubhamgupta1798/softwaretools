<!DOCTYPE html>
<html>
<head>
  <link rel="icon" type="image/gif" href="tax.png" sizes="100x100"/>
  <title>
    Welcome to TAXIDI
  </title>
<style>

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color:#dee4e8;
}
.form{
	border-radius: 25px;
    border: 1px solid #73AD21;

}
li a {
    display: block;
    color: black;
    text-align: center;
    padding: 14px 16px;
      background-color: #dee4e8;
    text-decoration: none;
}

a:hover:not(.active) {

    background-color:#8e949e;
}
button{
  background-color: #dee4e8;
  font-size:20px;
  text-decoration: none;

}
button:hover:not(.active)
{
  background-color:#8e949e;
}
.a11
{
	background-color:#dee4e8;
    border: none;

    padding: 10px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
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
function newDoc() {
    window.location.assign("softwaretools-master/nav.html");
}
	var cap;
function validateForm(){
	//var nam= document.getElementById("name").value;
	var unam=document.getElementById("uname").value;
	var pass=document.getElementById("pass").value;
	//var cpass=document.getElementById("cpass").value;
	//var mail=document.getElementById("mail").value;
	//var cmail=document.getElementById("cmail").value;
	//var capti=document.getElementById("capti").value;

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

}
function myfn()
{
window.location.assign("softwaretools-master/nav.html");
}

</script>
</head>
<body onload="refreshCaptcha()" background="adrenaline.jpg" background-size: 50% 50%;>
	<ul>
    <img src="tax.png" height="50px" width="50px" style="float-left" align="left">
	  <li><a  href="softwaretools-master/nav.html" style="float:left;">Home</a></li>
	  <li><button class="a11" style="float:right;" type="login" onclick="fn()" value="Login">Login</button></li>
	  <li><a href="signup1.html" style="float:right;">Sign-Up</a></li>

	  <li><a href="new.html" style="float:left;">About</a></li>
	</ul>

<br><br>
	<br><br>
  <br><br>
  <br><br>
  <br><br>
  <br><br>
  <br><br>
  <br><br>
  <br><br>
  <br><br>
<form method="post" name="myform" onsubmit="return validateForm()"  action="" style="width:25%;margin-left:38%;">
<fieldset id="rcorners2" style="background: linear-gradient(to bottom, #a8c9ff 0%, #ccffff 100%);">

<legend><b></b></legend>
<font color="red">* Required field</font>

<br>
Username:<span style="color:red">*</span>
<input type="text" id="uname" name="uname"style="float:right; margin-right:100px;">
<br>
<br>
Password:<span style="color:red">*</span>
<input type="password" name="pass" id="pass" style="float:right; margin-right:100px;" required>
<br>

<div style="margin-top:70px;">
<input type="Submit" value="Login" id="Register" name="ok" width="25%"> or
<input type="button" value="Cancel" onclick="myfn()" name="Cancel" width="25%"></div>
</form>

<?php
session_start();
if(isset($_POST['ok'])){
$con=mysqli_connect("127.0.0.1","root","")or
    die("Could not connect: " . mysql_error());
    mysqli_select_db($con,"login")or
    die("Could not select db: " . mysql_error());
$a=$_POST['uname'];
//echo($a);

$b=$_POST['pass'];
//echo($b);
$query = mysqli_query($con,"SELECT * FROM log where username = '$a' AND password = '$b'") or die("no database available");

 $row = mysqli_fetch_array($query) or die("Not a user???");


if(!empty($a) AND !empty($b))
 {
   echo "WElcome to Taxidi".$_POST['uname'];
   $_SESSION['un']=$_POST['uname'];
	 header('Location: login-na.php');

 }

else
 {
 	echo "SORRY... YOU ENTERD WRONG ID AND PASSWORD... PLEASE RETRY...";
  }

}
?>

</html>
