$(document).ready(function(){
	
 var colonne=[];
 var cerchioIns=[];

	
	for (var i=0; i<7; i++){
		var col=0;
		colonne.push(col);
	}
	
$(":button").click(function(){
	var colore;
	if ($(this).is("#P1")) colore="#d1140f";
	else if ($(this).is("#P2")) colore="#E6E6FA";
	var pulsValue=$(this).val();
	var riga=colonne[pulsValue];
	var cerchioCol=[colore, pulsValue, riga];
	cerchioIns.push(cerchioCol);
	colonne[pulsValue]++; 
	$("#"+pulsValue+"_"+riga).css("background-color", colore);
	
	})

});