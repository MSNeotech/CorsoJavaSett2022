<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"></link>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	type="text/javascript"></script>


<meta charset="UTF-8">
<title>WebApp</title>
</head>

<body>
	<div class="jumbotron text-center">
		<div clas="row">
			<div class="col-mid-10">
				<h1>Test WebApp</h1>
				<h5>Questa colonna è molto lunga</h5>
				<div class="progress">
					<div class="progress-bar bg-success" role="progressbar"
						aria-label="Success example" style="width: 25%" aria-valuenow="25"
						aria-valuemin="0" aria-valuemax="100"></div>
				</div>
				<div class="progress">
					<div class="progress-bar bg-info" role="progressbar"
						aria-label="Info example" style="width: 50%" aria-valuenow="50"
						aria-valuemin="0" aria-valuemax="100"></div>
				</div>
				<div class="progress">
					<div class="progress-bar bg-warning" role="progressbar"
						aria-label="Warning example" style="width: 75%" aria-valuenow="75"
						aria-valuemin="0" aria-valuemax="100"></div>
				</div>
				<div class="progress">
					<div class="progress-bar bg-danger" role="progressbar"
						aria-label="Danger example" style="width: 100%"
						aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>
				</div>
			</div>
			<div class="col-md-2">

				<ul class="list-group">
					<li class="list-group-item active" aria-current="true">An
						active item</li>
					<li class="list-group-item">A second item</li>
					<li class="list-group-item">A third item</li>
					<li class="list-group-item">A fourth item</li>
					<li class="list-group-item">And a fifth one</li>
				</ul>

				<h5>Questa colonna è molto corta</h5>
				<div class="btn-group">
					<a href="#" class="btn btn-primary active" aria-current="page">Active
						link</a> <a href="#" class="btn btn-primary">Link</a> <a href="#"
						class="btn btn-primary">Link</a>
				</div>
				<button type="button" class="btn btn-primary">
					Notifications <span class="badge text-bg-secondary">4</span>
				</button>
			</div>
		</div>
	</div>
</body>
</html>