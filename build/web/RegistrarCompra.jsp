<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Compras</title>
        <style>
            @media print{
                .parte01,img, .btn, .accion{
                    display: none;
                }
            }
        </style>
    </head>
    <body>
        <br/>
        <br/> 
        <div class="d-flex">
            <div class="col-lg-5 parte01">
                <div class="card">
                    <form name="frmCompras" id="generarCompra" onsubmit="return validarCantidad(event);" onsubmit="return validar();" action="ControladorCompras?menu=NuevaCompra" method="POST">
                        <div class="card-body">
                            <!--DATOS DEL PROVEEDOR-->
                            <div class="form-group">
                                <label>Datos del Proveedor</label>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" id="codProveedor" name="codigoproveedor" value="${pr.getId()}" class="form-control" placeholder="Codigo"> 
                                    <button type="submit" name="accion" value="BuscarProveedor" class="btn btn-outline-info">Buscar</button>
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" id="nombreDelProveedor" name="nombresproveedor" value="${pr.getNom()}" placeholder="Datos Proveedor" class="form-control">
                                </div>
                            </div>
                            <!--DATOS DEL PRODUCTO-->
                            <div class="form-group">
                                <label>Datos Producto</label>
                            </div>
                            <div id="buscarProducto" class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" name="codigoproducto" value="${producto.getId()}" class="form-control" placeholder="Codigo">
                                    <button type="submit" name="accion" value="BuscarProducto" class="btn btn-outline-info">Buscar</button>
                                </div>
                                <div class="col-sm-6">
                                    <input type="text" name="nomproducto" value="${producto.getNom()}" placeholder="Datos Producto" class="form-control">
                                </div>
                            </div>
                            <div class="form-group d-flex">
                                <div class="col-sm-6 d-flex">
                                    <input type="text" name="precio" value="${producto.getPre()}" class="form-control" placeholder="S/.0.00">                                
                                </div>                           
                                <div class="col-sm-3">
                                    <input id="cant" type="number" value="1" name="cant" placeholder="" class="form-control">
                                </div>  
                                <div class="col-sm-3">
                                    <input id="stock" type="text" name="stock" value="${producto.getStock()}" placeholder="Stock" class="form-control">
                                </div>  
                            </div>
                            <!--BOTON AGREGAR PRODUCTO AL REGISTRO-->
                            <div class="form-group">
                                <div class="col-sm">
                                    <button type="submit" name="accion" value="Agregar" class="btn btn-outline-primary">Agregar Producto</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="col-sm-7">
                <div class="card parte02">                    
                    <div class="card-body">
                        <div class="d-flex ml-auto col-sm-6">
                            <label class="text-right mt-2 col-sm-6">NRO. SERIE</label>
                            <input readonly="" type="text" name="numeroserie" class="form-control text-center" value="${nserie}" style="font-weight: bold;font-size: 18px">
                        </div>                      
                        <br>
                        <table class="table table-hover" id="customers">
                            <thead>
                                <tr class="text-center">
                                    <th>N°</th>
                                    <th>ID</th>
                                    <th>PRODUCTO</th>
                                    <th>PRECIO</th>
                                    <th>CANTIDAD</th>
                                    <th>SUBTOTAL</th>                                    
                                    <th class="accion">ACCION</th>                                    
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="list" items="${lista}">
                                    <tr class="text-center">
                                        <td>${list.getItem()}</td>
                                        <td>${list.getIdproducto()}</td>
                                        <td>${list.getDescripcionP()}</td>
                                        <td>${list.getPrecio()}</td>
                                        <td>${list.getCantidad()}</td>
                                        <td>${list.getSubtotal()}</td>
                                        <td class="d-flex">
                                            <a href="#" class="btn btn-warning">Editar</a>
                                            <a href="#" class="btn btn-danger" style="margin-left: 5px" onclick="remove(this)">Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </div>
                    <div class="card-footer" >
                        <div class="row">
                            <div class="col-sm-6">
                                <a href="ControladorCompras?menu=NuevaCompra&accion=GenerarCompra" onclick="print()" class="btn btn-success">Generar Compra</a>
                                <input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
                            </div>
                            <div class="col-sm-6 ml-auto d-flex">                                
                                <label class=" col-sm-6 text-right mt-2">Total a Pagar</label>                                                       
                                <input type="text" name="txtTotal" value="${totalpagar}" class="form-control text-center font-weight-bold" style="font-size: 18px;">
                            </div>
                        </div>                        
                    </div>
                </div>
            </div>              
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script type="text/javascript">
                                    // Funcion para validar cantidad y stock
                                    function validarCantidad(e) {
                                        var cant = parseInt(document.getElementById("cant").value);
                                        var stock = parseInt(document.getElementById("stock").value);
                                        var formulario = document.getElementById("generarCompra");
                                        var nombreProveedor = document.getElementById("nombreProveedor").value;
                                        if (stock < cant || stock == 0) {
                                            alert("Este producto no posee stock o la cantidad solicitada es mayor al stock disponible");
                                            document.getElementById("cant").value = "0";
                                            document.getElementById("stock").value = "";
                                            document.getElementById("nombreProveedor").value = nombreProveedor;
                                            e.preventDefault();
                                            return false;
                                        } else {
                                            formulario.submit();
                                            return true;
                                        }
                                    }

                                    function remove(t)
                                    {
                                        var td = t.parentNode;
                                        var tr = td.parentNode;
                                        var table = tr.parentNode;
                                        table.removeChild(tr);
                                    }                                   
        </script>                    
    </body>
</html>
