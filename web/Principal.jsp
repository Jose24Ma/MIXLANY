<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sistemas Ventas | Menú</title>
        <link rel="icon" href="img/icono.png" type="image/x-icon">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <style>
            @import url('https://fonts.googleapis.com/css2?family=Oswald:wght@500&display=swap');
            body {
                background-image: url("img/bgprincipal.png");
                background-size: cover;
                margin: 0;
                padding: 0;
                font-family: 'Arial', sans-serif;
            }

            .navbar {
                background-color: #FFFFFF;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
                margin-bottom: 20px;
                margin-left: 150px;
                margin-right: 150px;
            }

            .navbar-brand {
                color: #FF99CC;
                font-weight: bold;
                font-family: 'Oswald', sans-serif;
            }

            .navbar-nav {
                margin-left: auto;
            }

            .nav-link {
                color: #FF99CC;
                font-family: 'Oswald', sans-serif;
            }

            .dropdown-menu {
                background-color: #F7B0BE;
                border: none;
                border-radius: 4px;
                box-shadow: none;
            }

            .dropdown-item {
                color: #222222;
            }

            .sidebar {
                position: fixed;
                top: 0;
                left: 130px;
                bottom: 0;
                width: 100%;
                max-width: 250px;
                background-color: #222222;
                transition: all 0.3s ease;
                z-index: 1;
                box-shadow: 2px 0px 4px rgba(0, 0, 0, 0.1);
            }

            .sidebar ul {
                list-style: none;
                padding: 0;
                margin: 0;
            }

            .sidebar ul li {
                margin-bottom: 10px;
            }

            .sidebar ul li a {
                color: #FFFFFF;
                text-decoration: none;
                transition: all 0.3s ease;
                padding: 10px;
                border-radius: 4px;
                font-family: 'Oswald', sans-serif;
            }

            .sidebar ul li a:hover {
                background-color: #FF99CC;
            }

            .content {
                margin-left: 380px;
                margin-right: 130px;
                transition: all 0.3s ease;
                height: calc(102vh - 300px);
                overflow-y: hidden; 
            }

            @media (max-width: 768px) {
                .sidebar {
                    display: none;
                }

                .content {
                    margin-left: 0;
                }
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light" style="background-color: #FFFFFF; margin-bottom: 20px;">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="#" style="color: #FF99CC; margin-left: 260px;">Sistemas Ventas | Menú</a>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
                           aria-expanded="false" style="color: #FF99CC;">
                            ${usuario.getNom()}
                        </a>
                        <div class="dropdown-menu text-center" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="#">
                                <img src="img/user.png" alt="User" width="100">
                            </a>
                            <a class="dropdown-item" href="#" style="color: #222222;">${usuario.getUser()}</a>
                            <a class="dropdown-item" href="#" style="color: #222222;">${mail.getMail()}</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="Validar?accion=Salir" style="color: #222222;">Salir</a>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="sidebar" style="background-color: #FFFFFF;">
            <img src="img/bg.png" alt="Imagen de la barra lateral" style="width: 100%;"><br><br>
            <ul>
                <li>
                    <a href="ControladorProducto?menu=Producto&accion=Listar" target="myFrame" onclick="hideWelcomeMessage()"
                       style="color: #000000; margin-bottom: 45px; display: block;">Productos</a>
                </li>
                <li>
                    <a href="ControladorEmpleado?menu=Empleado&accion=Listar" target="myFrame" onclick="hideWelcomeMessage()"
                       style="color: #000000; margin-bottom: 45px; display: block;">Empleados</a>
                </li>
                <li>
                    <a href="ControladorCliente?menu=Cliente&accion=Listar" target="myFrame" onclick="hideWelcomeMessage()"
                       style="color: #000000; margin-bottom: 45px; display: block;">Clientes</a>
                </li>
                <li>
                    <a href="ControladorProveedor?menu=Proveedor&accion=Listar" target="myFrame" onclick="hideWelcomeMessage()"
                       style="color: #000000; margin-bottom: 45px; display: block;">Proveedores</a>
                </li>
                <li>
                    <a href="ControladorVentas?menu=NuevaVenta&accion=default" target="myFrame" onclick="hideWelcomeMessage()"
                       style="color: #000000; margin-bottom: 45px; display: block;">Nueva Venta</a>
                </li>
                <li>
                    <a href="ControladorCompras?menu=NuevaCompra&accion=default" target="myFrame" onclick="hideWelcomeMessage()"
                       style="color: #000000; margin-bottom: 45px; display: block;">Nueva Compra</a>
                </li>
            </ul>
        </div>

        <div class="content">
            <div id="welcome-message" style="display: block; text-align: center; padding: 150px; background-color: #FFFFFF; margin: 20px;">
                <h1 style="font-family: 'Oswald', sans-serif;">¡Bienvenido a Sistemas Ventas Wisco!</h1><br>
                <p>Estamos encantados de tenerte aquí. Nuestro sistema te brinda opciones para editar y agregar productos, clientes, proveedores, y generar soportes de compra y venta.</p>
                <p>Para comenzar, simplemente selecciona una opción en la barra lateral.</p>
            </div>
            <div class="embed-responsive embed-responsive-16by9">
                <iframe class="embed-responsive-item" name="myFrame"></iframe>
            </div>
        </div>
                            
        <div style="text-align: center; margin-top: 30px; margin-left: 200px">
            <p>📞 Contáctanos: 3042461290<br>
            📧 sistema.mixlany@gmail.com<br>
            🌐 www.sistema_de_info_mixlany.com<br>
            📱 +57 035-023-8576</p>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script>
                        document.addEventListener("DOMContentLoaded", function () {
                            var welcomeMessage = document.getElementById("welcome-message");
                            var sidebarLinks = document.querySelectorAll(".sidebar ul li a");

                            function hideWelcomeMessage() {
                                welcomeMessage.style.display = "none";
                            }

                            sidebarLinks.forEach(function (link) {
                                link.addEventListener("click", hideWelcomeMessage);
                            });
                        });
        </script>
    </body>
</html>
