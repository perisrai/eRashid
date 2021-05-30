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
                  <img src="${pageContext.request.contextPath}/resources/assests/imgs/automobile.png" alt="">
          <h2>E-Rashid</h2>
            <img src="${pageContext.request.contextPath}/resources/assests/imgs/nepal.gif" alt="Nepal Flag">
                </div>
            </header>

            <nav>
                <div class="main-nav container">
                    <ul>
                        
                        <li><a href="registerVehicle">Registration</a></li>
                        <li><a href="ownertransfer">Ownership Transfer</a></li>
                        <li><a href="vehicleDetails">See All Vehicle Details</a></li>
                       
                    </ul>
                    <div class="login">
                        <ul>
                          <li><a href="/">Logout</a></li>
                        </ul>
                      </div>
                </div>
            </nav>
            
            
  
    
    <section class="vehicle-detail">
            <div class="container">
                <div class="vehicle-content">
                    <div class="seprate">
                        <div class="abc-10">
                        
                         <spring:form action="search" method="get"  modelAttribute="vehicle">
              
              <input class="form-control mr-sm-2" name="vno" type="search" width="800px" placeholder="eg:ka6pa9878" aria-label="Search"><br/>
              
            
              <div class="sub-btn">
    <button align="center" value="Submit">Search</button>
</div>

   <!-- <button value="Submit"><a href="details/details.html">Next</a> </button> --> 

               
               </spring:form>   
                                       
                        
                   
            </div>
            </div>
            </div>
    </div>
    </section>
   

  


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