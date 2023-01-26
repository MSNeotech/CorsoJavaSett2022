$(document).ready(function(){
	$.ajax({
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
	          $("#provincia").append(new Option(provincia.nome, provincia.id));
	        });
	      }
	    });
	  });

	  $("#provincia").change(function() {
	    var idProv = $("#provincia").val();
	    $("#comune").empty();
	    $("#provincia").change(function() {
	        var idProv = $("#provincia").val();
	        $("#comune").empty();
	        $.ajax({
	          type: "GET",
	          url: "http://localhost:8080/MSORR_geo_1.1_ms/listaComuni?sigla=" + idProv,
	          success: function(data) {
	            data.forEach(function(comune) {
	              $("#comune").append(new Option(comune.nome, comune.id));
	            });
	          }
	        });
	
	$("#meteoAuto").autocomplete({
	      source: function( request, response ) {
	        $.ajax( {
	          url: "http://localhost:8080/MSORR_geo_1.1_ms/listaComuniAutocomplete",
	          contentType: "application/json",
	          data: {
	            term: request.term
	          },
	          success: function( data ) {
	            response( data.nomiComuni );
	          }
	        } );
	      },
	      minLength: 2,
	      select: function( event, ui ) {
	    	istat=ui.item.id;
	      }
	});
});
});
});
