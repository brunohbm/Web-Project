<%-- 
    Document   : mainAdmin
    Created on : 19/10/2016, 19:39:43
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
                    <li><a href="register.jsp">Register Products</a></li>                                    
                </ul>                
            </nav>
            <div class="container" style="height:1000px">                                     
                <table class="table table-bordered" style="background-color: white">
                    <thead>
                        <tr style="background-color:  gray">
                            <th>Name</th>
                            <th>Description</th>
                            <th>Value</th>                                                        
                            <th></th>                                                      
                        </tr>                         
                   </thead>
                   <tbody>
                       <%
                            ItemControl ic = new ItemControl();
                            ArrayList<Item> items = ic.returnItems();                        
                            for (Item item : items) {
                                out.print("<tr>");
                                out.print("<th>"+item.name+"</th>");
                                out.print("<th>"+item.description+"</th>");
                                out.print("<th>"+item.value+"</th>");
                                out.print("<th><button>Delete</button><button>Alter</button></th>");
                                out.print("</tr>");
                        }
                    %>
                   </tbody>
                </table>
            </div>
        </body>
    </html>
