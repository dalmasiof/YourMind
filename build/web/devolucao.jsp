<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Mind - Devolução</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
    </head>
    <body>
       <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #286BA6;">
            <div>
            <a class="navbar-brand" href="#" style="position: relative;">Your Mind</a>
            </div>
        </nav>
        
        <div class="shadow p-3 mb-5 bg-body rounded">
        <h1> Devolução de Livro</h1>
        </div>
        
    <form action="index.jsp" class="row g-3">
   
        <div class="mb-3 row">
     <label for="inputPassword" class="col-sm-2 col-form-label">Nome do Livro:</label>
      <div class="col-sm-10">
   <input type="text" class="form-control" style="width: 250px;"> 
 </div> 
 </div> 
        
                    
 <div class="mb-3 row">
     <label for="inputPassword" class="col-sm-2 col-form-label">Data Devolução: </label>
      <div class="col-sm-10">
   <input type="text" class="form-control" style="width: 150px;"> 
 </div> 
 </div> 
  
            <div class="btn-group" role="group" aria-label="Basic example" style="width: 250px;" >
<input class="btn btn-primary" type="submit" value="Devolução" style="background-color: #286BA6; ">
<button type="button" class="btn btn-primary" style="border-color:#286BA6; background-color: #286BA6;"> <a class="text-decoration-none" style = "color: white; " href="index.jsp">Cancela</a></button>
        </div>
</form>
    </body>
</html>