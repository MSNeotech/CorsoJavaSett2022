<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
<!-- Jquery -->
<script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
<script src="static/js/geo.js"> </script>
<title>Meteo</title>
</head>
<body>
<div class ="container">
<div class="row">
<div class="col-md-4">
<div class= "form-group">
          <label>Regione </label>
          <select id="regione" name="regione" class="form-control select2bs4 select2-hidden-accessible">
          <option value="">Selezione un opzione</option>
          <option value="lazio">Lazio</option>
	      <option value="campania">Campania</option>
	      <option value="piemonte">Piemonte</option>
		  </select>
</div>
</div>
<div class="col-md-4">
<div class= "form-group">
          <label>Provincia</label>
          <select id="provincia" name="provincia" class="form-control select2bs4 select2-hidden-accessible" disabled>
          <option value="">Seleziona una provincia</option>
</select>
</div>
</div>
<div class="col-md-4">
<div class= "form-group">
          <label>Comune</label>
          <select id="comune" name="comune" class="form-control select2bs4 select2-hidden-accessible" disabled>
          <option value="">Seleziona un comune</option>
           </select>
</div>
</div>
</div>
</div>
<div class="container">
<div class="md-col-12">
<div class= "form-group">
          <label>Comune</label>
          <select id="comune" name="comune" class="form-control select2bs4 select2-hidden-accessible">
          <option value="">Selezione un opzione</option>
		  </select>
</div>
</div>
</div>



</body>
</html>