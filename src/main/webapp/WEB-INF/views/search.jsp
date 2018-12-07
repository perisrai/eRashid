<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page isELIgnored="false" %>
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

<script
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha256-3edrmyuQ0w65f8gfBsqowzjJe2iM6n0nKciPUp8y+7E="
  crossorigin="anonymous">
  </script>

  
   
    <script type="text/javascript"
    	src="${pageContext.request.contextPath}/resources/js/jquery-1.12.3.min.js"> </script>
    <script type="text/javascript"
    	src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.js"> </script>
<title>Home</title>
</head>
<body>
 <header>
            
                <div class="main-head">
                    <h2>Vehicle details of ${vno}</h2>
                     <img src="${pageContext.request.contextPath}/resources/assests/imgs/nepal.gif"/>
                </div>
                
            </header>



	
	<hr>

	<table id="myTable" class="table table-striped">
		<thead>

			<tr class="success">
				<th>Vehicle id </th>
				<th>Vehicle Number</th>
				<th>Importer's Name</th>
				<th>Vehicle Color</th>
				<th>Vehicle Type</th>
				<th>Vehicle Total Weight</th>
				<th>cc</th>
				<th>chesis no</th>
				<th>engine no</th>
				<th>no of seats</th>
				<th>fuel</th>
				<th>device in vehicle</th>
				<th>Importer's Address</th>
				<th>Manufacturer Name</th>
				<th>Manufactured Year</th>
				<th>No of cylinder</th>
				<th>Registered Date</th>
				<th>Weight Bearing Capacity</th>
				<th>Usages</th>
				<th>Vehicle Model</th>
				<th>Zone</th>
				<th>Lot no</th>
				<th>Type</th>
				<th>Vehicle num</th>
				  <th>customduty_cd_id</th>
			</tr>

		</thead>

		<tbody>

			<%-- using tags that have been imported --%>
			
            
        <c:forEach var="vehicle"  items="${results}">
        

    				<tr class="danger">
    				
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.importer_name}</td>
    					<td>${vehicle.owner.oname}</td>
    					<td>${vehicle.vtype}</td>
    					<td>${vehicle.total_weight}</td>
    					<td>${vehicle.cc}</td>
    					<td>${vehicle.total_weight}</td>
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.vno}</td>
    					<td>${vehicle.vno}</td>
    					
    					<td>${vehicle.vcolor}</td>
    					<td>${vehicle.vtype}</td>	
    					
    					<td>
					<input type="submit" class="btn btn-success" onclick="editVehicle(${vehicle.vid})" value="Edit"> 
					
					
					
					</td>		
    					

    				</tr>
 </c:forEach>
    			
    		</tbody>

	
	




</body>
	<script type="text/javascript">
	
		function editVehicle(vid){
			
			// pageContext.request.contextPath takes us to root path of project
			//http://localhost:8080/springproject is called the root path of the project
			
			window.location = "${pageContext.request.contextPath}/"+vid+"/edit";
			
		}
	
		
		$(document).ready(function(){
		    $('#myTable').DataTable();
		});
		
	
	</script>

</html>
