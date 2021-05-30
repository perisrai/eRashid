<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Two Wheeler Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet"  href="${pageContext.request.contextPath}/resources/assests/css/first.css">
     <script src="${pageContext.request.contextPath}/resources/js/jQuery.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/proper.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/custom.js"></script>
    
   
    
</head>
<body>
    
    <header>
        <div class="main-head">
                <img src="${pageContext.request.contextPath}/resources/assests/imgs/automobile.png" alt="Car">
            <h2>E-Rashid</h2>
            <img src="${pageContext.request.contextPath}/resources/assests/imgs/nepal.gif" alt="Nepal Flag">
        </div>
    </header>
  
    <spring:form action="${pageContext.request.contextPath}/update" method="post"  modelAttribute="vehicle">

    <nav>
        <div class="main-nav container">
      
            <ul>
                <li><a href="${pageContext.request.contextPath}/adminhomepage">Home</a></li>
            </ul>
            
            <div class="login">
                <ul>
                  <li><a href="/">Logout</a></li>
                </ul>
              </div>
        </div>
    </nav>

    <section class="reg-banner">
        <h2>Vehicle Registration Form</h2>
    </section>
<section>
    <section class="vehicle-detail">
    <section class="register">
        <div class="container">
            <div id="accordion">
                <div class="card">
                    <div class="card-header active">
                        <a class="card-link" data-toggle="collapse" href="#collapseOne">Vehicle</a>
                    </div>
                    <div class="card-header">
                        <a class="card-link" data-toggle="collapse" href="#collapseTwo" aria-controls="collapseTwo">Owner</a>
                    </div>
                    <div class="card-header">
                        <a class="card-link" data-toggle="collapse" href="#collapseThree" aria-controls="collapseThree">Custom Duty</a>
                    </div>
                    
                    
                </div>
                <div class="card">
                    <div id="collapseOne" class="collapse show" data-parent="#accordion" aria-labelledby="headingOne">
                        <div class="card-body">
                            <section class="vehicle-detail">
                                <div class="container">
                                    <div class="vehicle-content">
                                        <div class="seprate">
                                            <div class="abc-10">
                                                <div class="vin">
                                                    <p>Vehicle No.:</p>
                                                </div>
                                            </div>
                                            <div class="form-input abc-20">
                                                <spring:select path="zone" class="input">
                            <option value="">Select Zone</option>
                            <option value="me">ME</option>
                            <option value="ko">KO</option>
                             <option value="sa">SA</option>
                             <option value="ja">JA</option>
                             <option value="ba">BA</option>
                            <option value="na">NA</option>
                             <option value="ga">GA</option>
                             <option value="lu">LU</option>
                             <option value="dh">DH</option>
                             <option value="ra">RA</option>
                               <option value="bhe">BHE</option>
                                <option value="ka">KA</option>
                                <option value="se">SE</option>
                              <option value="ma">MA</option>
                            
                        </spring:select>
                          <span class="focus-input" data-placeholder="Zone"></span>
                                            </div>
                        
                                            <div class="form-input abc-20">
                                                <spring:input type="number" path="lotno" class="input"/>
                                                <span class="focus-input" data-placeholder="Lot number"></span>
                                            </div>
                                                                                                                             
                                            
                                                                                        
                                            <div class="form-input abc-20">
                                                 <spring:select path="type" class="input">
                                                <option></option>
                                    <!-- private vehicles which are solely for personal use have a red license plate with white letters.     -->
                                                <option value="pa">PA</option>  <!--  for motorcycle -->
                                                <option value="ch">CH</option>  <!--  for light vehicle -->
                                                <option value="ka">KA</option>  <!--  for heavy vehicle -->
                                    <!-- Private vehicles used for commercial purposes have black license plates with white letters -->
                                                <option value="ja">JA</option>  <!--  for light vehicle -->
                                                <option value="kh">KH</option>  <!--  for heavy vehicle -->

                                                </spring:select>
                                                <span class="focus-input" data-placeholder="Type"></span>
                                            </div>
                                            
                                            <div class="form-input abc-20">
                                                 <spring:input type="number" path="vnum" class="input"/>
                                                <span class="focus-input" data-placeholder="Vehicle number"></span>
                                            </div>
                                        </div>         
                                        
                                       
                                        <div class="form-input">
                                        <spring:input type="text" path="importerName" class="input" />
                                            <span class="focus-input" data-placeholder=" Importers Name"></span>
                                        </div>
                        
                                        <div class="form-input">
                                            <spring:input type="text" path="importerAddress" class="input"/>
                                            <span class="focus-input" data-placeholder="Importers Address"></span>
                                        </div>
                        
                                        <div class="form-input">
                                            <spring:input type="text" path="manufacturerName" class="input"/>
                                            <span class="focus-input" data-placeholder=" Manufacturer Name"></span>
                                        </div>
                                        
                                        <div class="form-input">
                                            <spring:input type="number" path="manufacturedYear" class="input"/>
                                            <span class="focus-input" data-placeholder="Manufactured Year"></span>
                                        </div>
                                        
                                        <div class="form-input">
                                            <spring:input type="text" path="vmodel" class="input"/>
                                            <span class="focus-input" data-placeholder="Vehicle Model"></span>
                                        </div> 
                                        
                                        <div class="form-input">
                                           <spring:input type="number" path="engineNo" class="input"/>
                                            <span class="focus-input" data-placeholder="Engine Number"></span>
                                        </div>
                                        
                                        <div class="form-input">
                                            <spring:input type="number" path="chesisNo" class="input"/>
                                            <span class="focus-input" data-placeholder="Chesis Number"></span>
                                        </div>
                                        
                                        <div class="form-input">
                                            <spring:input type="number" path="cc" class="input"/>
                                            <span class="focus-input" data-placeholder="Horse Power C.C"></span>
                                        </div>
                                        
                                        <div class="form-input">
                                            <spring:input type="number" path="noOfCylinders" class="input"/>
                                            <span class="focus-input" data-placeholder="Number of Cylinder"></span>
                                        </div>
                                        
                                        <div class="form-input">
                                           <spring:input type="text" path="vcolor" class="input"/>
                                            <span class="focus-input" data-placeholder="Vehicle Colour"></span>
                                        </div>
                                        <div class="form-input">
                                            <spring:select path="vtype" class="input">
                                            
                                                <option>--Select Vehicle Type--</option>
                                   
                                                <option value="Two Wheeler">Two Wheeler</option>  
                                                
                                                <option value="Four Wheeler">Four Wheeler</option>  
                                          </spring:select>
                                           <span class="focus-input" data-placeholder="Vehicle Type"></span>
                                           </div>

                                        <div class="form-input">
                                            <spring:select path="vehicletype.twoWheeler" class="input">
                                            
                                                <option>--Select Sub Vehicle Type--</option>
                                   
                                                 <option value="Motorcycle">Motorcycle</option>  
                                               
                                                <option value="Moped">Moped</option>  
                                                 <option value="car">Car</option>
                            					<option value="van">Van</option>
                            					 <option value="micro bus">Micro Bus</option>  
                                                 <option value="car">Car</option>
                                          </spring:select>
                                           <span class="focus-input" data-placeholder="Sub Vehicle Type"></span>
                                       </div>
                         
                                       <div class="form-input">
                                            <spring:input type="number" path="noOfSeats" class="input"/>
                                            <span class="focus-input" data-placeholder="Number of Seats"></span>
                                        </div>
                                       
                                        <div class="form">
                                            <spring:label path="fuel">Fuel:</spring:label>
                                            <spring:radiobutton path="fuel" class="input" value="Petrol"/>Petrol
                                             <spring:radiobutton path="fuel" class="input" value="Diesel"/>Diesel
                                             
                                        </div>
                        
                                        <div class="form-input">
                                            <spring:input type="number" path="totalWeight" class="input"/>
                                            <span class="focus-input" data-placeholder="Total Weight (in K.G.)"></span>
                                        </div>
                        
                                        <div class="form-input">
                                            <spring:input type="number" path="weightBearingCapacity" class="input"/>
                                            <span class="focus-input" data-placeholder="Weight Bearing Capacity (in K.G.)"></span>
                                        </div>
                                         
                                        <div class="form-input">
                                            <spring:input type="date" path="registeredDate" class="input"/>
                                            <span class="focus-input" data-placeholder="Registerd Date"></span>
                                        </div>
                                        
                                        
                                        <div class="form-input">
                                        <spring:select path="usages" class="input">
                            <option value="">Select Zone</option>
                            <option value="Private">Private</option>
                            <option value="Public">Public</option>
                            <option value="Government">Government</option>
                            <option value="Tourist">Tourist</option>
                            <option value="NGO">NGO</option>
                            <option value="INGO">INGO</option>
                        </spring:select>
                                            
                                            <span class="focus-input" data-placeholder="Usage"></span>
                                        </div>
                                                
                                        <div class="form-input">
                                             <spring:input type="text" path="deviceInVehicle" class="input"/>
                                            <span class="focus-input" data-placeholder="Electronics and Communication Device in the Vehicle"></span>
                                        </div>
                                    </div>
                                </div>
                            </section>
                            
                        </div>
                    </div>
                    <div id="collapseTwo" class="collapse" data-parent="#accordion" aria-labelledby="headingTwo">
                        <div class="card-body">
                            <section class="vehicle-detail">
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
                             <spring:input type="number" path="owner.mobileNumber" class="input"/>
                               <span class="focus-input" data-placeholder="Mobile Number"></span>
                                        </div>
                                        
                                          <h3>Permanent Address : </h3>

                                        <div class="form-input">
                                                <spring:input type="number" path="owner.p_stateno" class="input"/>
                                                <span class="focus-input" data-placeholder="State number"></span>
                                        </div>
                        
                                     
                                        
                                       <div class="form-input">
                                                <spring:input type="text" path="owner.p_zone" class="input"/>
                                                <span class="focus-input" data-placeholder="Zone"></span>
                                        </div>
                        
                                        <div class="form-input">
                                                <spring:input type="text" path="owner.p_district" class="input"/>
                                                <span class="focus-input" data-placeholder="District"></span>
                                        </div>
                        
                                        <div class="form-input">
                                                <spring:input type="text" path="owner.p_vdc_mun" class="input"/>
                                                <span class="focus-input" data-placeholder="V.D.C / Municipality"></span>
                                        </div>
                        
                                        <div class="form-input">
                                               <spring:input type="number" path="owner.p_wardno" class="input"/>
                                                <span class="focus-input" data-placeholder="Ward number"></span>
                                        </div>
                        
                                        <div class="form-input">
                                                <spring:input type="text" path="owner.p_tole" class="input"/>
                                                <span class="focus-input" data-placeholder="Tole"></span>
                                        </div>
                        
                                        <div class="form-input">
                                            <spring:input type="number" path="owner.p_home_no" class="input"/>
                                                <span class="focus-input" data-placeholder="Home number"></span>
                                        </div>
                        
                                        <div class="form-input">
                                               <spring:input type="number" path="owner.p_phone_no" class="input"/>
                                                <span class="focus-input" data-placeholder="Phone number"></span>
                                        </div>
                        
                                        <h3>Temporary Address : </h3>
                                        
                                         <div class="form-input">
                                                <spring:input type="number" path="owner.t_stateno" class="input"/>
                                                <span class="focus-input" data-placeholder="State number"></span>
                                        </div>
                        
                                     
                                        
                                       <div class="form-input">
                                                <spring:input type="text" path="owner.t_zone" class="input"/>
                                                <span class="focus-input" data-placeholder="Zone"></span>
                                        </div>
                        
                                        <div class="form-input">
                                                <spring:input type="text" path="owner.t_district" class="input"/>
                                                <span class="focus-input" data-placeholder="District"></span>
                                        </div>
                        
                                        <div class="form-input">
                                                <spring:input type="text" path="owner.t_vdc_mun" class="input"/>
                                                <span class="focus-input" data-placeholder="V.D.C / Municipality"></span>
                                        </div>
                        
                                        <div class="form-input">
                                               <spring:input type="number" path="owner.t_wardno" class="input"/>
                                                <span class="focus-input" data-placeholder="Ward number"></span>
                                        </div>
                        
                                        <div class="form-input">
                                                <spring:input type="text" path="owner.t_tole" class="input"/>
                                                <span class="focus-input" data-placeholder="Tole"></span>
                                        </div>
                        
                                        <div class="form-input">
                                            <spring:input type="number" path="owner.t_home_no" class="input"/>
                                                <span class="focus-input" data-placeholder="Home number"></span>
                                        </div>
                        
                                        <div class="form-input">
                                               <spring:input type="number" path="owner.t_phone_no" class="input"/>
                                                <span class="focus-input" data-placeholder="Phone number"></span>
                                        </div>
                        
                                    </div>
                                </div>
                        </section>
                       
                        </div>
                    </div>
                    
                    
                    <div id="collapseThree" class="collapse" data-parent="#accordion" aria-labelledby="headingThree">
                        <div class="card-body">
                        
                            <section class="vehicle-detail">
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
                            
                           
                        <div class="card-body">
                            <section class="vehicle-detail">
                                <div class="container">
                                    <div class="vehicle-content">
                                            
                                       <div class="form-input">
                            				<spring:input type="text" path="rfid.uniquekey" class="input"/>
                            					<span class="focus-input" data-placeholder="RFID Key"></span>
                                        </div>
                
                                        
                                     </div>
                                </div>
                            </section>                            
                        </div>                        
                    </div>
                    </div>
                    </div>
                </div>
            </div>
        </div>
  
    </section>
   
    </section>
     <div class="sub-btn">
                                            <button value="Submit" id="update"><a href="#">Update</a></button>
                                        </div>
    </section>
   </spring:form>
    <footer>
            <div class="container">
              <div class="footer-content">
                <p>PROJECT WORK</p>
            </div>
            </div>
          </footer>

    </body>
    <!-- <script>
  
    function myFunction() {
      var txt;
      if (confirm("You want to update?????")) {
        txt = "Submitted";
      } else {
        txt = "You pressed Cancel!";
      }
      document.getElementById("demo").innerHTML = txt;
    }
   </script> -->
  
    
 <script type="text/javascript">
 
			    		
    		$(document).ready(function(){
				
							$("#update").click(function(){
									$.post("${pageContext.request.contextPath}/update",
									{
										
									},
									function(data, status){
										alert("Vehicle Details Updated");
									});
			});
				
    		});
    		
    	
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
           
          
     