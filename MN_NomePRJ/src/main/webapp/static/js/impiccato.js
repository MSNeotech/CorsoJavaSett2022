var parola="GENOVA";
var contaErrori=0;
var contaCorretti=0;

$(document).ready(   function() {
$("#alert_vinto").hide();
$("#alert_perso").hide();
	
	
$("#btn_scelta").click(
	function(){
		var caratterePremuto=$("#text_scelta").val();
		
		//trova l'indice di caratterePremuto dento parola -1:carattere non trovato'
		if (parola.indexOf(caratterePremuto) == -1){
			contaErrori=contaErrori+1;
			$("#v"+contaErrori).removeClass("fa-shield");
			$("#v"+contaErrori).addClass("fa-shield-halved");
		}
		else {
			 contaCorretti=contaCorretti+1;
			 if(caratterePremuto=="G") $("#l1").val("G");
			 if(caratterePremuto=="E") $("#l2_").val("E");
			 if(caratterePremuto=="N") $("#l3").val("N");
			 if(caratterePremuto=="O") $("#l4").val("O");
			 if(caratterePremuto=="V") $("#l5").val("V");
			 if(caratterePremuto=="A") $("#l6").val("A");	  
		}
		
		
	if(contaErrori==6)   $("#alert_perso").show();
	if(contaCorretti==6) $("#alert_vinto").show();
	}
);
	
});