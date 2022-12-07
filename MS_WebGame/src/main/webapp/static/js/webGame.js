$( document ).ready(function() {
   
  $("#c1,#c2,#c3,#c4,#c5,#c6,#c7,#c8,#c9").hide();
 
 var parola="POTTER";
 var contaErrori=0;
 var contaCorretti=0;
 
	$("#bottoneScelta").click(function(){
		
		var lettera= $("#inputScelta").val();
		
	    if(parola.indexOf(lettera)==-1){
		
		contaErrori+=1;
		$("#c" +contaErrori).show();
	     } 
	     
	     else{
	     if(lettera=="P") {
		$("#box1").val("P");
		contaCorretti++;
		}
		
        else if(lettera=="O") {
	    $("#box2").val("O");
	     contaCorretti++;
}
        
        else if(lettera=="T"){
	    $("#box3").val("T")
	    $("#box4").val("T")
	    contaCorretti++;
         } 
          
        else if(lettera=="E"){
	     $("#box5").val("E")
	     contaCorretti++;
} 
        else if(lettera=="R"){
	    $("#box6").val("R")
	     contaCorretti++;
} 
}
      if(contaErrori==9) alert("Hai perso!!");
	  else if(contaCorretti==6) alert("Hai vinto!!");
                    
        
       }); 
       
     	 
});