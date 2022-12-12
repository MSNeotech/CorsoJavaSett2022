<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- JQuery -->
<script src="https://code.jquery.com/jquery-3.6.1.min.js" type="text/javascript"></script>

<!-- Boostrap -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
</head>
<body>

<h1>${datoInviatoDalServer}</h1>
<div class="clearfix">
   <div class="row">
     <div class="col-md-4">
          campo 1:<input type="text" class="form-control" id="campo1">
          campo 2:<input type="text" class="form-control" id="campo2">
          campo 3:<input type="text" class="form-control" id="campo3">
     </div>   
   
   <div class="col-md-2">
   <button type="button" id="pulsante_piu" class="btn btn-success">+</button>
   <button type="button" id="pulsante_meno" class="btn btn-warning">-</button>
   <button type="button" id="pulsante_per" class="btn btn-info">X</button>
   </div>
   <div class="col-md-6">
   <div class="progress">
      <div id="progress" class="progress-bar progress-bar-striped" style="width: 10%" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100"></div>
   </div>
   
   </div>
  </div>
</div>  
</body>
<script>
var testo="${datoInviatoDalServer}";
var click=0;
$(".btn").click(
	function(){
	$("#progress").css('width', click+'%');
	$("#progress").attr('aria-valuenow', click);
	}	
   );


$("#pulsante_piu").click(
	function(){
	click=click+10;	
	var valore1=parseInt($("#campo1").val());
	var valore2=parseInt($("#campo2").val());
	var somma=valore1+valore2;
	$("#campo3").val(somma);
	}	
  );

$("#pulsante_meno").click(
		function(){
		click=click+10;
		var valore1=parseInt($("#campo1").val());
		var valore2=parseInt($("#campo2").val());
		var sottrazione=valore1-valore2;
		$("#campo3").val(sottrazione);
		}	
	  );

$("#pulsante_per").click(
		function(){
		click=click+10;
		var valore1=parseInt($("#campo1").val());
		var valore2=parseInt($("#campo2").val());
		var moltiplicazione=valore1*valore2;
		$("#campo3").val(moltiplicazione);
		}	
	  );
</script>


</html>