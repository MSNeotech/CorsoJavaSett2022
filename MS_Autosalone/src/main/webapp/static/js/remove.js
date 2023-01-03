$(document).ready(function() {

$('button.btn-success').click(function() {

var Rows = $('input[type="checkbox"]:checked');

Rows.each(function() {
var idRemove = $(this).closest('tr').find('td:eq(1)').text();

$('#form-remove').append('<input type="hidden" name="idRemove[]" value="' + idRemove + '">');
});

$('#form-remove').submit();
});
});