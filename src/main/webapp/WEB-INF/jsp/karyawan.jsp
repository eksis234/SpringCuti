<%-- 
    Document   : role
    Created on : Oct 31, 2018, 3:44:32 PM
    Author     : Lenovo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Latihan Spring</title>
    </head>
    <body>
        <!-- role -->
        <div class="container">
            <div class="row">
                <div class="col-lg-9">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/tambah4" role="button"><span class="glyphicon glyphicon-plus"></span> Tambah</a>
                </div><!-- /.col-lg-6 -->
                <div class="col-lg-3">
                    <div class="input-group">
                        <input type="search" id="search" class="form-control" placeholder="Search...">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                        </span>
                    </div><!-- /input-group -->
                </div><!-- /.col-lg-6 -->
            </div><!-- /.row -->
            <br>
            <div class="card">
                <div class="card-header">
                    Daftar Karyawan
                </div>
                <div class="card-body">
                    <table class="table table-striped">
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
            <script src="//rawgithub.com/stidges/jquery-searchable/master/dist/jquery.searchable-1.0.0.min.js"></script>
            <script>
                $(function () {
                    $('#table').searchable({
                        striped: true,
                        searchType: 'fuzzy'
                    });

                    $('#searchable-container').searchable({
                        searchField: '#container-search',
                        selector: '.row',
                        childSelector: '.col-xs-3',
                        show: function (elem) {
                            elem.slideDown(100);
                        },
                        hide: function (elem) {
                            elem.slideUp(100);
                        }
                    })
                });
            </script>
    </body>
</html>
