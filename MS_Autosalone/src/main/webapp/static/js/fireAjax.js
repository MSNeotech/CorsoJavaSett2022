//Chiama l'API e ritorna il JSON
var fire_ajax_post = function (send_url, send_data) {
    var retValue = null;
    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: send_url,
        data: JSON.stringify(send_data),
        dataType: 'json',
        cache: false,
        async:false,
       // 200
        success: function (data) {
            retValue= data;
        },
        error: function (e) {
            console.log(e);
        }
    });
     return retValue;
};



var fire_ajax_get = function(send_url) {
    var retValue = null;
    $.ajax({
        type: "GET",
        contentType: "application/json",
        url: send_url,
        cache: false,
        async:false,
        success: function (data) {
            retValue= data;
        },
        error: function (e) {
            console.log("ERROR : ", e);
        }
    });
    return retValue;
 };