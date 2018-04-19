<?php
session_start();
?>
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


</style>
<script>
function fn(){

window.location.assign("");
}
</script>
</head>
<body style="background-color:#dee4e8;">

<ul>
  <img src="tax.png" height="50px" width="50px" style="float-left" align="left">
  <li><a  href="login-nav.html" style="float:left;">Home</a></li>

  <li><a href="user.html" style="float:right;">welcome <?php
echo($_SESSION['un']);
?>
  </li>

  <li><a href="softwaretools-master/nav.html" style="float:right;">Logout</a></li>
  <li><a href="new.html" style="float:left;">About</a></li>
</ul>
<iframe src="softwaretools-master/aaaa.html" height="750" float="left" width="100%" frameborder="0" name="frameset_a"></iframe>

</body>
</html>
