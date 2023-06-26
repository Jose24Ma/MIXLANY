<!DOCTYPE html>
<html>
    <head>
        <title>LOGIN MIXLANY</title>
        <link rel="icon" href="img/icono.png" type="image/x-icon">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Poppins:600&display=swap" rel="stylesheet">
        <script src="https://kit.fontawesome.com/a81368914c.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
        <img class="wave" src="img/wave.png">
        <div class="container">
            <div class="img">
                <img src="img/bg.png" width="300"/>
            </div>
            <div class="login-content">
                <form action="Validar" method="POST">
                    <img src="img/logo.png" width="300"/><br><br> 
                    <h2 class="title">Welcome</h2><br>
                    <h4>Username</h4>
                    <div class="input-div one">
                        <div class="i">
                            <i class="fas fa-user"></i>
                        </div>
                        <div class="div">
                            <input type="text" name="txtuser" autofocus required>
                        </div>
                    </div>
                   <h4>Password</h4>
                    <div class="input-div one">
                        <div class="i">
                            <i class="fas fa-user"></i>
                        </div>
                        <div class="div">
                            <input type="password" name="txtpass" autofocus required>
                        </div>
                    </div>
                    <input type="submit" name="accion" value="Ingresar" class="btn">
                    <% if (request.getAttribute("Error") != null) {
                            out.println("<center><span class='bg-danger' style='font-weight: 900; padding: 10px;'>");
                            out.println(request.getAttribute("Error"));
                            out.println("</span></center>");
                        }%>
                </form>
            </div>
        </div>
        <script type="text/javascript" src="js/main.js"></script>
    </body>
</html>
