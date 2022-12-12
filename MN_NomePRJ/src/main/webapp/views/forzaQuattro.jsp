<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- JQuery -->
<script src="https://code.jquery.com/jquery-3.6.1.min.js" type="text/javascript"></script>

<!-- Boostrap -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>


<!-- font awesome -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">

<script src="static/js/forza4.js"></script>
<style>
table, th, td {
  border: 1px solid black;
  width:30px;
  height:30px;
}

.cellaGialla{
   background-color:yellow;
}

.cellaRossa{
   background-color:red;
}

</style>
</head>


<body>
<p>ForzaQuattro!</p>
<div class="clearfix">
  <div class="row">
   <div class="col-md-4"></div>
   
   <div class="col-md-4">
      <table>
      <tr><td id="c11"></td><td id="c12"></td><td id="c13"></td><td id="c14"></td><td id="c15"></td><td id="c16"></td><td id="c17"></td><td id="c18"></td></tr>
      <tr><td id="c21"></td><td id="c22"></td><td id="c23"></td><td id="c24"></td><td id="c25"></td><td id="c26"></td><td id="c27"></td><td id="c28"></td></tr>
      <tr><td id="c31"></td><td id="c32"></td><td id="c33"></td><td id="c34"></td><td id="c35"></td><td id="c36"></td><td id="c37"></td><td id="c38"></td></tr>
      <tr><td id="c41"></td><td id="c42"></td><td id="c43"></td><td id="c44"></td><td id="c45"></td><td id="c46"></td><td id="c47"></td><td id="c48"></td></tr>
      <tr><td id="c51"></td><td id="c52"></td><td id="c53"></td><td id="c54"></td><td id="c55"></td><td id="c56"></td><td id="c57"></td><td id="c58"></td></tr>
      <tr><td id="c61"></td><td id="c62"></td><td id="c63"></td><td id="c64"></td><td id="c65"></td><td id="c66"></td><td id="c67"></td><td id="c68"></td></tr>
      <tr><td id="c71"></td><td id="c72"></td><td id="c73"></td><td id="c74"></td><td id="c75"></td><td id="c76"></td><td id="c77"></td><td id="c78"></td></tr>
      <tr><td id="c81"></td><td id="c82"></td><td id="c83"></td><td id="c84"></td><td id="c85"></td><td id="c86"></td><td id="c87"></td><td id="c88"></td></tr>

      <tr> <td><button id="bg1" class="btn btn-warning"/><button  id="br1" class="btn btn-danger"/></td>
           <td><button id="bg2" class="btn btn-warning"/><button id="br2" class="btn btn-danger"/></td>
           <td><button id="bg3" class="btn btn-warning"/><button id="br3" class="btn btn-danger"/></td>
           <td><button id="bg4" class="btn btn-warning"/><button id="br4" class="btn btn-danger"/></td>
           <td><button id="bg5" class="btn btn-warning"/><button id="br5" class="btn btn-danger"/></td>
           <td><button id="bg6" class="btn btn-warning"/><button id="br6" class="btn btn-danger"/></td>
           <td><button id="bg7" class="btn btn-warning"/><button id="br7" class="btn btn-danger"/></td>
           <td><button id="bg8" class="btn btn-warning"/><button id="br8" class="btn btn-danger"/></td>
      </tr>
      </table>
   </div>
   
   <div class="col-md-4"></div> 
  
  </div>

</div>


</body>
</html>