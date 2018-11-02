<%-- 
    Document   : karyawan
    Created on : Nov 1, 2018, 2:22:54 PM
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
        <!-- Karyawan -->
        <h1>Karyawan</h1>
        <div id="buttonTambah">
            <a href="${pageContext.request.contextPath}/tambah4">Tambah</a>
        </div>
        
        <table id="table">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nama</th>
                    <th>No Hp</th>
                    <th>Email</th>
                    <th>Awal Kerja</th>
                    <th>Id Departemen</th>
                    <th>Id Manager</th>
                    <th>Password</th>
                    <th>Sisa Cuti</th>
                    <th>Banyak Cuti</th>
                    <th>Status</th>
                    <th>Id Role</th>
                    <th>Opsi</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${karyawans}" var="karyawan">
                <tr>
                    <td><c:out value="${karyawan.id}" /></td>
                    <td><c:out value="${karyawan.nama}" /></td>
                    <td><c:out value="${karyawan.nohp}" /></td>
                    <td><c:out value="${karyawan.email}" /></td>
                    <td><c:out value="${karyawan.awalgbg}" /></td>
                    <td><c:out value="${karyawan.iddept}" /></td>
                    <td><c:out value="${karyawan.idmail}" /></td>
                    <td><c:out value="${karyawan.katasandi}" /></td>
                    <td><c:out value="${karyawan.sisacuti}" /></td>
                    <td><c:out value="${karyawan.bnykcuti}" /></td>
                    <td><c:out value="${karyawan.status}" /></td>
                    <td><c:out value="${karyawan.idrole}" /></td>
                    <td><a href="${pageContext.request.contextPath}/edit4/${karyawan.id}">Edit</a> | 
                        <a href="${pageContext.request.contextPath}/delete4/${karyawan.id}">Delete</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
