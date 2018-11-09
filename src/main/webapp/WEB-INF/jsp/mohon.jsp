<%-- 
    Document   : Permohonan
    Created on : Nov 8, 2018, 2:05:06 PM
    Author     : Lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Daftar Permohonan</title>
        
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
        <h1>Permohonan</h1>
        <div id="buttonTambah">
            <a href="${pageContext.request.contextPath}/tambah6">Tambah</a>
        </div>
        
        <table id="table">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nama Karyawan</th>
                    <th>Jenis Cuti</th>
                    <th>Tanggal Submit</th>
                    <th>Mulai Cuti</th>
                    <th>Selesai Cuti</th>
                    <th>Catatan</th>
                    <th>Status</th>
                    <th>Opsi</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${permohonans}" var="permohonan">
                <tr>
                    <td><c:out value="${permohonan.idPermohonan}" /></td>
                    <td><c:out value="${permohonan.idKaryawan.nama}" /></td>
                    <td><c:out value="${permohonan.idCuti.nama}" /></td>
                    <td><c:out value="${permohonan.tglSubmit}" /></td>
                    <td><c:out value="${permohonan.mulaiCuti}" /></td>
                    <td><c:out value="${permohonan.selesaiCuti}" /></td>
                    <td><c:out value="${permohonan.catatan}" /></td>
                    <td><c:out value="${permohonan.status}" /></td>
                    <td><a href="${pageContext.request.contextPath}/edit6/${permohonan.idPermohonan}">Edit</a> | 
                        <a href="${pageContext.request.contextPath}/delete6/${permohonan.idPermohonan}">Delete</a>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </body>
</html>
