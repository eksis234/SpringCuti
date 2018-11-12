<%-- 
    Document   : role
    Created on : Oct 31, 2018, 3:44:32 PM
    Author     : Lenovo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Latihan Spring</title>
        <style>
            html { font-size: 90%; }
        </style>
    </head>
    <body>
        <!-- role -->
        <div class="container">
            <div class="row">
                <div class="col-lg-9">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/tambah4" role="button"><span class="glyphicon glyphicon-plus"></span> Tambah Karyawan</a>
                </div><!-- /.col-lg-6 -->

            </div><!-- /.row -->
            <br>
            <div class="card">
                <div class="card-header">
                    Daftar Karyawan
                </div>
                <div class="card-body">
                    <table id="example" class="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nama</th>
                                <th>No Hp</th>
                                <th>Email</th>
                                <th>Awal Kerja</th>
                                <th>Id Dept</th>
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
                                    <td><c:out value="${karyawan.idDepartemen.nama}" /></td>
                                    <td><c:out value="${karyawan.sisacuti}" /></td>
                                    <td><c:out value="${karyawan.bnykcuti}" /></td>
                                    <td><c:out value="${karyawan.status}" /></td>
                                    <td><c:out value="${karyawan.idDRole.nama}" /></td>
                                    <td><a href="${pageContext.request.contextPath}/edit4/${karyawan.id}"><span class="glyphicon glyphicon-edit"></span></a> | 
                                        <a href="${pageContext.request.contextPath}/delete4/${karyawan.id}"><span class="glyphicon glyphicon-trash"></span></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
            <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
            <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>
            <script>
                $(document).ready(function () {
                    $('#example').DataTable();
                });
            </script>
    </body>
</html>
