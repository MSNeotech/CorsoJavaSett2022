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

<script src="static/js/test.js"></script>
</head>

<body>
	<div class="clearfix">
		<div class="row">
			<div class="col-md-2">
				<i class="fa-solid fa-ghost" style="font-size:10em;color:violet;"></i><h1>Provvaaaaaaaa MAX !!!!</h1> 
				<div class="spinner-border" role="status">
					<span class="visually-hidden">Loading...</span>
				</div>
			</div>
           <div class="col-md-10">
           <!-- inline -->
			<button type="button" class="btn btn-primary">Primo pulsante</button>

			<button type="button" class="btn btn-warning">Secondary</button>
			<button type="button" id="pulsante_verde" class="btn btn-success">Success</button>
			<button type="button" id="pulsante_rosso" class="btn btn-danger">Danger</button>
			<button type="button" id="pulsante_giallo" class="btn btn-warning">Warning</button>
			<button type="button" class="btn btn-info">Info</button>
			<button type="button" class="btn btn-light">Light</button>
			<button type="button" id="pulsante_nero" class="btn btn-dark">Dark</button>
			</div>
		</div>
       <div class="row">
       <div class="col-xl-10">
		<div class="toast fade show" role="alert" aria-live="assertive"
			aria-atomic="true">
			<div class="toast-header">
				<svg class="bd-placeholder-img rounded me-2" width="20" height="20"
					xmlns="http://www.w3.org/2000/svg" aria-hidden="true"
					preserveAspectRatio="xMidYMid slice" focusable="false">
					<rect width="100%" height="100%" fill="#007aff"></rect></svg>

				<strong class="me-auto">Bootstrap</strong> <small>11 mins
					ago</small>
				<button type="button" class="btn-close" data-bs-dismiss="toast"
					aria-label="Close"></button>
			</div>
			<div class="toast-body">Hello, world! This is a toast message.
			</div>
		</div>
		</div>
		<div class="col-xl-2">
		<div class="alert alert-primary" role="alert">A simple primary
			alert—check it out!</div>
		</div>
		</div>
		
	<div class="row">
	<div class="col-md-6">
	    <form class="row g-3 needs-validation" novalidate>
  <div class="col-md-4">
    <label for="validationCustom01" class="form-label">First name</label>
    <input type="text" class="form-control" id="validationCustom01" value="Mark" required>
    <div class="valid-feedback">
      Looks good!
    </div>
  </div>
  <div class="col-md-4">
    <label for="validationCustom02" class="form-label">Last name</label>
    <input type="text" class="form-control" id="validationCustom02" value="Otto" required>
    <div class="valid-feedback">
      Looks good!
    </div>
  </div>
  
  <div class="col-md-4">
    <label for="validationCustomUsername" class="form-label">Username</label>
    <div class="input-group has-validation">
      <span class="input-group-text" id="inputGroupPrepend">@</span>
      <input type="text" class="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" required>
      <div class="invalid-feedback">
        Please choose a username.
      </div>
    </div>
  </div>
  
  <div class="col-md-6">
    <label for="validationCustom03" class="form-label">City</label>
    <input type="text" class="form-control" id="validationCustom03" required>
    <div class="invalid-feedback">
      Please provide a valid city.
    </div>
  </div>
  <div class="col-md-3">
    <label for="validationCustom04" class="form-label">State</label>
    <select class="form-select" id="validationCustom04" required>
      <option selected disabled value="">Choose...</option>
      <option>...</option>
    </select>
    <div class="invalid-feedback">
      Please select a valid state.
    </div>
  </div>
  <div class="col-md-3">
    <label for="validationCustom05" class="form-label">Zip</label>
    <input type="text" class="form-control" id="validationCustom05" required>
    <div class="invalid-feedback">
      Please provide a valid zip.
    </div>
  </div>
  <div class="col-12">
    <div class="form-check">
      <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
      <label class="form-check-label" for="invalidCheck">
        Agree to terms and conditions
      </label>
      <div class="invalid-feedback">
        You must agree before submitting.
      </div>
    </div>
  </div>
  <div class="col-12">
    <button class="btn btn-primary" type="submit">Submit form</button>
  </div>
</form>	
	</div>
	<div class="col-md-6"></div>
	</div>	


<div class="row">
<div class="col-md-3"></div>
<div class="col-md-6">
    <table style="border: 2px solid red;" id="tabella_impiccato">
    <tr><td id="c1">A</td><td id="c2" class="miotd">B</td><td id="c3" class="miotd">C</td></tr>
    <tr><td id="c4">A</td><td id="c5" class="miotd">B</td><td id="c6" class="miotd">C</td></tr>
    <tr><td id="c7">A</td><td id="c8" class="miotd">B</td><td id="c9" class="miotd">C</td></tr>
    </table>
</div>
<div class="col-md-3"></div>
</div>		
</div>
	

<button id="ultimoPulsante" class="btn btn-info">ULTIMO PULSANTE</button>

</body>
<script></script>


<script>

//Example starter JavaScript for disabling form submissions if there are invalid fields
(() => {
  'use strict'

  // Fetch all the forms we want to apply custom Bootstrap validation styles to
  const forms = document.querySelectorAll('.needs-validation')

  // Loop over them and prevent submission
  Array.from(forms).forEach(form => {
    form.addEventListener('submit', event => {
      if (!form.checkValidity()) {
        event.preventDefault()
        event.stopPropagation()
      }

      form.classList.add('was-validated')
    }, false)
  })
})()

</script>
</html>