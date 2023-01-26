$(document).ready(function() {
  $.ajax({
    type: "GET",
    url: "http://localhost:8080/MSORR_geo_ms/listaRegioni",
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
      url: "http://localhost:8080/MSORR_geo_ms/listaProvince?idReg=" + idReg,
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
    $.ajax({
      type: "GET",
      url: "http://localhost:8080/MSORR_geo_ms/listaComuni?sigla=" + idProv,
      success: function(data) {
        data.forEach(function(comune) {
          $("#comune").append(new Option(comune.nome, comune.id));
        });
      }
    });
  });
$("#meteoAuto").autocomplete({
    source: function( request, response ) {
      $.ajax({
        url: "http://localhost:8080/MSORR_geo_ms/listaComuniAutocomplete?text="+request.text,
        dataType: "json",
        
        success: function( data ) {
          response( data.simpleData );
        }
      });
    },
    minLength: 3,
    select: function( event, ui ) {
        alert("id:"+ui.item.id+" titolo:"+ui.item.value);
      },
    open: function() {
      $( this ).removeClass( "ui-corner-all" ).addClass( "ui-corner-top" );
    },
    close: function() {
      $( this ).removeClass( "ui-corner-top" ).addClass( "ui-corner-all" );
    }
  });

   });
