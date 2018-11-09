<%-- 
    Document   : tambah5
    Created on : Nov 7, 2018, 2:20:03 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Tambah Page</title>
        <style type="text/css">
            h1{
               font-family: sans-serif;
               border-bottom: 3px solid #abcae8;
               color:#4d7ba7;
            }
            
            table{
                border:2px solid #4d7ba7;
                color: #4d7ba7;
                font-family: arial;
                padding: 5px;
            }
            
            table td{
                padding: 5px;
                padding-bottom: 10px;
            }
            
            table input{
                border:1px solid #4d7ba7;
                padding: 3px;
            }
        </style>
    </head>
    <body>
        <h1>Tambah Berkas Cuti</h1>
        <form:form modelAttribute="berkascuti" action="${pageContext.request.contextPath}/tambah5" method="post">
            <table> 
                <tr>
                    <td>Id Permohonan</td>
                    <td>:</td>
                    <td><form:input path="idMohonan" /></td>
                </tr>
                <tr>
                    <td>Lokasi Berkas</td>
                    <td>:</td>
                    <td><form:input path="LokasiBerkas" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Simpan" /></td>
                </tr>
            </table>
    </form:form>
    </body>
</html>
