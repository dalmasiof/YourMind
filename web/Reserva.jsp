<%@page import="br.com.yourmind.Livros"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Mind - Reserva</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
    </head>
    <body>
        <% Livros livro = (Livros)request.getAttribute("livro"); %>
        <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #286BA6;">
            <div>
                <a class="navbar-brand" href="mostra" style="position: relative;">Your Mind</a>
            </div>
        </nav>

        <div class="shadow p-3 mb-5 bg-body rounded">
            <h1> Reserva de Livro</h1>
        </div>

        <form method="post" action="reserva" class="row g-3">

            <div class="mb-3 row">
                <label for="inputPassword" class="col-sm-2 col-form-label">ID do Livro:</label>
                <div class="col-sm-10">
                    <input name="txtId" type="text" class="form-control" style="width: 250px;" value="${livro.id}" readonly> 
                </div> 
            </div>
            
            <div class="mb-3 row">
                <label for="inputPassword" class="col-sm-2 col-form-label">Título:</label>
                <div class="col-sm-10">
                    <input name="txtId" type="text" class="form-control" style="width: 250px;" value="${livro.titulo}" readonly> 
                </div> 
            </div> 

            <div class="mb-3 row">
                <label for="inputPassword" class="col-sm-2 col-form-label">Data Retirada </label>
                <div class="col-sm-10">
                    <input name="txtDataEmprestimo" type="date" class="form-control" style="width: 180px;" value="${livro.dataEmprestimo}"> 
                </div>
            </div>

            <div class="mb-3 row">
                <label for="inputPassword" class="col-sm-2 col-form-label">Data Devolução: </label>
                <div class="col-sm-10">
                    <input type="date" name="txtDataDevolucao"  class="form-control" style="width: 180px;" value="${livro.dataDevolucao}">
                </div> 
            </div> 

            <div class="mb-3 row">
                <label for="inputPassword" class="col-sm-2 col-form-label">Responsavel: </label>
                <div class="col-sm-10">
                    <input  name="txtResponsavel" type="text" class="form-control" style="width: 250px;" value="${livro.responsavel}" required> 
                </div> 
            </div> 

            <div class="btn-group" role="group" aria-label="Basic example" style="width: 250px;" >

                <button type="submit" formaction="reserva" class="btn btn-primary" style="border-color:#286BA6; background-color: #286BA6;">Reserva</button>
                <a style=" border-color:#286BA6; background-color: #286BA6;" class="btn btn-primary" style = "color: white;" href="mostra">Cancelar</a>


            </div>
        </form>
    </body>
</html>
