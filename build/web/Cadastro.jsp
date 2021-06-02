<!DOCTYPE html>


<html>
    <head>
        <title>Your Mind - Cadastro</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
            <h1> Cadastro de Livro</h1>
        </div>

        <form method="post" action="cadastro" class="row g-3">
            <div class="mb-3 row">  <!-- DIV RESPONSÁVEL PELO TÍTULO -->
                <label for="inputPassword" class="col-sm-2 col-form-label">Título </label>
                <div class="col-sm-10">
                    <input type="text" name="txttitulo" class="form-control" style="width: 250px;" autocomplete="off" required> 
                </div> 
            </div> 

            <div class="mb-3 row">  <!-- DIV RESPONSÁVEL PELO AUTOR -->
                <label for="inputPassword" class="col-sm-2 col-form-label"> Autor </label>
                <div class="col-sm-10">
                    <input type="text" name="txtautor" class="form-control" style="width: 250px;" autocomplete="off" required> 
                </div> 
            </div> 


            <div class="btn-group" role="group" aria-label="Basic example" style="width: 250px;">
                <!-- BOTÃO QUE CADASTRA O NOVO LIVRO, CONFORME CODIFICADO EM CadastroServlet.java-->
                <button type="submit" formaction="cadastro" class="btn btn-primary" style="border-color:#286BA6; background-color: #286BA6;">Cadastrar</button>
                
                <!-- BOTÃO QUE CANCELA O CADASTRO E RETORNA PARA /mostra -->
                <button type="reset" class="btn btn-primary" style="border-color:#286BA6; background-color: #286BA6;"> <a class="text-decoration-none" style = "color: white; " href="mostra">Cancelar</a></button>
            </div>

        </form>

    </body>
</html>