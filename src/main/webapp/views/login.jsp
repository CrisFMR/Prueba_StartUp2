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
<link href="https://fonts.googleapis.com/css2?family=Lobster&family=Permanent+Marker&display=swap" rel="stylesheet">
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/assets/css/styles.css" rel="stylesheet" />
</head>
<body>
<header>
<nav class="navbar navbar-dark permanent-marker-regular">
  <div class="container-fluid">
  <div class="logo d-flex align-items-baseline">
  	<a href="${pageContext.request.contextPath}/views/index.jsp">
  	<i class="fa-solid fa-rocket fa-rotate-by fa-xl" style="color: #ffffff; --fa-rotate-angle: 45deg;""></i></a>
  	<p class="text text-light h4 permanent-marker-regulart ms-2">StartUP</p>
  	</div>
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/views/index.jsp">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/views/login.jsp">Log</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/views/register.jsp">Registrate</a>
        </li>
      </ul>
  </div>
  </div>
</nav>
</header>
<div class="row h-100 justify-content-center align-items-center py-5">
<div class="card w-50" style="width: 18rem;">
  <div class="card-body text-center ">
  <i class="fa-solid fa-circle-user fa-flip fa-2xl" style="color: #63E6BE;"></i>
   <h1 class="lobster-regular m-3">Login</h1>
   <hr>

        <form action="${pageContext.request.contextPath}/Login" method="post">
            <div class="form-group px-4 me-4 pb-4">
                <label for="correo">Correo:</label>
                <input type="email" class="form-control text-center" id="correo" autocomplete="off" name="correo" required>
            </div>
            <div class="form-group px-4 me-4 pb-4">
                <label for="password">Password:</label>
                <input type="password" class="form-control text-center" id="password" autocomplete="off" name="password" required>
                </div>
                <hr>
        <button type="submit" class="btn">Acceder</button>
        <h6 class="mt-2">Si aun no está registrado hágalo <a href="${pageContext.request.contextPath}/views/register.jsp">aquí</a>.</h6>
        </form>
        
        
  </div>
</div>
</div>
<footer>
<div class="container pt-3">
<h6 class="text text-center fst-italic text-light opacity-50 lobster-regular">Todos los derechos reservados. ©2024 Praxis</h6>
</div>
</footer>
<!-- Script Bootstrap-->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
<!-- FontAwesome -->
<script src="https://kit.fontawesome.com/976707c066.js" crossorigin="anonymous"></script>
</body>
</html>