$(document).ready(function(){
	
 var colonne=[];
 var cerchioIns=[];

	
	for (var i=0; i<8; i++){
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
	checkWin(colore);
	
	})
	
	
function checkWin(x){

var sum=0;
//Controllo delle righe
for(var i=8; i>0;i--){
	//for(var j=0;j<8;j++){
	if (cerchioIns.css("background-color")==x) sum++;
	if(sum==8) alert("Hai vinto");
          

	
	//}
} //Controllo colonne
/*for(var k=1;k<=8;k++){
    for(l=1;l<=6;l++){
      var cell = $("#riga" +l+ "_"+k);
      if (cell.find('div').css('background-color')==='rgb(0, 0, 255)'){
        sum+=1;
      }
      else{
        sum=0;
      }

    if(sum>=4){
      console.log("blue wins vertically");
      return true;
    }
  }
  sum=0;
  }*/
}

});