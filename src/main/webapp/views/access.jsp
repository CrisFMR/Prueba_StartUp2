<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="description" content="" />
<meta name="author" content="Cristopher Montecinos" />
<title>Login</title>
<!-- BOOTSTRAP 5.3.3 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

<!-- GoogleFonts -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Lobster&family=Permanent+Marker&display=swap"
	rel="stylesheet">
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/assets/css/styles.css"
	rel="stylesheet" />
</head>
<body>
	<section>
		<div
			class="row h-100 justify-content-center align-items-center py-5 mt-5">
			<div class="card w-50" style="width: 18rem;">
				<div class="card-body text-center">
					<i class="fa-solid fa-user-unlock fa-flip fa-2xl"
						style="color: #63E6BE;"></i>
					<h2 class="title fw-bold text-light lobster-regular">Acceso Restringido
						</h2>
					<hr>
					<div class="container">
						<h1 class="fst-italic">Se ha denegado acceso al sistema</h1>
						<h1 class="permanent-marker-regular text-light">StartUP</h1>
						<i class="fa-solid fa-rocket fa-rotate-by fa-xl"
							style="color: #ffffff; --fa-rotate-angle: 45deg;"></i>
						<hr>
						<article>
							<h4 class="fw-bold">Usuario "${user.nick}" no cuenta con privilegio para acceder a esta página</h4>
						</article>
						<hr class="me-4">
							
        <div class="me-4">
                <form action="${pageContext.request.contextPath}/views/login.jsp" method="get">
                    <button type="submit" class="btn">Regresar a Login</button>
                </form>
            </div>
					</div>
				</div>
			</div>
</div>
	</section>

	<footer></footer>
	<!-- Script Bootstrap-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
	<!-- FontAwesome -->
	<script src="https://kit.fontawesome.com/976707c066.js"
		crossorigin="anonymous"></script>
</body>