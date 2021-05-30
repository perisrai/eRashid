<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="${pageContext.request.contextPath}/resources/assests/css/first.css" />
    <script src="${pageContext.request.contextPath}/resources/js/jQuery.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/proper.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/custom.js"></script>
    
</head>
<body>
    
     <header>
                <div class="main-head">
                  <img src="${pageContext.request.contextPath}/resources/assests/imgs/automobile.png" alt="">
          <h2>E-Rashid</h2>
            <img src="${pageContext.request.contextPath}/resources/assests/imgs/nepal.gif" alt="Nepal Flag">
                </div>
 
 
            </header>
 <nav>
		 <div class="main-nav container">
            <ul>
                <li><a href="../index.html">Home</a></li>            
            </ul>
            <div class="login">
                <ul>
                  <li><a href="#">Logout</a></li>
                </ul>
              </div>
        </div>
    </nav>
<form action="registerByVehicletype" method="post" name="vehicletype">
    <section class="reg-banner">
        <h2>Vehicle Registration Form</h2>
    </section>

    <section class="vehicle-detail">
            <div class="container">
                <div class="vehicle-content">
                    <h4>Select Wheelers</h4>
                        <div class="sub-btn">
                             <input type="button" name="conf" value="Two Wheeler" onclick="doSubmitTwo();">   
                        </div>
                        <div class="sub-btn">
                             <input type="button" class="sub-btn" name="conf" value="Four Wheeler" onclick="doSubmitFour();">   
                                                 </div>
                                           
                                                 
                        <!--  <div class="sub-btn">
                           <a href="twoWheeler">Two Wheelers</a>
                        </div>    
                        <div class="sub-btn">
                            <button type="submit">Six Wheelers</button>
                        </div>-->
                </div>
            </div>
        </section>

</form>
    <footer>
        <div class="container">
            <div class="footer-content">
                <p>PROJECT WORK</p>
            </div>
        </div>
    </footer>


</body>
<script>
function doSubmitTwo(){
var actionURL ="${pageContext.request.contextPath}/twoWheeler";
// perform your operations

vehicletype.submit(actionURL); OR
vehicletype.submit();
}


</script> 
<script>
function doSubmitFour(){
var actionURL ="${pageContext.request.contextPath}/fourWheeler";
// perform your operations

vehicletype.submit(actionURL); OR
vehicletype.submit();
}


</script> 
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