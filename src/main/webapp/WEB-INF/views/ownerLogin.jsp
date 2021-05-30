<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin Login Page</title>

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/css/login.css">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
<script
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha256-3edrmyuQ0w65f8gfBsqowzjJe2iM6n0nKciPUp8y+7E="
  crossorigin="anonymous"></script>

       
<title>Admin Login</title>
</head>
<body>
		<header>
            <div class="main-head">
                <h2>E-Rashid</h2>
                 <img src="${pageContext.request.contextPath}/resources/assests/imgs/nepal.gif"/>
            </div>
        </header>
<nav>
                <div class="main-nav container">
                   <ul>
                        <button onclick="goBack()">Go Back</button>
                       </ul>
                   
                </div>
            </nav>
   
 <!-- Begin Page Content -->
    <div id="container">
            <form action="ownerPage" method="post">
                <label for="username">Username:</label>
                <input type="text" id="username" name="vno">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password">
                <div id="lower">
                    <input type="checkbox"><label class="check" for="checkbox">Keep me logged in</label>
                    <input type="submit" value="Login">
                    
                </div><!--/ lower-->
            </form>
        </div><!--/ container-->
        <!-- End Page Content -->
 <script>
    /* The back() method loads the previous URL in the history list. 
       This is the same as clicking the "Back button" in your browser.
    */
    function goBack() {
        window.history.back()
    }
    </script>
                   

</body>
</html>