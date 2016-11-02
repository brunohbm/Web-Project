<%-- 
    Document   : cart
    Created on : 19/10/2016, 19:38:54
    Author     : CrasyFox
--%>

<%@page import="crasyfox.control.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page import="crasyfox.control.Item"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>                
        <link rel="shortcut icon" href="../tools/img/icon.png" type="image/png">
        <title>I-Commerce Cart</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <script type="text/javascript" src="js/lib/jquery-3.1.1.min.js"></script>
        <script type="text/javascript" src="js/lib/bootstrap.min.js"></script>

        <script type="text/javascript">
            function addProduct(id) {

            }
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
                <li><a href="main.jsp"><img src="img/homeIcon.png" id="iconPage">Home</a></li>                                               
            </ul>                
        </nav>
        <div class="container" style="height:1000px">                                     
            <table class="table table-bordered" style="background-color: white">
                <thead>
                    <tr style="background-color:  gray">
                        <th>Name</th>
                        <th>Description</th>
                        <th>Value</th>                                                        
                        <th>Amount</th>    
                        <th>Total</th>
                    </tr>                         
                </thead>
                <tbody>                   
                    <%
                        Order order = (Order) session.getAttribute("order");
                        for (Item item : order.getItems()) {
                    %>
                    <tr>
                        <td><%=item.name%></td>
                        <td><%=item.description%></td>
                        <td><%=item.value%></td>                
                        <td><%=item.amount%></td>
                        <td><%=Math.round((item.amount * item.value))%></td>
                    </tr>
                    <% }%>
                </tbody>
                <tfoot>
                <td colspan="5">Total : <%=Math.round(order.sumTotal())%></td>
                </tfoot>
            </table>
               <a class="btn btn-success" href="../ControllerProductsServlet">End</a>
        </div>
    </body>
</html>


