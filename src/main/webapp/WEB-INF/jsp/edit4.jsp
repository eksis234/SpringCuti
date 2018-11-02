<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
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
        <h1>Edit</h1>
        <form:form modelAttribute="karyawan" action="${pageContext.request.contextPath}/edit4" method="post">
            <table>
                <form:hidden path="id" />
                <tr>
                    <td>Nama</td>
                    <td>:</td>
                    <td><form:input path="nama" value="${karyawan.nama}"/></td>
                </tr>
                <tr>
                    <td>No Hp</td>
                    <td>:</td>
                    <td><form:input path="nohp" value="${karyawan.nohp}" /></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>:</td>
                    <td><form:input path="email" value="${karyawan.email}" /></td>
                </tr>
                <tr>
                    <td>Awal Gabung</td>
                    <td>:</td>
                    <td><form:input path="eawalgbg" value="${karyawan.awalgbg}" /></td>
                </tr>
                <tr>
                    <td>Id Departemen</td>
                    <td>:</td>
                    <td><form:input path="iddept" value="${karyawan.iddept}" /></td>
                </tr>
                <tr>
                    <td>Id Manager</td>
                    <td>:</td>
                    <td><form:input path="idmail" value="${karyawan.idmail}" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td><form:input path="katasandi" value="${karyawan.katasandi}" /></td>
                </tr>
                <tr>
                    <td>Sisa Cuti</td>
                    <td>:</td>
                    <td><form:input path="sisacuti" value="${karyawan.sisacuti}" /></td>
                </tr>
                <tr>
                    <td>Banyak Cuti</td>
                    <td>:</td>
                    <td><form:input path="bnykcuti" value="${karyawan.bnykcuti}" /></td>
                </tr>
                <tr>
                    <td>Status</td>
                    <td>:</td>
                    <td><form:input path="status" value="${karyawan.status}" /></td>
                </tr>
                <tr>
                    <td>Id Role</td>
                    <td>:</td>
                    <td><form:input path="idrole" value="${karyawan.idrole}" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Simpan" /></td>
                </tr>
            </table>
    </form:form>
    </body>
</html>
