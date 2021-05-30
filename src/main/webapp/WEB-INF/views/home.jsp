
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/css/first.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assests/css/all.min.css">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet">
<script
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha256-3edrmyuQ0w65f8gfBsqowzjJe2iM6n0nKciPUp8y+7E="
  crossorigin="anonymous"></script>
  <script src="${pageContext.request.contextPath}/resources/js/all.min.js"></script>
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
            <li><a href="">Home</a></li>
            <li><a href="ownerlogin">Tax payment</a></li>
          </ul>
          <div class="login">
            <ul>
              <li><a href="adminlogin"> Admin Login</a></li>
            </ul>
          </div>
        </div>
      </nav>
        
      <div class="inner-panel">
        <div class="container">
          <div class="seprate">
            <div class="left-panel">
               <div class="left-link">
                  <a style="text-decoration:none" href="#" ><i class="fas fa-phone-volume"></i>Contact Information</a>
                  <a style="text-decoration:none" href="ownerlogin"><i class="fas fa-coins"></i>Tax Payment</a>
                  <a style="text-decoration:none" href="adminlogin"><i class="far fa-user"></i>Admin Login</a>
               </div>
            </div>
            <div class="remain-panel right-content">
              <div class="short-desc">
                <img src="${pageContext.request.contextPath}/resources/assests/imgs/back.png" alt="back">
                  <p>Use E-Rashid for tax payment! It's easy and secure.</p>
                  
                </div>
                  <div class="long-desc">
                    <h1>RENEW VEHICLE REGISTRATION</h1>
                    <h3>Renew Vehicle</h3>
                    <p>Welcome to the fastest, most convenient way to pay tax of your vehicle.
                      The E-Rashid online system will walk you through each step in the process.
                      You can easily renew any type of vehicles incliding car, truck, motorcycle,scooter,
                      autorickshaw , ATV and more.
                    </p>
                    <p><span>NOTE:</span> You are eligible to renew online if you have a username and password
                    </p>
                 <!--     <div class="sub-btn">
                        <button type="submit"><a href="user/user.html">Renew Now</a></button>
                    </div>-->
                  </div>
            </div>
            
          </div>
        </div>
      </div>
      
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
      