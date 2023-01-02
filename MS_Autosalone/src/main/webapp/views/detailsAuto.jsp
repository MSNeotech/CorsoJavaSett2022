<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Template</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="static/js/plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="static/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">
  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="index3.html" class="nav-link">Home</a>
      </li>
    </ul>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
    
    </ul>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a  class="brand-link">
      <span class="brand-text font-weight-light">neotech</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user (optional) -->

      <!-- SidebarSearch Form -->

      <!-- Sidebar Menu -->
      <nav class="mt-2">
         <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item">
            <a href="home" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>Home</p>
            </a>
          </li>
          <li class="nav-item">
            <a href="listAuto" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>Lista Automobili</p>
            </a>
          </li>
          <li class="nav-item">
            <a href="addAuto" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>Aggiungi Auto</p>
            </a>
          </li>
           <li class="nav-item">
            <a href="removeAuto" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>Rimuovi Auto</p>
            </a>
          </li>
          <li class="nav-item">
            <a href="insertData" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>Cerca Auto</p>
            </a>
          </li>
          <li class="nav-item">
            <a href="detailsAuto" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>Dettaglio Auto</p>
            </a>
          </li>
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
    <div class="clearfix">
       <div class="row">
          <div class="col-md-2" >
          <div class= "form-group">
          <label>ID</label>
          <input id="id" class= "form-control" name="id" type="text" value="${auto.id}">
          </div>
          </div>
          <div class="col-md-5"></div>
          <div class="col-md-5"></div>
       </div>
    </div>
        <h3>Dettagli Auto</h3>
        
    <div class="container">
    <div class="row">

    <div class="col-md-4">
    <div class= "form-group">
  
          <label>TARGA</label>
          <input id="targa" class= "form-control" name="targa" type="text" value="${auto.targa}">
          </div>
           <div class= "form-group">
          <label>ALIMENTAZIONE</label>
          <input id="alimentazione" class= "form-control" name="alimentazione" type="text" value="${auto.alimentazione}">
          </div>
           <div class= "form-group">
          <label>COSTO</label>
          <input id="costo" class= "form-control" name="costo" type="text" value="${auto.costo}">
          </div>
    </div>
    
     <div class="col-md-4">
     <div class= "form-group">
          <label>COSTRUTTORE</label>
          <input id="costruttore" class= "form-control" name="costruttore" type="text" value="${auto.costruttore}">
          </div>
          <div class= "form-group">
          <label>ANNO</label>
          <input id="annoCostruzione" class= "form-control" name="anno" type="text" value="${auto.annoCostruzione}">
          </div>
     </div>
      <div class="col-md-4">
       <div class= "form-group">
          <label>MODELLO</label>
          <input id="modello" class= "form-control" name="modello" type="text" value="${auto.modello}">
          </div>
           <div class= "form-group">
          <label>COLORE</label>
          <input id="colore" class= "form-control" name="colore" type="text" value="${auto.colore}">
          </div>
      </div>
    </div>
    </div>
    
  <h3>ACCESSORI</h3>
  <div class="container">
  <div class="row">
  <div class="col-md-4">
    <table class="table table-bordered table-hover dataTable dtr-inline">
              <thead>
              <td>Id</td>
              <td>Classe</td>
              <td>Tipologia</td>
              <td>Descrizione</td>
              <td>Costo</td>
              </thead>
              <tbody>
               <c:forEach var="accessori" items="${listaccessori}" >
                        <tr>
                        <td>${accessori.id}</td>
                        <td>${accessori.classe}</td>
                        <td>${accessori.tipologia}</td>
                        <td>${accessori.descrizione}</td>
                        <td>${accessori.costo}</td>
                        </tr>
              </c:forEach>
              </tbody>
              </table>
              </div>
  <div class="col-md-4"></div>
  <div class="col-md-4"></div>
  
  </div>
  </div>

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <footer class="main-footer">
    <div class="float-right d-none d-sm-block"><a href="www.neotech.srl">www.neotech.srl</a></div>
    <strong>template</strong>
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="static/js/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="static/js/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="static/js/adminlte.min.js"></script>
<!-- Demo Template -->
<script src="static/js/fireAjax.js"></script>
<script src="static/js/demoTemplate.js"></script>

</body>
</html>
