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
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
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
         
         <input id="meteoAuto" name="meteoAuto" class="form-control basicAutoComplete" type="text" autocomplete="off">
		  </select>
</div>
</div>
</div>
<script>
$(document).ready(function(){
	

	    $.ajax({
	        type: "GET",
	        url: "http://localhost:8080/MSORR_geo_1.1_ms/listaRegioni",
	        success: function(data){
	            $.each(data.regione, function(index, value){
	                $("#regione").append("<option value='"+value.id_regione+"'>"+value.nome+"</option>");
	            });
	        }
	    });
});


   /*  $.ajax({
        type: "GET",
        url: "http://localhost:8080/MSORR_geo_1.1_ms/listaRegioni",
        success: function(data) {
          data.forEach(function(regione) {
            $("#regione").append(new Option(regione.nome, regione.id));
          });
        }
    });
    $("#regione").change(function() {
        var idReg = $("#regione").val();
        $("#provincia").empty();
        $("#comune").empty();
        $.ajax({
          type: "GET",
          url: "http://localhost:8080/MSORR_geo_1.1_ms/listaProvince?id_regione=" + idReg,
          success: function(data) {
            data.forEach(function(provincia) {
              $("#provincia").append(new Option(provincia.nome, provincia.sigla));
            });
          }
        });
    });
    $("#provincia").change(function() {
        var sigla = $("#provincia").val();
        $("#comune").empty();
        $.ajax({
          type: "GET",
          url: "http://localhost:8080/MSORR_geo_1.1_ms/listaComuni?sigla=" + sigla,
          success: function(data) {
            data.forEach(function(comune) {
              $("#comune").append(new Option(comune.nome, comune.id));
            });
          }
        });
    }); */
// });


</script>
</body>
</html>