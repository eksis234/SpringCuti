<%-- 
    Document   : berkascuti
    Created on : Nov 2, 2018, 4:32:16 PM
    Author     : Martin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Latihan Spring</title>
        
        <style type="text/css">
            h1{
               font-family: sans-serif;
               border-bottom: 3px solid #abcae8;
               color:#4d7ba7;
            }
            
            #table{
               border-collapse: collapse;
               color: #4d7ba7;
               font-family: arial;
            }
            
            #table th{
               padding: 10px;
               border-bottom: 2px solid #4d7ba7;
               text-transform: uppercase;
               font-weight: bold;
            }
            
            #table td{
                padding: 10px;
                border-bottom: 1px solid #4d7ba7;
                padding-right: 25px;
            }
            
            #table a{
                text-decoration: none;
                color:#4d7ba7;
            }
            
            #buttonTambah{
                margin-bottom: 10px;
            }
            
            #buttonTambah a{
                text-decoration: none;
                color: #ffffff;
                font-family: arial;
                background: #abcae8;
                border:1px solid antiquewhite;
                padding: 5px;
                border-radius: 8px;
            }
        </style>
    </head>
    <body>
        <!-- Berkas Cuti -->
        <h1>Berkas Cuti</h1>
        
        <table id="table">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Id Permohonan</th>
                    <th>Lokasi Berkas</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${berkascutis}" var="berkascuti">
                <tr>
                    <td><c:out value="${berkascuti.idBCuti}" /></td>
                    <td><c:out value="${berkascuti.idMohonan.idPermohonan}" /></td>
                    <td><c:out value="${berkascuti.lokasiBerkas}" /></td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
