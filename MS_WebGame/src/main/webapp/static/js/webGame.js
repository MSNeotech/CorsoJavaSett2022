$( document ).ready(function() {
   
  $("#c1,#c2,#c3,#c4,#c5,#c6,#c7,#c8,#c9").hide();
  $("#box1,#box2,#box3,#box4,#box5,#box6").hide();
  $("#win,#loser").hide();
 
	$("#bottoneScelta").click(function(){
		var parola= $("#inputScelta").val();
		if(parola=="P" && parola==array.indexOf(0)){
			$("#box1").show()
		}
        else if(parola=="O"){
	       $("#box2").show()
         }
        else if(parola=="T"){
	        $("#box3").show()
	        $("#box4").show()
             }
        else if(parola=="E"){
	    $("#box5").show()
	    }
        else if(parola=="R"){
	      $("#box6").show()
	      }        
       });    
       	 
});