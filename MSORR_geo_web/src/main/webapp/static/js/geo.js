$( document ).ready(function() {

const region = [
    {id: 1, nome: "Lazio"},
    {id: 2, nome: "Campania"},
    {id: 3, nome: "Piemonte"}
];

const province = [
    {id: 1, nome: "Roma", regioneId: 1},
    {id: 2, nome: "Napoli", regioneId: 2},
    {id: 3, nome: "Milano", regioneId:3}
    
];

const comuni = [
    {id: 1, nome: "Frascati", provinciaId: 1},
    {id: 2, nome: "Pompei", provinciaId: 2},
    {id: 3, nome: "Cinisello Balsamano", provinciaId: 3},
   
];
	
const selectRegione = document.getElementById("regione");
const selectProvincia = document.getElementById("provincia");
const selectComune = document.getElementById("comune");

selectRegione.addEventListener("change", (event) => {
    // recupera il valore selezionato
    const regioneSelezionata = event.target.value;
    // genera dinamicamente le opzioni per la select provincia
    let options = "";
    province.forEach(provincia => {
       if (provincia.regioneId == regioneSelezionata) {
            options += `<option value="${provincia.id}">${provincia.nome}</option>`;
        }
     
    });
    // abilita la select provincia
    selectProvincia.disabled = false;
    selectProvincia.innerHTML = options;
});

selectProvincia.addEventListener("change", (event) => {
    // recupera il valore selezionato
    const provinciaSelezionata = event.target.value;
    // genera dinamicamente le opzioni per la select comune
    let options = "";
    comuni.forEach(comune => {
        if (comune.provinciaId == provinciaSelezionata) {
            options += `<option value="${comune.id}">${comune.nome}</option>`;
        }
    });
    selectComune.innerHTML = options;
});


	
});