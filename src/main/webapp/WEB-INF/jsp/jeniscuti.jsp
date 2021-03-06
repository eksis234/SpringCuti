<%-- 
    Document   : jeniscuti
    Created on : Oct 31, 2018, 12:26:04 AM
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

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="A front-end template that helps you build fast, modern mobile web apps.">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
        <title>Cuti Online</title>
        <meta name="mobile-web-app-capable" content="yes">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="apple-mobile-web-app-title" content="Material Design Lite">

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&lang=en">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.cyan-light_blue.min.css">
        <link rel="stylesheet" href="styles.css">
        <style type="text/css">

            html, body {
                font-family: 'Roboto', 'Helvetica', sans-serif;
            }
            .demo-avatar {
                width: 48px;
                height: 48px;
                border-radius: 24px;
            }
            .demo-layout .mdl-layout__header .mdl-layout__drawer-button {
                color: rgba(0, 0, 0, 0.54);
            }
            .mdl-layout__drawer .avatar {
                margin-bottom: 16px;
            }
            .demo-drawer {
                border: none;
            }
            /* iOS Safari specific workaround */
            .demo-drawer .mdl-menu__container {
                z-index: -1;
            }
            .demo-drawer .demo-navigation {
                z-index: -2;
            }
            /* END iOS Safari specific workaround */
            .demo-drawer .mdl-menu .mdl-menu__item {
                display: -webkit-flex;
                display: -ms-flexbox;
                display: flex;
                -webkit-align-items: center;
                -ms-flex-align: center;
                align-items: center;
            }
            .demo-drawer-header {
                box-sizing: border-box;
                display: -webkit-flex;
                display: -ms-flexbox;
                display: flex;
                -webkit-flex-direction: column;
                -ms-flex-direction: column;
                flex-direction: column;
                -webkit-justify-content: flex-end;
                -ms-flex-pack: end;
                justify-content: flex-end;
                padding: 16px;

            }
            .demo-avatar-dropdown {
                display: -webkit-flex;
                display: -ms-flexbox;
                display: flex;
                position: relative;
                -webkit-flex-direction: row;
                -ms-flex-direction: row;
                flex-direction: row;
                -webkit-align-items: center;
                -ms-flex-align: center;
                align-items: center;
                width: 100%;
            }

            .demo-navigation {
                -webkit-flex-grow: 1;
                -ms-flex-positive: 1;
                flex-grow: 1;
            }
            .demo-layout .demo-navigation .mdl-navigation__link {
                display: -webkit-flex !important;
                display: -ms-flexbox !important;
                display: flex !important;
                -webkit-flex-direction: row;
                -ms-flex-direction: row;
                flex-direction: row;
                -webkit-align-items: center;
                -ms-flex-align: center;
                align-items: center;
                color: rgba(255, 255, 255, 0.56);
                font-weight: 500;
            }
            .demo-layout .demo-navigation .mdl-navigation__link:hover {
                background-color: #00BCD4;
                color: #37474F;
            }
            .demo-navigation .mdl-navigation__link .material-icons {
                font-size: 24px;
                color: rgba(255, 255, 255, 0.56);
                margin-right: 32px;
            }

            .demo-content {
                max-width: 1080px;
            }

            .demo-charts {
                -webkit-align-items: center;
                -ms-flex-align: center;
                align-items: center;
            }
            .demo-chart:nth-child(1) {
                color: #ACEC00;
            }
            .demo-chart:nth-child(2) {
                color: #00BBD6;
            }
            .demo-chart:nth-child(3) {
                color: #BA65C9;
            }
            .demo-chart:nth-child(4) {
                color: #EF3C79;
            }
            .demo-graphs {
                padding: 16px 32px;
                display: -webkit-flex;
                display: -ms-flexbox;
                display: flex;
                -webkit-flex-direction: column;
                -ms-flex-direction: column;
                flex-direction: column;
                -webkit-align-items: stretch;
                -ms-flex-align: stretch;
                align-items: stretch;
            }
            /* TODO: Find a proper solution to have the graphs
             * not float around outside their container in IE10/11.
             * Using a browserhacks.com solution for now.
             */
            _:-ms-input-placeholder, :root .demo-graphs {
                min-height: 664px;
            }
            _:-ms-input-placeholder, :root .demo-graph {
                max-height: 300px;
            }
            /* TODO end */
            .demo-graph:nth-child(1) {
                color: #00b9d8;
            }
            .demo-graph:nth-child(2) {
                color: #d9006e;
            }

            .demo-cards {
                -webkit-align-items: flex-start;
                -ms-flex-align: start;
                align-items: flex-start;
                -webkit-align-content: flex-start;
                -ms-flex-line-pack: start;
                align-content: flex-start;
            }
            .demo-cards .demo-separator {
                height: 32px;
            }
            .demo-cards .mdl-card__title.mdl-card__title {
                color: white;
                font-size: 24px;
                font-weight: 400;
            }
            .demo-cards ul {
                padding: 0;
            }
            .demo-cards h3 {
                font-size: 1em;
            }
            .demo-updates .mdl-card__title {
                min-height: 200px;
                background-image: url('images/dog.png');
                background-position: 90% 100%;
                background-repeat: no-repeat;
            }
            .demo-cards .mdl-card__actions a {
                color: #00BCD4;
                text-decoration: none;
            }

            .demo-options h3 {
                margin: 0;
            }
            .demo-options .mdl-checkbox__box-outline {
                border-color: rgba(255, 255, 255, 0.89);
            }
            .demo-options ul {
                margin: 0;
                list-style-type: none;
            }
            .demo-options li {
                margin: 4px 0;
            }
            .demo-options .material-icons {
                color: rgba(255, 255, 255, 0.89);
            }
            .demo-options .mdl-card__actions {
                height: 64px;
                display: -webkit-flex;
                display: -ms-flexbox;
                display: flex;
                box-sizing: border-box;
                -webkit-align-items: center;
                -ms-flex-align: center;
                align-items: center;
            }
        </style>
    </head>
    <body>
        <div class="demo-layout mdl-layout mdl-js-layout mdl-layout--fixed-drawer mdl-layout--fixed-header">
            <header class="demo-header mdl-layout__header mdl-color--grey-100 mdl-color-text--grey-600">
                <div class="mdl-layout__header-row">
                    <span class="mdl-layout-title">Welcome, ${sessionScope.nama}!<br></span>
                    <a href="${pageContext.request.contextPath}/karyawan">Karyawan</a> ||
                    <a href="${pageContext.request.contextPath}/dept">Departemen</a> ||
                    <a href="${pageContext.request.contextPath}/role">Role</a> ||
                    <a href="${pageContext.request.contextPath}/jcuti">Jenis Cuti</a> ||
                    <a href="${pageContext.request.contextPath}/permohonan">Permohonan</a> ||
                    <a href="${pageContext.request.contextPath}/bcuti">Berkas Cuti</a> ||
                    <div class="mdl-layout-spacer"></div>
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--expandable">
                        <label class="mdl-button mdl-js-button mdl-button--icon" for="search">
                            <i class="material-icons">search</i>
                        </label>
                        <div class="mdl-textfield__expandable-holder">
                            <input class="mdl-textfield__input" type="text" id="search">
                            <label class="mdl-textfield__label" for="search">Enter your query...</label>
                        </div>
                    </div>
                    <button class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon" id="hdrbtn">
                        <i class="material-icons">more_vert</i>
                    </button>
                    <ul class="mdl-menu mdl-js-menu mdl-js-ripple-effect mdl-menu--bottom-right" for="hdrbtn">
                        <li class="mdl-menu__item">About</li>
                        <li class="mdl-menu__item">Contact</li>
                        <li class="mdl-menu__item">Legal information</li>
                    </ul>
                </div>
            </header>
            <div class="demo-drawer mdl-layout__drawer mdl-color--blue-grey-900 mdl-color-text--blue-grey-50">
                <header class="demo-drawer-header">
                    <img src="https://image.ibb.co/mGn5np/user.jpg" class="demo-avatar">
                    <div class="demo-avatar-dropdown">
                        <span>hello@example.com</span>
                        <div class="mdl-layout-spacer"></div>
                        <button id="accbtn" class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
                            <i class="material-icons" role="presentation">arrow_drop_down</i>
                            <span class="visuallyhidden">Accounts</span>
                        </button>
                        <ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect" for="accbtn">
                            <li class="mdl-menu__item">hello@example.com</li>
                            <li class="mdl-menu__item">info@example.com</li>
                            <li class="mdl-menu__item"><i class="material-icons">add</i>Add another account...</li>
                        </ul>
                    </div>
                </header>
                <nav class="demo-navigation mdl-navigation mdl-color--blue-grey-800">
                    <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">home</i>Home</a>
                    <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">inbox</i>Inbox</a>
                    <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">delete</i>Trash</a>
                    <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">report</i>Spam</a>
                    <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">forum</i>Forums</a>
                    <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">flag</i>Updates</a>
                    <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">local_offer</i>Promos</a>
                    <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">shopping_cart</i>Purchases</a>
                    <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">people</i>Social</a>
                    <div class="mdl-layout-spacer"></div>
                    <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">help_outline</i><span class="visuallyhidden">Help</span></a>
                </nav>
            </div>
            <main class="mdl-layout__content mdl-color--grey-100">
                <div class="mdl-grid demo-content">
                    <!-- role -->
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-9">
                                <a class="btn btn-primary" href="${pageContext.request.contextPath}/tambah2" role="button"><span class="glyphicon glyphicon-plus"></span> Tambah</a>
                            </div><!-- /.col-lg-6 -->
                        </div><!-- /.row -->
                        <br>
                        <div class="card">
                            <div class="card-header">
                                Daftar Jenis Cuti
                            </div>
                            <div class="card-body">
                                <table id="example" class="table table-striped table-bordered">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nama</th>
                                            <th>Deskripsi</th>
                                            <th>Lama</th>
                                            <th>Opsi</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${jeniscutis}" var="jeniscuti">
                                            <tr>
                                                <td><c:out value="${jeniscuti.id}" /></td>
                                                <td><c:out value="${jeniscuti.nama}" /></td>
                                                <td><c:out value="${jeniscuti.deskripsi}" /></td>
                                                <td><c:out value="${jeniscuti.lama}" /></td>
                                                <td><a href="${pageContext.request.contextPath}/edit2/${jeniscuti.id}"><span class="glyphicon glyphicon-edit"></span></a> | 
                                                    <a href="${pageContext.request.contextPath}/delete2/${jeniscuti.id}"><span class="glyphicon glyphicon-trash"></span></a>
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
                    </div>
            </main>
        </div>
    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" style="position: fixed; left: -1000px; height: -1000px;">
        <defs>
            <mask id="piemask" maskContentUnits="objectBoundingBox">
                <circle cx=0.5 cy=0.5 r=0.49 fill="white" />
                <circle cx=0.5 cy=0.5 r=0.40 fill="black" />
            </mask>
            <g id="piechart">
                <circle cx=0.5 cy=0.5 r=0.5 />
                <path d="M 0.5 0.5 0.5 0 A 0.5 0.5 0 0 1 0.95 0.28 z" stroke="none" fill="rgba(255, 255, 255, 0.75)" />
            </g>
        </defs>
    </svg>
    <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" viewBox="0 0 500 250" style="position: fixed; left: -1000px; height: -1000px;">
        <defs>
            <g id="chart">
                <g id="Gridlines">
                    <line fill="#888888" stroke="#888888" stroke-miterlimit="10" x1="0" y1="27.3" x2="468.3" y2="27.3" />
                    <line fill="#888888" stroke="#888888" stroke-miterlimit="10" x1="0" y1="66.7" x2="468.3" y2="66.7" />
                    <line fill="#888888" stroke="#888888" stroke-miterlimit="10" x1="0" y1="105.3" x2="468.3" y2="105.3" />
                    <line fill="#888888" stroke="#888888" stroke-miterlimit="10" x1="0" y1="144.7" x2="468.3" y2="144.7" />
                    <line fill="#888888" stroke="#888888" stroke-miterlimit="10" x1="0" y1="184.3" x2="468.3" y2="184.3" />
                </g>
                <g id="Numbers">
                    <text transform="matrix(1 0 0 1 485 29.3333)" fill="#888888" font-family="'Roboto'" font-size="9">500</text>
                    <text transform="matrix(1 0 0 1 485 69)" fill="#888888" font-family="'Roboto'" font-size="9">400</text>
                    <text transform="matrix(1 0 0 1 485 109.3333)" fill="#888888" font-family="'Roboto'" font-size="9">300</text>
                    <text transform="matrix(1 0 0 1 485 149)" fill="#888888" font-family="'Roboto'" font-size="9">200</text>
                    <text transform="matrix(1 0 0 1 485 188.3333)" fill="#888888" font-family="'Roboto'" font-size="9">100</text>
                    <text transform="matrix(1 0 0 1 0 249.0003)" fill="#888888" font-family="'Roboto'" font-size="9">1</text>
                    <text transform="matrix(1 0 0 1 78 249.0003)" fill="#888888" font-family="'Roboto'" font-size="9">2</text>
                    <text transform="matrix(1 0 0 1 154.6667 249.0003)" fill="#888888" font-family="'Roboto'" font-size="9">3</text>
                    <text transform="matrix(1 0 0 1 232.1667 249.0003)" fill="#888888" font-family="'Roboto'" font-size="9">4</text>
                    <text transform="matrix(1 0 0 1 309 249.0003)" fill="#888888" font-family="'Roboto'" font-size="9">5</text>
                    <text transform="matrix(1 0 0 1 386.6667 249.0003)" fill="#888888" font-family="'Roboto'" font-size="9">6</text>
                    <text transform="matrix(1 0 0 1 464.3333 249.0003)" fill="#888888" font-family="'Roboto'" font-size="9">7</text>
                </g>
                <g id="Layer_5">
                    <polygon opacity="0.36" stroke-miterlimit="10" points="0,223.3 48,138.5 154.7,169 211,88.5
                             294.5,80.5 380,165.2 437,75.5 469.5,223.3 	"/>
                </g>
                <g id="Layer_4">
                    <polygon stroke-miterlimit="10" points="469.3,222.7 1,222.7 48.7,166.7 155.7,188.3 212,132.7
                             296.7,128 380.7,184.3 436.7,125 	"/>
                </g>
            </g>
        </defs>
    </svg>

    <script src="https://code.getmdl.io/1.3.0/material.min.js"></script>

    <script>
                            var button = document.createElement('button');
                            var textNode = document.createTextNode('Click Me!');
                            button.appendChild(textNode);
                            button.className = 'mdl-button mdl-js-button mdl-js-ripple-effect';
                            componentHandler.upgradeElement(button);
                            document.getElementById('container').appendChild(button);
    </script>
</body>
</html>
