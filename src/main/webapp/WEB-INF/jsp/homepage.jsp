<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
<title>first page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/css/index.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
<script
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha256-3edrmyuQ0w65f8gfBsqowzjJe2iM6n0nKciPUp8y+7E="
  crossorigin="anonymous"></script>
</head>
<body>
<header>
  <div class="main-head">
    <h2>E-Rashid</h2>
    <img src="${pageContext.request.contextPath}/resources/assets/imgs/nepal.gif" alt="Nepal Flag">
  </div>
</header>

<nav>
  <div class="main-nav container">
    <ul>
      <li><a href="#">Home</a></li>
      <li><a href="search">Search Vehicle by color</a></li>
       <li><a href="registervehicle">Vehicle Registration</a></li>
        <li><a href="vehicleDetails">All Vehicle Details</a></li>
    </ul>
   


    
    <div class="login">
      <ul>
        <li><a href="adminlogin">Login</a></li>
      </ul>
    </div>
  </div>
</nav>
  

            
      <div class="middle-panel">
      
       <div class="site-wrapper">

      <div class="site-wrapper-inner">

        <div class="container">

          

          <div class="inner cover">
          
            <h1 class="cover-heading">Search By Vehicle Number</h1>
           
            <form  action="search" method="get" class="login-form">
              
              <input class="form-control mr-sm-2" name="vno" type="search" width="400px" placeholder="Search" aria-label="Search"><br/>
               <button class="btn btn-outline-success my-2 my-sm-0"   type="submit">Search</button>
               
               
               </form>
           
          </div>

        </div>

      </div>
      

    </div>
</div>

<footer>
  <div class="container">
    <div class="footer-content">
      <p>PROJECT WORK</p>
  </div>
  </div>
</footer>
</body>
<script>
  (function ($) {
    "use strict";

    $('.input').each(function(){
        $(this).on('blur', function(){
            if($(this).val().trim() != "") {
                $(this).addClass('has-val');
            }
            else {
                $(this).removeClass('has-val');
            }
        })
    })

})(jQuery);
</script>
</html>
