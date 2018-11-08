<%-- 
    Document   : tambah6
    Created on : Nov 8, 2018, 3:03:48 PM
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
        <h1>Tambah Permohonan</h1>
        <form:form modelAttribute="permohonan" action="${pageContext.request.contextPath}/tambah6" method="post">
            <table> 
                <tr>
                    <td>Id Karyawan</td>
                    <td>:</td>
                    <td><form:input path="idKaryawan" /></td>
                </tr>
                <tr>
                    <td>Id Cuti</td>
                    <td>:</td>
                    <td><form:input path="idCuti" /></td>
                </tr>
                <tr>
                    <td>Tanggal Submit</td>
                    <td>:</td>
                    <td><form:input path="tglSubmit" /></td>
                </tr>
                <tr>
                    <td>Mulai Cuti</td>
                    <td>:</td>
                    <td><form:input path="mulaiCuti" /></td>
                </tr>
                <tr>
                    <td>Selesai Cuti</td>
                    <td>:</td>
                    <td><form:input path="selesaiCuti" /></td>
                </tr>
                <tr>
                    <td>Catatan</td>
                    <td>:</td>
                    <td><form:input path="catatan" /></td>
                </tr>
                <tr>
                    <td>Status</td>
                    <td>:</td>
                    <td><form:input path="status" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Simpan" /></td>
                </tr>
            </table>
    </form:form>
    </body>
</html>

