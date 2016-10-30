<%-- 
    Document   : register
    Created on : 22/10/2016, 23:22:25
    Author     : CrasyFox
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="crasyfox.control.Item"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html>
        <head>                
            <link rel="shortcut icon" href="../tools/img/icon.png" type="image/png">
            <title>ADM Home</title>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

            <script type="text/javascript" src="js/lib/jquery-3.1.1.min.js"></script>
            <script type="text/javascript" src="js/lib/bootstrap.min.js"></script>
            
            <script type="text/javascript">              
            </script>
                

            <link rel="stylesheet" href="css/bootstrap.min.css">
            <link rel="stylesheet" href="css/reset.css">
            <link rel="stylesheet" href="css/normalize.css">
            <link rel="stylesheet" href="css/custom.css">        

            <link rel="stylesheet" href="css/my-definitions.css">                   
            <style>
                .affix {
                    top: 0;
                    width: 100%;
                    -webkit-transition: all .5s ease-in-out;
                    transition: all .5s ease-in-out;
                    background-color: #F44336;
                    border-color: #F44336;
                    z-index: 1;
                }
                .affix a {
                    color: #fff !important;
                    padding: 15px !important;
                    -webkit-transition: all .5s ease-in-out;
                    transition: all .5s ease-in-out;
                }
                .affix-top a {
                    padding: 25px !important;
                }
                .affix + .container-fluid {
                    padding-top: 95px;
                }
            </style>
        </head> 
        <body>           
            <nav class="navbar navbar-inverse" data-spy="affix" data-offset-top="197">
                <ul class="nav navbar-nav">
                    <li><a href="mainAdmin.jsp">List Products</a></li>                    
                </ul>                
            </nav>
            <div class="container" style="height:1000px">                                     
                <form class="form-signin" action="../RegisterServlet" method="POST">
                        <div class="input-group input-group-lg">                            
                            <input type="text" class="form-control" placeholder="Name" name="name" aria-describedby="sizing-addon1">                            
                            <input type="text" class="form-control" placeholder="Description" name="description" aria-describedby="sizing-addon1">    
                            <input type="text" class="form-control" placeholder="Value" name="value" aria-describedby="sizing-addon1">                                
                            <button class="btn btn-lg btn-danger btn-block" type="submit">Register</button>
                        </div>                          
                    </form>
            </div>
        </body>
    </html>
