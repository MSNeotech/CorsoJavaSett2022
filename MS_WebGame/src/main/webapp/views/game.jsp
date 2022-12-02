<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}

th, td {
  padding: 50px;
}
</style>
<meta charset="UTF-8">
<title>Gioco dell'impiccato</title>
<!-- JQuery -->
<script src="https://code.jquery.com/jquery-3.6.1.min.js" type="text/javascript"></script>
<!-- Boostrap -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="static/js/webGame.js"></script>
</head>
<body>
<div class="container">

<div class="row">
<div class="col-md-3"></div>
<div class="col-md-6">
<input type="text" id="box1" value="P" size=2>
<input type="text" id="box2" value="O" size=2>
<input type="text" id="box3" value="T" size=2>
<input type="text" id="box4" value="T" size=2>
<input type="text" id="box5" value="E" size=2>
<input type="text" id="box6" value="R" size=2>
</div>
<div class="col-md-3"></div>
</div>

<div class="row">
<div class="col-md-3">
<input type="text" size=2 id="inputScelta">
<button type="button" id="bottoneScelta">Scelta</button> 
</div>
<div class="col-md-9"></div>
</div>

<div class="row">
<div class="col-md-3"></div>
<div class="col-md-6">
<table border=2px>
  <tr>
    <th id="c1" bgcolor="#FF0101"></th>
    <th id="c2" bgcolor="#000000"></th>
    <th id="c3" bgcolor="#FF0101"></th>
  </tr>
  <tr>
     <th id="c4" bgcolor="#000000"></th>
     <th id="c5" bgcolor="#000000"></th>
     <th id="c6" bgcolor="#000000"></th>
  </tr>
  <tr>
     <th id="c7" bgcolor="#000000"></th>
     <th id="c8" bgcolor="#000000"></th>
     <th id="c9" bgcolor="#000000"></th>
  </tr>
</table>
</div>
<div class="col-md-3"></div>
</div>

<div class="row">
<div class="col-md-6">
<h3 id="win">Hai vinto!!</h3>
<h3 id="loser">Hai perso!!</h3>
</div>
<div class="col-md-6"></div>
</div>

</div>
</body>
</html>