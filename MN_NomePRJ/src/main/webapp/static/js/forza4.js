var ultimaCellaPienaC1=9;
var ultimaCellaPienaC2=9;
var ultimaCellaPienaC3=9;
var ultimaCellaPienaC4=9;
var ultimaCellaPienaC5=9;
var ultimaCellaPienaC6=9;
var ultimaCellaPienaC7=9;
var ultimaCellaPienaC8=9;


$(document).ready(function() {

$("#bg1").click(
function (){
	
    ultimaCellaPienaC1=ultimaCellaPienaC1-1;
    
	$("#c"+ultimaCellaPienaC1+"1").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC1+"1").addClass("cellaGialla");
	controllaVincita(1,ultimaCellaPienaC1)
}	
);


$("#br1").click(
function (){
	ultimaCellaPienaC1=ultimaCellaPienaC1-1;
    
	$("#c"+ultimaCellaPienaC1+"1").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC1+"1").addClass("cellaRossa");
	controllaVincita(1,ultimaCellaPienaC1)
}	
);


$("#bg2").click(
function (){
	
    ultimaCellaPienaC2=ultimaCellaPienaC2-1;
    
	$("#c"+ultimaCellaPienaC2+"2").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC2+"2").addClass("cellaGialla");
		controllaVincita(2,ultimaCellaPienaC2)
}	
);


$("#br2").click(
function (){
	ultimaCellaPienaC2=ultimaCellaPienaC2-1;
    
	$("#c"+ultimaCellaPienaC2+"2").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC2+"2").addClass("cellaRossa");
	controllaVincita(2,ultimaCellaPienaC2);
}	
);



$("#bg3").click(
function (){
	
    ultimaCellaPienaC3=ultimaCellaPienaC3-1;
    
	$("#c"+ultimaCellaPienaC3+"3").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC3+"3").addClass("cellaGialla");
		controllaVincita(3,ultimaCellaPienaC3)

}
);


$("#br3").click(
function (){
	ultimaCellaPienaC3=ultimaCellaPienaC3-1;
    
	$("#c"+ultimaCellaPienaC3+"3").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC3+"3").addClass("cellaRossa");
	controllaVincita(3,ultimaCellaPienaC3);
}	
);


$("#bg4").click(
function (){
	
    ultimaCellaPienaC4=ultimaCellaPienaC4-1;
    
	$("#c"+ultimaCellaPienaC4+"4").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC4+"4").addClass("cellaGialla");
		controllaVincita(4,ultimaCellaPienaC4)
}	
);


$("#br4").click(
function (){
	ultimaCellaPienaC4=ultimaCellaPienaC4-1;
    
	$("#c"+ultimaCellaPienaC4+"4").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC4+"4").addClass("cellaRossa");
	controllaVincita(4,ultimaCellaPienaC4);
}	
);

$("#bg5").click(
function (){
	
    ultimaCellaPienaC5=ultimaCellaPienaC5-1;
    
	$("#c"+ultimaCellaPienaC5+"5").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC5+"5").addClass("cellaGialla");
	controllaVincita(5,ultimaCellaPienaC5)
}	
);


$("#br5").click(
function (){
	ultimaCellaPienaC5=ultimaCellaPienaC5-1;
    
	$("#c"+ultimaCellaPienaC5+"5").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC5+"5").addClass("cellaRossa");
	controllaVincita(5,ultimaCellaPienaC5)
}	
);

$("#bg6").click(
function (){
	
    ultimaCellaPienaC6=ultimaCellaPienaC6-1;
    
	$("#c"+ultimaCellaPienaC6+"6").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC6+"6").addClass("cellaGialla");
	controllaVincita(6,ultimaCellaPienaC6)
}	
);


$("#br6").click(
function (){
	ultimaCellaPienaC6=ultimaCellaPienaC6-1;
    
	$("#c"+ultimaCellaPienaC6+"6").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC6+"6").addClass("cellaRossa");
	controllaVincita(6,ultimaCellaPienaC6)
}	
);

$("#bg7").click(
function (){
	
    ultimaCellaPienaC7=ultimaCellaPienaC7-1;
    
	$("#c"+ultimaCellaPienaC7+"7").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC7+"7").addClass("cellaGialla");
	controllaVincita(7,ultimaCellaPienaC7)
}	
);


$("#br7").click(
function (){
	ultimaCellaPienaC7=ultimaCellaPienaC7-1;
    
	$("#c"+ultimaCellaPienaC7+"7").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC7+"7").addClass("cellaRossa");
	controllaVincita(7,ultimaCellaPienaC7)
}	
);

$("#bg8").click(
function (){
	
    ultimaCellaPienaC8=ultimaCellaPienaC8-1;
    
	$("#c"+ultimaCellaPienaC8+"8").removeClass("cellaRossa");
	$("#c"+ultimaCellaPienaC8+"8").addClass("cellaGialla");
	controllaVincita(8,ultimaCellaPienaC8)
}	
);


$("#br8").click(
function (){
	ultimaCellaPienaC8=ultimaCellaPienaC8-1;
    
	$("#c"+ultimaCellaPienaC8+"8").removeClass("cellaGialla");
	$("#c"+ultimaCellaPienaC8+"8").addClass("cellaRossa");
	controllaVincita(8,ultimaCellaPienaC8)
}	
);



});

function controllaVincita(x,y){

//Verifica per colonna
var contacolonneRosse=0;
var contacolonneGialle=0;
for(var i=8;i>0;i--){
	if ($("#c"+i+x).hasClass("cellaRossa")) contacolonneRosse++;
	else if($("#c"+i+x).hasClass("cellaGialla"))contacolonneGialle++;
	if(contacolonneRosse==4) {
	alert("Hai vinto rosso con col");
	contacolonneRosse=0;
	}
	else if(contacolonneGialle==4) {
	alert("Hai vinto giallo con col");
	contacolonneGialle=0;
	}
	}
	
//Verifica per riga
var contacelleRosse=0;
var contacelleGialle=0;
for(var j=0;j<9;j++){	
	if ($("#c"+y+j).hasClass("cellaRossa")) contacelleRosse++;
	else if($("#c"+y+j).hasClass("cellaGialla"))contacelleGialle++;
	if(contacelleRosse==4) {
	alert("Hai vinto rosso con rig");
	contacelleRosse=0;
	}
	else if(contacelleGialle==4) {
	alert("Hai vinto giallo con rig");
	contacelleGialle=0;
	}
}
	
}



