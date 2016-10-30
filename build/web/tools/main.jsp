<%-- 
Document   : main
Created on : 12/10/2016, 12:26:46
Author     : CrasyFox
--%>
<%@page import="crasyfox.control.ItemControl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="crasyfox.control.Item"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>   
        <head>                
            <link rel="shortcut icon" href="../tools/img/icon.png" type="image/png">
            <title>I-Commerce Home</title>
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
            <div class="container-fluid" style="background-color:#F44336;color:#fff;height:200px;">
                <img src="img/mainPageIcon.png" style="margin-right: 45px;  "> <text style="font-size: 40px" >I.M.T.W Games Shop</text>
            </div>
            <nav class="navbar navbar-inverse" data-spy="affix" data-offset-top="197">
                <ul class="nav navbar-nav">
                    <li><a href="#"><img src="img/homeIcon.png" id="iconPage">Home</a></li>
                    <li><a href="#"><img src="img/productsIcon.png" id="iconPage">Shopping Cart</a></li>                                    
                </ul>                
            </nav>
            <div class="container" style="height:1000px">                                     
                <dl class="list-group">                                         
                    <%
                            ItemControl ic = new ItemControl();
                            ArrayList<Item> items = ic.returnItems();                        
                            for (Item item : items) {                                
                                out.print("<div class=\"col-sm-3\">");
                                out.print("<dt>"+item.name+"</dt>");
                                out.print("<dd>"+item.description+"</dd>");
                                out.print("<dd>"+item.value+"</dd>");
                                out.print("<dd><button>Add</button></dd></br>");
                                out.print("</div>");                                
                        }
                    %>
                </dl>                
            </div>
        </body>
    </html>

