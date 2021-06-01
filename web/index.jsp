<%@page import="java.util.List"%>
<%@page import="br.com.yourmind.Livros"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Mind</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #286BA6;">
            <div>
                <a class="navbar-brand" style="position: relative;">Your Mind</a>
            </div>
        </nav>
        
        <!-- RECEBE O ATRIBUTO "livros", CONFORME SETTADO NA MostraLivrosServlet.java -->
        <% List<Livros> livros = (List<Livros>) request.getAttribute("livros"); %>


        <table class="table table-sm">
            <thead>
                <tr>
                    <!-- COLUNAS -->
                    <th>Título</th>
                    <th>Autor</th>
                    <th>Status</th>
                    <th>Data de Retirada</th>
                    <th>Data de Devolução</th>
                    <th>Responsável</th>

                </tr>
            </thead>
            <tbody>
                <!-- FOREACH QUE VAI ITERAR SOBRE A LISTA DE LIVROS PARA EXIBIR UM POR UM -->
                <%for (Livros livro : livros) {%>
                <tr>
                    <td><%=livro.getTitulo()%></td>
                    <td><%=livro.getAutor()%></td>
                    <td><%=livro.getStatus()%></td>
                    <td><%=livro.getDataEmprestimo() != null ? livro.getDataEmprestimo() : " - "%></td>
                    <td><%=livro.getDataDevolucao() != null ? livro.getDataEmprestimo() : " - "%></td>
                    <td><%=livro.getResponsavel()%></td>
                </tr>
                <%}%>
            </tbody>

        </table>
        <div class="btn-group" role="group" aria-label="Basic example">
            <!-- BOTÃO CADASTRO QUE REDIRECIONARÁ PARA A PÁGINA /cadastro, QUE É CODIFICADA NO CadastroServlet.java -->
            <button type="button" class="btn btn-primary" style="background-color: #286BA6;border-color:#286BA6;"> <a class="text-decoration-none" style = "color: white;" href="cadastro"> Cadastro Novo</a></button>
            
            <!-- BOTÃO CANCELAR QUE REDIRECIONARÁ PARA A PÁGINA /mostra, QUE É CODIFICADA NO MostraLivrosServlet.java -->
            <button type="button" class="btn btn-primary" style="background-color: #286BA6;border-color:#286BA6;"> <a class="text-decoration-none" style = "color: white;" href="Reserva.jsp">Alugar/Reservar</a></button>
        </div>
        <div class="btn-group" role="group" aria-label="Basic example">

        </div>
        <div style= "float: right;" class="btn-group-vertical" >
            <button type="button" class="btn btn-primary" style=" border-color:#286BA6; background-color: #286BA6;"> <a class="text-decoration-none" style = "color: white;" href="Editar.jsp"> Editar</a></button>
            <button type="button" class="btn btn-primary" style="border-color:#286BA6; background-color: #286BA6;"> <a class="text-decoration-none" style = "color: white;" href="index.jsp">Excluir </a></button>
        </div>
    </body>
</html>
