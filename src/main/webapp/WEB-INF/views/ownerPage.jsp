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
 src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
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
            
            <div class="login">
                <ul>
                  <li><a href="/">Logout</a></li>
                </ul>
              </div>
        </div>
    </nav>
            
            
            
            
            
  <section>
            <div class="container">
                <div class="vehicle-content">
                    <div class="seprate">
                        <div class="abc-20">
                            <div class="title">
                                <h4>Vehicle No.:</h4>
                            </div>
                        </div>
                        <div class="abc-70">
                            <p>${vehicle.vno}</p>
                        </div>

                        <div class="abc-20">
                                <div class="title">
                                    <h4>Owners Name.:</h4>
                                </div>
                            </div>
                            <div class="abc-70">
                                <p>${vehicle.owner.oname}</p>
                            </div>

                            <div class="abc-20">
                                    <div class="title">
                                        <h4>Engine No.:</h4>
                                    </div>
                                </div>
                                <div class="abc-70">
                                    <p>${vehicle.engineNo}</p>
                                </div>

                                <div class="abc-20">
                                        <div class="title">
                                            <h4>Chessis No.:</h4>
                                        </div>
                                    </div>
                                    <div class="abc-70">
                                        <p>${vehicle.chesisNo}</p>
                                    </div>
                                    <div class="abc-20">
                                        <div class="title">
                                            <h4>Fuel:</h4>
                                        </div>
                                    </div>
                                    <div class="abc-70">
                                        <p>${vehicle.fuel}</p>
                                    </div>
                </div>         
               

            
            </div>
            </div>
        </section>

        <section>
            <div class="container">
                <div class="vehicle-content">
                    <div class="seprate">
                        <div class="abc-20">
                            <div class="title">
                                <h4>last tax paid date:</h4>
                            </div>
                        </div>
                        <div class="abc-70">
                            <p>${tax.lastTaxPaidDate }</p>
                        </div>
                        
                        <div class="abc-20">
                            <div class="title">
                                <h4>Tax Status:</h4>
                            </div>
                        </div>
                        <div class="abc-70">
                            <p>${tax.status}</p>
                        </div>
                        <div class="abc-20">
                            <div class="title">
                                <h4>Tax to be paid:</h4>
                            </div>
                        </div>
                        <div class="abc-70">
                            <p>${tax.taxToPay}</p>
                        </div>
                    </div>
                </div>
                
                
                
                <div class="sub-btn">
                    <button value="Submit"id="pay"><a href="#">Pay</a> </button>
                </div>
            </div>
        </section>

</body>
 <script type="text/javascript">
 
			    		
    		$(document).ready(function(){
				
							$("#pay").click(function(){
									$.post("${pageContext.request.contextPath}/ownerPay",
									{
										vno: "${vehicle.vno}"
									},
									function(data, status){
										alert("Amount Paid");
									});
			});
				
    		});
    		
    	
    	</script>
</html>