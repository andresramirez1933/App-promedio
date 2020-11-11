<%-- 
    Impementado por Andrés Felipe Ramirez Pardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
            body { background-color: black; }
            .w{
                
                color: cadetblue;
                
            }
            
            #heading{
                
                color: appworkspace;
                
            }
            
            
            
        </style>
    </head>
    <body>
    <center>
        <h1 id ="heading">Hallar promedio</h1> 
        <form action="Resultado" method="get">
            <label class="w"> Nombre:  </label>
            <input type="text" name="nom">
            <br> <br>
            <label class="w"> Apellido:  </label>
            <input type="text" name="ape">
            <br> <br>
            <label class="w"> Primera nota:  </label>
            <input type="text" name="n1">
            <br> <br>
            <label class="w"> Segunda nota:  </label>
            <input type="text" name="n2">
            <br> <br>
            <label class="w"> Tercera nota:  </label>
            <input type="text" name="n3">
            <br> <br>
            <input type="submit" name="pro" value="Calcular">
            <br> <br>
            <input type="reset"  value="Borrar">
            
        </form>
        
    </center>
    </body>
</html>
