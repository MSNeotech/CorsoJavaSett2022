$(document).ready(function() {
	
	$("#tabella_impiccato td").hide();
    
    $("#ultimoPulsante").removeClass("btn-info");
    $("#ultimoPulsante").addClass("btn-warning");
    $("#ultimoPulsante").animate({left: '250px'});
    
    
    
    $("#ultimoPulsante").click(
	function (){
      $("#ultimoPulsante").removeClass("btn-warning");
      $("#ultimoPulsante").addClass("btn-danger");
	}
	
    );
    
    
    
//    $(".btn-info").click(
//	 function(){
//		$("#c1").show();
//	}
//
//)
//    //bind 
//    $(".btn").dblclick(
//		function() {
//			  alert("è stato premuto un qualsiasi pulsante");
//			 }	
//  );
  
  //bind
  $("#pulsante_verde, #pulsante_nero").click(
  function() {
  $("#pulsante_rosso").hide();
 });


$("#validationCustom01").keypress(
	function(){
		$("#pulsante_rosso").removeClass("btn-danger");
		$("#pulsante_rosso").addClass("btn-success");
	}
);




//bind.
$("#pulsante_giallo").click(
	function() {
	  $("#pulsante_rosso").show();
	  //$("#validationCustom01").val("ciaooooo");
	  var testo=$("#validationCustom01").val();
	  alert(testo);
	}
	);
  
  
});

