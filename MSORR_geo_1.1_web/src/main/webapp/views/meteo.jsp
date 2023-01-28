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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<script src="static/js/fireAjax.js"></script>

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
          <select id="provincia" name="provincia" class="form-control select2bs4 select2-hidden-accessible">
          <option value="">Seleziona una provincia</option>
</select>
</div>
</div>
<div class="col-md-4">
<div class= "form-group">
          <label>Comune</label>
          <select id="comune" name="comune" class="form-control select2bs4 select2-hidden-accessible">
          <option value="">Seleziona un comune</option>
           </select>
</div>
</div>
</div>


<div class="row">
<div class="md-col-12">
<div class= "form-group">
          <label>Comune</label>
         <input id="meteoAuto" name="meteoAuto" class="form-control basicAutoComplete" type="text" autocomplete="off">
		  </select>
</div>
</div>
</div>

<div class="row">
<div class="col-md-12">
<button type="button" id="prevPuls" class="btn btn-lg btn-primary">Previsioni</button>
</div>

</div>

<div class="row">
<div class="col-md-2"></div>
<div class="col-md-8">
<table id="tabPrev" class="table table-light table-striped">
<tr><th>Giorno</th><th>Previsioni</th><th>Temp max</th><th>Temp min</th><th>Precipitazioni</th></tr>
<tbody id="bodyPrev">
</tbody>
</table>
</div>
<div class="col-md-2"></div>
</div>
</div>
</div>
		
<script>
$(document).ready(function(){
	var istat;
	//getList.reload button
	   //$('#tableDatas tbody').empty();
	  datas=fire_ajax_get("http://localhost:8080/MSORR_geo_1.1_ms/listaRegioni");
	   //var table = $("#tableDatas tbody");
	    $.each(datas.regione, function(idx, value){
	    $("#regione").append("<option value='"+value.id+"'>"+value.name+"</option>");
	    });
	
	$("#regione").change(function() {
		var idRegione = $("#regione").val();
		   $("#provincia").empty();
		   //$('#tableDatas tbody').empty();
		  datas=fire_ajax_get("http://localhost:8080/MSORR_geo_1.1_ms/listaProvince?id_regione=" +idRegione);
		   //var table = $("#tableDatas tbody");
		    $.each(datas.province, function(idx, value){
		     $("#provincia").append("<option value='"+value.sigla+"'>"+value.nome+"</option>");
		
		    });
		});
	
	$("#provincia").change(function() {
		var sigla = $("#provincia").val();
		   $("#comune").empty();
		   //$('#tableDatas tbody').empty();
		  datas=fire_ajax_get("http://localhost:8080/MSORR_geo_1.1_ms/listaComuni?sigla=" +sigla);
		   //var table = $("#tableDatas tbody");
		    $.each(datas.comuni, function(idx, value){
		     $("#comune").append("<option value='"+value.istat+"'>"+value.nome+"</option>");
		
		    });
		});
	
	$("#meteoAuto").autocomplete({
	    source: function( request, response ) {
	      $.ajax({
	        url: "http://localhost:8080/MSORR_geo_1.1_ms/listaComuniAutocomplete?text="+request.term,
	        dataType: "json",
	        
	        success: function( data ) {
	          response( data.nomiComuni );
	        }
	      });
	    },
	    minLength: 3,
	    select: function( event, ui ) {
	    	istat=ui.item.id;
	    	
	      },
	    open: function() {
	      $( this ).removeClass( "ui-corner-all" ).addClass( "ui-corner-top" );
	    },
	    close: function() {
	      $( this ).removeClass( "ui-corner-top" ).addClass( "ui-corner-all" );
	    }
	  });
	
	$("#comune").change(function(){
		istat=$("#comune").val();
		$("#prevPuls").prop("disabled", false);
	})
	
	$("#prevPuls").click(function(){
	
	var previsioni=fire_ajax_get("http://localhost:8080/MSORR_geo_1.1_ms/getMeteo?istat="+istat);
	var iconaMeteo;
	$("#bodyPrev").empty();
	previsioni.previsioni.forEach(function(previsione){
		
		   if (previsione.codiceMeteo==0 || previsione.codiceMeteo==1) iconaMeteo="<i class='fa-solid fa-sun'></i> soleggiato";
		        else if (previsione.codiceMeteo==2 || previsione.weathercode==3) iconaMeteo="<i class='fa-solid fa-cloud'></i> nuvoloso";
		        else if (previsione.codiceMeteo<60) iconaMeteo="<i class='fa-solid fa-smog'></i> nebbia";
		        else if (previsione.codiceMeteo<70) iconaMeteo="<i class='fa-solid fa-cloud-rain'></i> pioggia";
		        else if (previsione.codiceMeteo<80) iconaMeteo="<i class='fa-regular fa-snowflake'></i> neve"
		        else if (previsione.codiceMeteo<85) iconaMeteo="<i class='fa-solid fa-cloud-showers-heavy'></i> rovesci";
		        else if (previsione.codiceMeteo<90) iconaMeteo="<i class='fa-solid fa-cloud-meatball'></i> bufera";
		        else iconaMeteo="<i class='fa-solid fa-cloud-bolt'> temporale</i>";
	$("#bodyPrev").append("<tr><td>"+previsione.data+"</td><td>"+iconaMeteo+"</td><td>"+previsione.tempMin+"</td><td>"+previsione.tempMin+"</td><td>"+previsione.precipitazione+"</td></tr>");

			})
		
	});
});

	   
</script>
</body>
</html>