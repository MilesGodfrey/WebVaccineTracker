<%-- 
    IS-241 
    Spring 2021 
    The A-Team's Missouri COVID-19 Vaccination Tracker 
    Victor Paletta
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <meta charset="utf-8">
   <link rel="stylesheet" href="styles.css">
   <title>Missouri COVID-19 Vaccination Tracker</title> 
</head>
<body>  
<div id="wrapper">  
<header>  
	<h1>Missouri COVID-19 Vaccination Tracker</h1>  
</header>
<main>
	<h2>New Patient</h2>
        ${msg} ${date}
        <br><br>
<form action="newPatient" method="post"> 
	
<label for="patientID">Patient ID #: </label>
<input type="text" autocomplete="off" name="patientID" id="patientID" required><br><br>

<label for="firstName">First Name: </label>
<input type="text" autocomplete="off" name="firstName" id="firstName" required><br><br>

<label for="middleName">Middle Name: </label>
<input type="text" autocomplete="off" name="middleName" id="middleName" required><br><br>

<label for="lastName">Last Name: </label>
<input type="text" autocomplete="off" name="lastName" id="lastName" required><br><br>

<label for="DOB">DOB: </label>                   
<input type="text" placeholder="yyyy-mm-dd" autocomplete="off" name="DOB" id="DOB" required><br><br>

<label for="sex">Sex: </label>
<select name="sex" id="sex">
    <option value=""></option>
    <option value="Male">Male</option>
    <option value="Female">Female</option>
    <option value="Other">Other</option>
</select><br><br>

<label for="race">Race: </label>
<select name="race" id="race">
    <option value=""></option>
    <option value="Asian">Asian</option>
    <option value="Black">Black</option>
    <option value="White">White</option>
    <option value="Latino">Latino</option>
    <option value="Native American">Native American</option>
    <option value="Pacific Islander">Pacific Islander</option>
</select>
<br><br>

<label for="facility">Facility: </label>
<select name="facility" id="facility">
    <option value=""></option>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
</select>
<br><br>

<label for="city">City: </label>                  
<input type="text" autocomplete="off" name="city" id="city" required><br><br>

<label for="state">State: </label>                  
<input type="text" autocomplete="off" name="state" id="state" value="MO" size="10"><br><br>

<label for="email">Email: </label>                   
<input type="text" autocomplete="off" name="email" id="email" size="30" required><br><br>

<label for="phone">Phone #: </label>
<input placeholder="xxx-xxx-xxxx" type="text" autocomplete="off" name="phone" id="phone" required><br><br>

<label for="vaccine">Vaccine: </label>
<select name="vaccine" id="vaccine">
    <option value=""></option>
    <option value="Pfizer">Pfizer</option>
    <option value="Moderna">Moderna</option>
</select><br><br>
  
<label for="vaccineadminsite">Vaccine Administration Site (on body):</label><br>
<select name="vaccineadminsite" id="vaccineadminsite">
    <option value=""></option>
    <option value="Left Arm">Left Arm</option>
    <option value="Right Arm">Right Arm</option>
</select><br><br>

<label for="dose">Dose:</label>
<select name="dose" id="dose">
    <option value=""></option>
    <option value="1">Dose 1</option>
    <option value="2">Dose 2</option>
</select><br><br>

<label for="admindate">Administration Date: </label>                  
<input placeholder="yyyy-mm-dd" type="text" autocomplete="off" name="admindate" 
       id="admindate" required><br><br>

<label for="adversereact">Adverse Reaction:</label>
<select name="adversereact" id="adversereact">
    <option value=""></option>
    <option value="Yes">Yes</option>
    <option value="No">No</option>
</select><br><br>
<input class="button" type="submit" value="Submit" id="submit"><br><br>
</form>
<nav>
  <a href="next1.jsp" class="button">Back</a>
  <a href="index.jsp" class="button">Log Out</a>
  <a href="https://vaers.hhs.gov/reportevent.html" target="blank" class="button">VAERS</a>
</nav><br>
</main>
<footer>
   <img style="text-align: center; max-width: 150px" src="images/MO.gif" alt="Missouri">
   <p>&copy; 2021 The A-Team</p>
<br>  
</footer> 
</div>
</body>
</html>