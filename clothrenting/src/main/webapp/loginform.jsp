<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">


<script
	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/js/all.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<style>
body {
	background: rgb(238, 130, 238);
	background: linear-gradient(90deg, rgba(238, 130, 238, 1) 35%,
		rgba(255, 255, 255, 1) 100%);
}
</style>
</head>
<body>

	<div class="container">
		<div class="row" style="margin-top: 10%;">
			<div class="col-xl-3 col-lg-3 col-md-3 col-sm-12 col-sm-12">
				<p></p>
			</div>

			<div class="col-xl-6 col-lg-6 col-md-6 col-sm-12 col-sm-12"
				id="yourElement">
				<div class="card" style="width: 100%;">
					<div class="card-body">
						<h5 class="card-title" style="text-align: center;">Login
							Page</h5>
						<div class="row">
							<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-sm-12">
								<form action="userLogin.do" method="post">

									<label for="usr">EmailId*</label> <input type="text"
										class="form-control" placeholder="Email Id" name="email">

									<div style="margin-top: 5%; text-align: center;">
										<button type="button" class="btn btn-primary btn-lg"
											style="background-color: #ee82ee; border: none;">
											<i class="fas fa-user"></i> Login Now
										</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-xl-3 col-lg-3 col-md-3 col-sm-12 col-sm-12">
				<p></p>

			</div>
		</div>
	</div>
	<script>
</script>
</body>
</html>