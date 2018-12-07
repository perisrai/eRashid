<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!Doctype html>
<html>
<head>
	<title>Registration</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assests/css/index.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/assests/css/first.css">

<link rel="stylesheet" href="first.css"><link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
<script
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha256-3edrmyuQ0w65f8gfBsqowzjJe2iM6n0nKciPUp8y+7E="
  crossorigin="anonymous"></script>
  <script src="${pageContext.request.contextPath}/resources/js/all.min.js"></script>
</head>

    <body>
            <header>
            
                <div class="main-head">
                    <h2>Update Form</h2>
                     <img src="${pageContext.request.contextPath}/resources/assests/imgs/nepal.gif"/>
                </div>
                
            </header>
            
<spring:form action="${pageContext.request.contextPath}/update" method="post" modelAttribute="vehicle">
            <nav>
                <div class="main-nav container">
                    <ul>
                        <li><a href="registervehicle">Vehicle Details</a></li>
                        <li><a href="customer.html">Owners Details</a></li>
                        <li><a href="#">Custom Duty Details</a></li>
                    </ul>
                </div>
            </nav>
            
    <section class="vehicle-detail">
            <div class="container">
                <div class="vehicle-content">

                <div class="form-input input-width">
                        <spring:select path="zone" class="input">
                            <option value="">Select Zone</option>
                            <option value="me">Me</option>
                            <option value="ko">Ko</option>
                        </spring:select>
                <span class="focus-input" data-placeholder="Zone"></span>
                        </div>

            <div class="form-input input-width">
                <spring:input type="number"  path="lotno" class="input" />
                <span class="focus-input" data-placeholder="Lot Number"></span>
                </div>
                
                
                <div class="form-input input-width">
                 <spring:select path="type" class="input">
                   
                        <option></option>
                    <option value="pa">Pa</option>
                    <option value="ta">Ta</option>
                    </spring:select>
                    <span class="focus-input" data-placeholder="Type"></span>
                </div>
                
                
                <div class="form-input input-width-lg">
                    <spring:input type="number" path="vnum" class="input" />
                    <span class="focus-input" data-placeholder="Vehicle number"></span>
                </div>
                                       
                
                <div class="form-input">
                    <spring:input type="text" path="importer_name" class="input" />
                    <span class="focus-input" data-placeholder=" Importers Name"></span>
                </div>
                
                <div class="form-input">
                    <spring:input type="text" path="importer_address" class="input"/>
                    <span class="focus-input" data-placeholder="Importers Address"></span>
                </div>
                <div class="form-input">
                     <spring:input type="text" path="manufacturer_name" class="input"/>
                    <span class="focus-input" data-placeholder=" Manufacturer Name"></span>
                </div>
                <div class="form-input">
                      <spring:input type="number" path="manufactured_year" class="input"/>
                    <span class="focus-input" data-placeholder="Manufactured Year"></span>
                </div>
                <div class="form-input">
                      <spring:input type="text" path="vmodel" class="input"/>
                    <span class="focus-input" data-placeholder="Vehicle Model"></span>
                </div> 
                
                <div class="form-input">
                      <spring:input type="number" path="engine_no" class="input"/>
                    <span class="focus-input" data-placeholder="Engine Number"></span>
                </div>
                
                <div class="form-input">
                      <spring:input type="number" path="chesis_no" class="input"/>
                    <span class="focus-input" data-placeholder="Chesis Number"></span>
                </div>

                <div class="form-input">
                    <spring:input type="number" path="cc" class="input"/>
                    <span class="focus-input" data-placeholder="Horse Power C.C"></span>
                </div>

                <div class="form-input">
                   <spring:input type="number" path="no_of_cylinder" class="input"/>
                    <span class="focus-input" data-placeholder="Number of Cylinder"></span>
                </div>

                <div class="form-input">
                    <spring:input type="text" path="vcolor" class="input"/>
                    <span class="focus-input" data-placeholder="Vehicle Colour"></span>
                </div>

                <div class="form-input">
                   <spring:select path="vtype" class="input">
                            <option value="">Select Zone</option>
                            <option value="car">Car</option>
                            <option value="zeep">Zeep</option>
                        </spring:select>
                   <span class="focus-input" data-placeholder="TYpe of Vehicle"></span>
               </div>

               <div class="form-input">
               <spring:input type="number" path="no_of_seats" class="input"/>
                <span class="focus-input" data-placeholder="Number of Seats"></span>
            </div>

                <div class="form">
                 <label>Fuel:</label>
                     <spring:radiobutton path="fuel" value="Petrol"/> Petrol <br>
                     <spring:radiobutton path="fuel" value="Diesel"/> Diesel
                </div>

                <div class="form-input">
                    <spring:input type="number" path="total_weight" class="input"/>
                    <span class="focus-input" data-placeholder="Total Weight (in K.G.)"></span>
                </div>
                <div class="form-input">
                   <spring:input type="number" path="weight_bearing_capacity" class="input"/>
                    <span class="focus-input" data-placeholder="Weight Bearing Capacity (in K.G.)"></span>
                </div>
               
                 
                <div class="form-input">
                        <spring:select path="usages" class="input">
                            <option value="">Select Zone</option>
                            <option value="private">Private</option>
                            <option value="public">Public</option>
                        </spring:select>
                        <span class="focus-input" data-placeholder="Usage"></span>
                </div>
                  
                
                <div class="form-input">
                      <spring:input type="number" path="device_in_vehicle" class="input"/>
                        <span class="focus-input" data-placeholder="Electronics and Communication Device in the Vehicle"></span>
                </div> 
           

            </div>
       </div>
        <section class="customerduty-detail">
            <div class="container">
                <div class="vehicle-content">
    
                        <div class="form-input">
                            <spring:input type="text" path="customduty.cd_name" class="input"/>
                            <span class="focus-input" data-placeholder="Name Of Office"></span>
                        </div>

                        <div class="form-input">
                           <spring:input type="text" path="customduty.cd_address" class="input"/>
                            <span class="focus-input" data-placeholder="Address"></span>
                         </div>

                         <div class="form-input">
                           <spring:input type="number" path="customduty.bill_no" class="input"/>
                            <span class="focus-input" data-placeholder="Bill number"></span>
                        </div> 

                        <div class="form-input">
                            <spring:input type="date" path="customduty.bill_date" class="input"/>
                            <span class="focus-input" data-placeholder="Bill Date"></span>
                        </div>

                        <div class="form-input">
                           <spring:input type="number" path="customduty.pragyapan_no" class="input"/>
                            <span class="focus-input" data-placeholder="Pragyapan number"></span>
                        </div>

                     </div>
                </div>
              </section>
                <section class="owner-detail">
                <div class="container">
                    <div class="vehicle-content">
                            
                        <div class="form-input">
                            <spring:input type="text" path="owner.oname" class="input"/>
                            <span class="focus-input" data-placeholder="Name of owner:"></span>
                        </div>

                        <div class="form-input">
                           <spring:input type="text" path="owner.fname" class="input"/>
                            <span class="focus-input" data-placeholder="Father's Name:"></span>
                         </div>

                         <div class="form-input">
                           <spring:input type="text" path="owner.gfname" class="input"/>
                            <span class="focus-input" data-placeholder="Grandfather's Name:"></span>
                        </div> 

                        <div class="form-input">
                            <spring:input type="date" path="owner.dob" class="input"/>
                            <span class="focus-input" data-placeholder="Date OF Birth:"></span>
                        </div>

                        <div class="form-input">
                           <spring:input type="number" path="owner.p_stateno" class="input"/>
                            <span class="focus-input" data-placeholder="Permanent State no:"></span>
                        </div>

                     </div>
                </div>
                </section>
                <div class="sub_btn" >
     			<button type="submit" onclick="myFunction()" >Update</button>

									<p id="demo"></p>
</div>

    												 
          
           <spring:hidden path="vid"/>
    </spring:form>
    </body>
    <script>
  
    function myFunction() {
      var txt;
      if (confirm("You want to update?????")) {
        txt = "Submitted";
      } else {
        txt = "You pressed Cancel!";
      }
      document.getElementById("demo").innerHTML = txt;
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
           
          
     