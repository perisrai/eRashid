<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assests/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assests/css/first.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assests/css/style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/css/dataTables.bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/css/bootstrap.css">

<script
src="${pageContext.request.contextPath}/resources/js/bootstrap.js"> </script>

  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha256-3edrmyuQ0w65f8gfBsqowzjJe2iM6n0nKciPUp8y+7E="
  crossorigin="anonymous">
  </script>

  
   
    <script type="text/javascript"
    	src="${pageContext.request.contextPath}/resources/js/jquery-1.12.3.min.js"></script>
   
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.js"> </script>

  
    </head>
    <body>

    	<header>
                <div class="main-head">
                <img
				src="${pageContext.request.contextPath}/resources/assests/imgs/automobile.png"
				alt="">
                    <h2>Vehicle details</h2>
                     <img src="${pageContext.request.contextPath}/resources/assests/imgs/nepal.gif"/>
                </div>
                
            </header>
            
             <nav>
        <div class="main-nav container">
            <ul>
                <li><a href="adminhomepage">Home</a></li>
            </ul>
            <div class="login">
                <ul>
                  <li><a href="/">Logout</a></li>
                </ul>
              </div>
        </div>
    </nav>
    	<hr>

    	<table id="myTable" class="table table-striped">
    		<thead>

    			<tr class="success">
    				
    			<!-- vehicle Details -->  
				<th>Vehicle Number</th>
				<th>Importer's Name</th>
				<TH>Importers Address</TH>
				<th>Manufacturer Name</th>
				<th>Manufactured Year</th>
				<th>Vehicle Model</th>
				<th>engine no</th>
				<th>chesis no</th>
				<th>cc</th>
				<th>Number of Cylinders</th>		
				<th>Vehicle Color</th>
				<th>Vehicle Type</th>	
				<th>no of seats</th>
				<th>fuel</th>
				<th>Total Weight</th>
				<th>Weight Bearing Capacity</th>
				<th>Registered Date</th>
				<th>Usage</th>
				<th>Device in Vehicle</th>

				<!-- Owner Details -->
				<th>Owner Name</th>
				<th>Father Name</th>
				<th>Grandafather Name</th>
				<th>Date of birth</th>
				<th>Email</th>
				<th>Phone Number</th>

				<!-- permanent Details -->
				<th>Permanent State NUmber</th>
				<th>Permanent Zone</th>
				<th>Permanent District</th>
				<th>Permanent V.D.C / Municipality</th>
				<th>Permanent Ward Number</th>
				<th>Permanent Tole</th>
				<th>Permanent Home NUmber</th>
				<th>Permanent Phone Number</th>

				<!-- Temporary Details -->
				<th>Temporary State NUmber</th>
				<th>Temporary Zone</th>
				<th>Temporary District</th>
				<th>Temporary V.D.C / Municipality</th>
				<th>Temporary Ward Number</th>
				<th>Temporary Tole</th>
				<th>Temporary Home NUmber</th>
				<th>Temporary Phone Number</th>

				<!-- custom Duty details -->
				<th>Custom Duty Office Name </th>
				<th>ustom Duty Office Address</th>
				<th>Bill Number</th>
				<th>Bill Date</th>
				<th>Pragyapan Number</th>
				<th>Rfid Uniquekey</th>
			</tr>

    		</thead>

    		<tbody>

    			<%-- using tags that have been imported --%>
    			
                
           <c:forEach var="vehicle"  items="${vehiclelist}">
     			<tr class="danger">
    				
    				<tr class="danger">
    					
    					<!-- Vehicle Display -->
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.importerName}</td>
    					<td>${vehicle.importerAddress}</td>
    					<td>${vehicle.manufacturerName}</td>
    					<td>${vehicle.manufacturedYear}</td>
    					<td>${vehicle.vmodel}</td>
    					<td>${vehicle.engineNo}</td>
    					<td>${vehicle.chesisNo}</td>
    					<td>${vehicle.cc}</td>
    					<td>${vehicle.noOfCylinders}</td>
    					<td>${vehicle.vcolor}</td>
    					<td>${vehicle.vtype}</td>
    					<td>${vehicle.noOfSeats}</td>
    					<td>${vehicle.fuel}</td>
    					<td>${vehicle.totalWeight}</td>
    					<td>${vehicle.weightBearingCapacity}</td>
    					<td>${vehicle.registeredDate}</td>
    					<td>${vehicle.usages}</td>
    					<td>${vehicle.deviceInVehicle}</td>

    					<!-- owner Display -->
    					<td>${vehicle.owner.oname}</td>
    					<td>${vehicle.owner.fname}</td>
    					<td>${vehicle.owner.gfname}</td>
    					<td>${vehicle.owner.dob}</td>
    					<td>${vehicle.owner.email}</td>
    					<td>${vehicle.owner.mobileNumber}</td>
							
							<!-- permanent Address Display -->
    					<td>${vehicle.owner.p_stateno}</td>
    					<td>${vehicle.owner.p_zone}</td>
    					<td>${vehicle.owner.p_district}</td>
    					<td>${vehicle.owner.p_vdc_mun}</td>
    					<td>${vehicle.owner.p_wardno}</td>
    					<td>${vehicle.owner.p_tole}</td>
    					<td>${vehicle.owner.p_home_no}</td>
    					<td>${vehicle.owner.p_phone_no}</td>

    						<!-- Temporary Address Display -->
    					<td>${vehicle.owner.t_stateno}</td>
    					<td>${vehicle.owner.t_zone}</td>
    					<td>${vehicle.owner.t_district}</td>
    					<td>${vehicle.owner.t_vdc_mun}</td>
    					<td>${vehicle.owner.t_wardno}</td>
    					<td>${vehicle.owner.t_tole}</td>
    					<td>${vehicle.owner.t_home_no}</td>
    					<td>${vehicle.owner.t_phone_no}</td>
    					
						<!-- Custom Duty Details -->
						<td>${vehicle.customduty.cd_name}</td>
						<td>${vehicle.customduty.cd_address}</td>
						<td>${vehicle.customduty.bill_no}</td>
						<td>${vehicle.customduty.bill_date}</td>
						<td>${vehicle.customduty.pragyapan_no}</td>
						<td>${vehicle.rfid.uniquekey}</td>
					

					
    					<td>
					<input type="submit" class="btn btn-success" onclick="editVehicle(${vehicle.vid})" value="Edit"> 
					
					<input type="submit" class="btn btn-success" onclick="showHistory(${vehicle.vid})" value="Show History"> 
					
					
					</td>
    							
    					

    				</tr>
 </c:forEach>
    			
    		</tbody>

    	</table>

    	

    	




    </body>
    <script type="text/javascript">
	
		function editVehicle(vid){
			
			// pageContext.request.contextPath takes us to root path of project
			//http://localhost:8080/springproject is called the root path of the project
			
			window.location = "${pageContext.request.contextPath}/"+vid+"/edit";
			
		}

function showHistory(vid){
			
			window.location = "${pageContext.request.contextPath}/"+vid+"/show-history";
			
		}
		
    		
    		$(document).ready(function(){
    		    $('#myTable').DataTable();
    		});
    		
    	
    	</script>
    </html>

           