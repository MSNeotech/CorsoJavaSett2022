$(document).ready(function(){
	const regioni = [
		{id: 1, nome: "Lazio"},
		{id: 2, nome: "Campania"},
		{id: 3, nome: "Piemonte"}
	];
	const province = [
		{id: 1, nome: "Roma", regioneId: 1},
		
		{id: 2, nome: "Frosinone", regioneId: 1},
		
		{id: 3, nome: "Napoli", regioneId: 2},
		
		{id: 4, nome: "Salerno", regioneId: 2},
		
		{id: 5, nome: "Asti", regioneId: 3},
		
		{id: 6, nome: "Alessandria", regioneId: 3}
		
	];
	const comuni = [
		{id: 1, nome: "Frascati", provinciaId: 1},
		{id: 2, nome: "Anzio", provinciaId: 1},
		
		{id: 3, nome: "Isola del Liri", provinciaId: 2},
		{id: 4, nome: "Alatri", provinciaId: 2},
		
		{id: 5, nome: "Pompei", provinciaId: 3},
		{id: 6, nome: "Sorrento", provinciaId: 3},
		
		{id: 7, nome: "Acerno", provinciaId: 4},
		{id: 8, nome: "Agropoli", provinciaId: 4},
		
		{id: 9, nome: "Agliano Terme", provinciaId: 5},
		{id: 10, nome: "Albugniano", provinciaId: 5},
		
		{id: 11, nome: "Acquiterme", provinciaId: 6},
		{id: 12, nome: "Albera ligure", provinciaId: 6}
		
	
	];
	
	regioni.forEach(function(regione) {
	    $("#regione").append(new Option(regione.nome, regione.id));
	});
		
	$("#regione").change(function(){
		var idReg=$("#regione").val();
		$("#provincia").empty();
		$("#comune").empty();
		province.forEach(function(provincia) {
		    if(provincia.regioneId == idReg){
			$("#provincia").append(new Option(provincia.nome, provincia.id));
}
});
    $("#provincia").attr("disabled", false);
});
	$("#provincia").change(function(){
    var idProvincia = $("#provincia").val();
    $("#comune").empty();
    comuni.forEach(function(comune) {
        if(comune.provinciaId == idProvincia){
            $("#comune").append(new Option(comune.nome, comune.id));
        }
    });
    $("#comune").attr("disabled", false);
});

		
});