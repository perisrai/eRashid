
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Admin page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"  href="${pageContext.request.contextPath}/resources/assests/css/first.css">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
<script
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha256-3edrmyuQ0w65f8gfBsqowzjJe2iM6n0nKciPUp8y+7E="
  crossorigin="anonymous"></script>
  </head>

<body>
      <header>
            <div class="main-head">
                <img src="../images/automobile.png" alt="Car">        
                <h2>E-Rashid</h2>
                <img src="../images/nepal.gif" alt="Nepal Flag">
            </div>
        </header>

        <nav>
                <div class="main-nav container">
                    <ul>
                        <li><a href="../index.html">Vehicle Details</a></li>
                        <li><a href="../Registration/registration.html">Registration</a></li>
                        <li><a href="../owner/ownerno.html">Ownership Transfer</a></li>
                    </ul>
                    <div class="login">
                        <ul>
                          <li><a href="#">Logout</a></li>
                        </ul>
                      </div>
                </div>
            </nav>

<section class="vehicle-detail">
        <div class="container">
            <div class="vehicle-content">
                    
                <div class="form-input">
                    <input type="text"  class="input">
                    <span class="focus-input" data-placeholder="Owners Name"></span>
                </div>
                
                <div class="form-input">
                        <input type="text" class="input">
                        <span class="focus-input" data-placeholder="Fathers Name"></span>
                </div>

                <div class="form-input">
                        <input type="text" class="input">
                        <span class="focus-input" data-placeholder="Grand-Fathers Name"></span>
                </div>

                <div class="form-input">
                        <input type="date" class="input">
                        <span class="focus-input" data-placeholder="Date of Birth"></span>
                </div>

                <div class="form-input">
                        <input type="number" class="input">
                        <span class="focus-input" data-placeholder="Mobile number"></span>
                </div>

                <div class="form-input">
                        <input type="number" class="input">
                        <span class="focus-input" data-placeholder="State number"></span>
                </div>

               <h3>Permanent Address : </h3>
                
               <div class="form-input">
                        <input type="text" class="input">
                        <span class="focus-input" data-placeholder="Zone"></span>
                </div>

                <div class="form-input">
                        <input type="text" class="input">
                        <span class="focus-input" data-placeholder="District"></span>
                </div>

                <div class="form-input">
                        <input type="text" class="input">
                        <span class="focus-input" data-placeholder="V.D.C / Municipality"></span>
                </div>

                <div class="form-input">
                        <input type="number" class="input">
                        <span class="focus-input" data-placeholder="Ward number"></span>
                </div>

                <div class="form-input">
                        <input type="text" class="input">
                        <span class="focus-input" data-placeholder="Tole"></span>
                </div>

                <div class="form-input">
                        <input type="number" class="input">
                        <span class="focus-input" data-placeholder="Home number"></span>
                </div>

                <div class="form-input">
                        <input type="number" class="input">
                        <span class="focus-input" data-placeholder="Phone number"></span>
                </div>

                <h3>Temporary Address : </h3>
                
                <div class="form-input">
                         <input type="text" class="input">
                         <span class="focus-input" data-placeholder="Zone"></span>
                 </div>
 
                 <div class="form-input">
                         <input type="text" class="input">
                         <span class="focus-input" data-placeholder="District"></span>
                 </div>
 
                 <div class="form-input">
                         <input type="text" class="input">
                         <span class="focus-input" data-placeholder="V.D.C / Municipality"></span>
                 </div>
 
                 <div class="form-input">
                         <input type="number" class="input">
                         <span class="focus-input" data-placeholder="Ward number"></span>
                 </div>
 
                 <div class="form-input">
                         <input type="text" class="input">
                         <span class="focus-input" data-placeholder="Tole"></span>
                 </div>
 
                 <div class="form-input">
                         <input type="number" class="input">
                         <span class="focus-input" data-placeholder="Home number"></span>
                 </div>
 
                 <div class="form-input">
                         <input type="number" class="input">
                         <span class="focus-input" data-placeholder="Phone number"></span>
                 </div>

            </div>
        </div>
</section>

<div class="sub-btn">
                <button value="Submit">Save</a></button>
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