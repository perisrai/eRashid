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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assests/css/first.css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha256-3edrmyuQ0w65f8gfBsqowzjJe2iM6n0nKciPUp8y+7E="
	crossorigin="anonymous"></script>
</head>


<body>
	<header>
		<div class="main-head">
			<img
				src="${pageContext.request.contextPath}/resources/assests/imgs/automobile.png"
				alt="">
			<h2>E-Rashid</h2>
			<img
				src="${pageContext.request.contextPath}/resources/assests/imgs/nepal.gif"
				alt="Nepal Flag">
		</div>
	</header>

	<spring:form action="transferOwnership" method="post"
		modelAttribute="vehicle">

		<nav>
			<div class="main-nav container">
				<ul>
					<button onclick="goBack()">Go Back</button>
				</ul>
				<ul>
					 <li><a href="adminhomepage">Home</a></li>
				</ul>
				<div class="login">
					<ul>
						<li><a href="home">Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>

		<section class="vehicle-detail">
			<div class="container">
				<div class="vehicle-content">
					<div class="seprate">
						<div class="abc-20">
							<h4>Purpose:</h4>
						</div>

						<div class="abc-70">
							<div class="form-input">
								<spring:select class="input" path="ownershipDto.purpose">
									<option></option>
									<option value="Buy or Sell">Buy / Sell</option>
									<option value="Death">Death</option>
								</spring:select>
								<span class="focus-input" data-placeholder="Purpose"></span>
							</div>
						</div>
					</div>

					<div class="seprate">
						<div class="abc-20">
							<h4>Transfer Date:</h4>
						</div>
						<div class="abc-70">
							<div class="form-input">
								<spring:input type="date" path="ownershipDto.transferDate"
									class="input" />
								<span class="focus-input" data-placeholder="Transfer Date"></span>
							</div>
						</div>
					</div>



				</div>
			</div>

		</section>
		<section class="owner-detail">
			<div class="container">
				<div class="vehicle-content">
					<div class="form-input">
						<spring:input type="text" path="vno" class="input" />
						<span class="focus-input" data-placeholder="Name of owner:"></span>
					</div>

					<div class="form-input">
						<spring:input type="text" path="owner.oname" class="input" />
						<span class="focus-input" data-placeholder="Name of owner:"></span>
					</div>

					<div class="form-input">
						<spring:input type="text" path="owner.fname" class="input" />
						<span class="focus-input" data-placeholder="Father's Name:"></span>
					</div>

					<div class="form-input">
						<spring:input type="text" path="owner.gfname" class="input" />
						<span class="focus-input" data-placeholder="Grandfather's Name:"></span>
					</div>

					<div class="form-input">
						<spring:input type="date" path="owner.dob" class="input" />
						<span class="focus-input" data-placeholder="Date OF Birth:"></span>
					</div>
					<div class="form-input">
						<spring:input type="number" path="owner.mobileNumber"
							class="input" />
						<span class="focus-input" data-placeholder="Mobile Number"></span>
					</div>

					<h3>Permanent Address :</h3>

					<div class="form-input">
						<spring:input type="number" path="owner.p_stateno" class="input" />
						<span class="focus-input" data-placeholder="State number"></span>
					</div>



					<div class="form-input">
						<spring:input type="text" path="owner.p_zone" class="input" />
						<span class="focus-input" data-placeholder="Zone"></span>
					</div>

					<div class="form-input">
						<spring:input type="text" path="owner.p_district" class="input" />
						<span class="focus-input" data-placeholder="District"></span>
					</div>

					<div class="form-input">
						<spring:input type="text" path="owner.p_vdc_mun" class="input" />
						<span class="focus-input" data-placeholder="V.D.C / Municipality"></span>
					</div>

					<div class="form-input">
						<spring:input type="number" path="owner.p_wardno" class="input" />
						<span class="focus-input" data-placeholder="Ward number"></span>
					</div>

					<div class="form-input">
						<spring:input type="text" path="owner.p_tole" class="input" />
						<span class="focus-input" data-placeholder="Tole"></span>
					</div>

					<div class="form-input">
						<spring:input type="number" path="owner.p_home_no" class="input" />
						<span class="focus-input" data-placeholder="Home number"></span>
					</div>

					<div class="form-input">
						<spring:input type="number" path="owner.p_phone_no" class="input" />
						<span class="focus-input" data-placeholder="Phone number"></span>
					</div>

					<h3>Temporary Address :</h3>

					<div class="form-input">
						<spring:input type="number" path="owner.t_stateno" class="input" />
						<span class="focus-input" data-placeholder="State number"></span>
					</div>



					<div class="form-input">
						<spring:input type="text" path="owner.t_zone" class="input" />
						<span class="focus-input" data-placeholder="Zone"></span>
					</div>

					<div class="form-input">
						<spring:input type="text" path="owner.t_district" class="input" />
						<span class="focus-input" data-placeholder="District"></span>
					</div>

					<div class="form-input">
						<spring:input type="text" path="owner.t_vdc_mun" class="input" />
						<span class="focus-input" data-placeholder="V.D.C / Municipality"></span>
					</div>

					<div class="form-input">
						<spring:input type="number" path="owner.t_wardno" class="input" />
						<span class="focus-input" data-placeholder="Ward number"></span>
					</div>

					<div class="form-input">
						<spring:input type="text" path="owner.t_tole" class="input" />
						<span class="focus-input" data-placeholder="Tole"></span>
					</div>

					<div class="form-input">
						<spring:input type="number" path="owner.t_home_no" class="input" />
						<span class="focus-input" data-placeholder="Home number"></span>
					</div>

					<div class="form-input">
						<spring:input type="number" path="owner.t_phone_no" class="input" />
						<span class="focus-input" data-placeholder="Phone number"></span>
					</div>

				</div>
			</div>
		</section>


		<div class="sub-btn">
			<button value="Submit">Next</button>
		</div>

	</spring:form>
	<footer>
		<div class="container">
			<div class="footer-content">
				<p>PROJECT WORK</p>
			</div>
		</div>
	</footer>

</body>
<script>
	(function($) {
		"use strict";

		$('.input').each(function() {
			$(this).on('blur', function() {
				if ($(this).val().trim() != "") {
					$(this).addClass('has-val');
				} else {
					$(this).removeClass('has-val');
				}
			})
		})

	})(jQuery);
</script>

<script>
	function goBack() {
		window.history.back()
	}
</script>
</html>