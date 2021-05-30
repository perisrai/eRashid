<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Vehicle Display</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/css/first.css">
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
                       <ul>
                        <button onclick="goBack()">Go Back</button>
                       </ul>
                        
                    </ul>
               
                <div class="login">
                    <ul>
                      <li><a href="">Logout</a></li>
                    </ul>
                  </div>
                </div>  
            </nav>

    <section class="vehicle-detail">
            <div class="container">
                <div class="vehicle-content">
                    <div class="seprate">
                        <div class="abc-20">
                            <div class="title">
                                <h4>Vehicle no:</h4>
                            </div>
                        </div>
                        <div class="abc-30">
                            <p>${vno}</p>
                        </div>

                        <div class="abc-20">
                                <div class="title">
                                    <h4>Manufacturer Name:</h4>
                                </div>
                            </div>
                            <div class="abc-30">
                                <p>${vmodel}</p>
                            </div>

                            <div class="abc-20">
                                    <div class="title">
                                        <h4>Manufactured Year:</h4>
                                    </div>
                                </div>
                                <div class="abc-30">
                                    <p>Display Here</p>
                                </div>
        
                                <div class="abc-20">
                                        <div class="title">
                                            <h4>Engine Type:</h4>
                                        </div>
                                    </div>
                                    <div class="abc-30">
                                        <p>Display Here</p>
                                    </div>

                             <div class="abc-20">
                                    <div class="title">
                                        <h4>Engine Number:</h4>
                                    </div>
                                </div>
                                <div class="abc-30">
                                    <p>Display Here</p>
                                </div>
        
                                <div class="abc-20">
                                        <div class="title">
                                            <h4>Chessis Number:</h4>
                                        </div>
                                    </div>
                                    <div class="abc-30">
                                        <p>Display Here</p>
                                    </div>       

                                    <div class="abc-20">
                                            <div class="title">
                                                <h4>Usage:</h4>
                                            </div>
                                        </div>
                                        <div class="abc-30">
                                            <p>Display Here</p>
                                        </div>
                
                                        <div class="abc-20">
                                                <div class="title">
                                                    <h4>Type:</h4>
                                                </div>
                                            </div>
                                            <div class="abc-30">
                                                <p>Display Here</p>
                                            </div>  
                                            
                                      
                            <div class="abc-70">
                                    <div class="title">
                                        <h4>Electronics and Communication Device In the Vehicle:</h4>
                                    </div>
                                </div>
                                <div class="abc-20">
                                    <p>Display Here</p>
                                </div>    
                                
                                <div class="abc-20">
                                        <div class="title">
                                            <h4>Registered Date:</h4>
                                        </div>
                                    </div>
                                    <div class="abc-30">
                                        <p>Display Here</p>
                                    </div>     

                </div>         
            </div>

            <div class="vehicle-content">
                    <div class="seprate">
                        <div class="abc-20">
                            <div class="title">
                                <h4>Net Weight:</h4>
                            </div>
                        </div>
                        <div class="abc-30">
                            <p>Display Here</p>
                        </div>

                        <div class="abc-20">
                                <div class="title">
                                    <h4>Weight Bearing Capacity:</h4>
                                </div>
                            </div>
                            <div class="abc-30">
                                <p>Display Here</p>
                            </div>

                            <div class="abc-20">
                                    <div class="title">
                                        <h4>Number of Seats:</h4>
                                    </div>
                                </div>
                                <div class="abc-30">
                                    <p>Display Here</p>
                                </div>
        
                               
                </div>         
            </div>

            <div class="vehicle-content">
                    <div class="seprate">
                        <div class="abc-20">
                            <div class="title">
                                <h4>Owner's Name:</h4>
                            </div>
                        </div>
                        <div class="abc-30">
                            <p>Display Here</p>
                        </div>

                        <div class="abc-20">
                                <div class="title">
                                    <h4>Owner's Address:</h4>
                                </div>
                            </div>
                            <div class="abc-30">
                                <p>Display Here</p>
                            </div>

                            <div class="abc-20">
                                    <div class="title">
                                        <h4>Phone number:</h4>
                                    </div>
                                </div>
                                <div class="abc-30">
                                        <p>Display Here</p>
                                    </div>
                                
                </div>         
            </div>
            </div>
       </div>
    </section>
<div class="sub-btn">
    <button value="Submit"><a href="detailsupdate.html">Update</a></button>
</div>
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
  
    function goBack() {
        window.history.back()
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