<%-- 
    Document   : index
    Created on : 09/10/2016, 16:59:35
    Author     : CrasyFox
--%>    
<%@page import="crasyfox.servlets.LoginServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>                
        <link rel="shortcut icon" href="../img/icon.png" type="image/png">
        <title>I-Commerce Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <script type="text/javascript" src="js/lib/jquery-3.1.1.min.js"></script>
        <script type="text/javascript" src="js/lib/bootstrap.min.js"></script>

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/custom.css">        

        <link rel="stylesheet" href="css/my-definitions.css">       

    </head>    
    <body>
        <div class="row">                        
            <div class="col-sm-6 col-md-4 col-md-offset-4">
                <div class="account-wall">                    
                    <img class="profile-img" src="../tools/img/profile.png" alt="Profile image">
                    <h3 class="text-center">I.M.T.W GAMES</h3>
                    <form class="form-signin" action="  ../Login" method="POST">
                        <div class="input-group input-group-lg">                            
                            <input type="text" class="form-control" placeholder="Username" name="user" aria-describedby="sizing-addon1">
                            <input type="password" class="form-control" placeholder="Password" name="password" aria-describedby="sizing-addon1">
                            <button class="btn btn-lg btn-danger btn-block" type="submit"><img id="image-icon" src="img/icon-controller.png"></button>
                        </div>                          
                    </form>
                    <%
                        if (LoginServlet.test) {
                    %>
                    <div class="alert alert-danger" id="alert">
                        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                        <img src="img/error.png" style="width: 44px; height: 44px; margin-right: 26px; margin-left: 8px">Username or password incorret !
                    </div>
                    <%
                        }
                        LoginServlet.test = false;
                    %>
                </div>
            </div>
        </div>

        <script type="text/javascript" src="../js/app.js"></script>
    </body>
</html>
