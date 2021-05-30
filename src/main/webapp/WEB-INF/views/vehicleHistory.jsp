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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assests/css/dataTables.bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assests/css/bootstrap.css">

<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.js">
	
</script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha256-3edrmyuQ0w65f8gfBsqowzjJe2iM6n0nKciPUp8y+7E="
	crossorigin="anonymous">
	
</script>



<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery-1.12.3.min.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/dataTables.bootstrap.js">
	
</script>


</head>
<body>

	<header>
		<div class="main-head">
		<img
				src="${pageContext.request.contextPath}/resources/assests/imgs/automobile.png"
				alt="">
			<h2>Ownership Transfer Details</h2>
			<img
				src="${pageContext.request.contextPath}/resources/assests/imgs/nepal.gif" />
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
				<th>On Date</th>
				<th>From</th>
				<th>To</th>
				<th>Purpose</th>


			</tr>

		</thead>

		<tbody>

			<%-- using tags that have been imported --%>


			<c:forEach var="transfer" items="${vehicle.ownershipDtos}">
				<tr class="danger">
				<tr class="danger">

					<!-- Vehicle Display -->
					<td>${transfer.transferDate}</td>
					<td>${transfer.oldOwner.oname}</td>
					<td>${transfer.newOwner.oname}</td>
					<td>${transfer.purpose}</td>

				</tr>
			</c:forEach>

		</tbody>

	</table>








</body>
<script type="text/javascript">
	function editVehicle(vid) {

		// pageContext.request.contextPath takes us to root path of project
		//http://localhost:8080/springproject is called the root path of the project

		window.location = "${pageContext.request.contextPath}/" + vid + "/edit";

	}

	$(document).ready(function() {
		$('#myTable').DataTable();
	});
</script>
</html>

