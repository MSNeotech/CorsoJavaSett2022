$( document ).ready(function() {

//getCount.recount button
$("#btnRecount").click(function() {
  datas=fire_ajax_get("api/getCountElementi");
  $("#countValue").text(datas.simpleData);
});
   

//getList.reload button
$("#btnReload").click(function() {
   $('#tableDatas tbody').empty();
  datas=fire_ajax_get("api/getListaElementi");
   var table = $("#tableDatas tbody");
    $.each(datas.elementi, function(idx, elem){
        table.append("<tr><td>"+elem.id+"</td><td>"+elem.descrizione+"</td><td><button  type='button' class='btn btn-warning'>cancella</button></td></tr>");
    });
});
   

//insert.add
$("#btnAdd").click(function() {
     data={
	       id:$("#id").val(),
           descrizione:$("#descrizione").val()
     }
    resp=fire_ajax_post("api/addElemento",data);
    
   //message
   
   if(resp.code=='OK'){
	    $(document).Toasts('create', {
        class: 'bg-success',
        title: 'Toast Title',
        subtitle: 'Subtitle',
        body: 'Operazione eseguita con successo'
      });
   }
if(resp.code=='KO'){
	    $(document).Toasts('create', {
        class: 'bg-danger',
        title: 'Toast Title',
        subtitle: 'Subtitle',
        body: 'Attenzione! operazione non riuscita'
      });
   }

});




});