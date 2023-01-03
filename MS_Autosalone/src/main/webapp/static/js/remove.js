$(document).ready(function() {

  $('button.btn-success').click(function() {
  
    var Rows = $('input[type="checkbox"]:checked');
   
    var idRemoveArray = [];
    
    Rows.each(function() {
      var idRemove = $(this).val();
      idRemoveArray.push(idRemove);
    });
   
    $('#form-remove').append('<input type="hidden" name="idRemoveArray" value="' + idRemoveArray + '">');
   
    Rows.closest('tr').remove();

    $('#form-remove').submit();
  });
});
