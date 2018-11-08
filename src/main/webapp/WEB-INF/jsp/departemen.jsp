<%-- 
    Document   : Departemen
    Created on : Oct 29, 2018, 3:51:36 PM
    Author     : Lenovo
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
        <!-- departemen -->
               <h1>Departemen</h1>
        <div id="buttonTambah">
            <a href="${pageContext.request.contextPath}/tambah1">Tambah</a>
        </div>
        
        <table id="table">
            <thead>
                <tr>
                    <th>id</th>
                    <th>nama</th>
                    <th>Id Manager</th>
                    <th>Opsi</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${departemens}" var="departemen">
                <tr>
                    <td><c:out value="${departemen.id}" /></td>
                    <td><c:out value="${departemen.nama}" /></td>
                    <td><c:out value="${departemen.idManager}" /></td>
                    <td><a href="${pageContext.request.contextPath}/edit1/${departemen.id}">Edit</a> | 
                        <a href="${pageContext.request.contextPath}/delete1/${departemen.id}">Delete</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
