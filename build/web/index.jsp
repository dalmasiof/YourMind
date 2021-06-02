<%@page import="java.text.SimpleDateFormat"%>
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
        <!-- SimpleDateFormat FORMATA AS DATAS -->
        <%
            List<Livros> livros = (List<Livros>) request.getAttribute("livros");
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        %>

        <% if (!livros.isEmpty()) {%>
        <table class="table table-sm">
            <thead>
                <tr>
                    <!-- COLUNAS -->
                    <th>ID</th>
                    <th>Título</th>
                    <th>Autor</th>
                    <th>Status</th>
                    <th>Data de Retirada</th>
                    <th>Data de Devolução</th>
                    <th>Responsável</th>
                    <th></th>
                    <th></th>

                </tr>
            </thead>
            <tbody>
                <!-- FOREACH QUE VAI ITERAR SOBRE A LISTA DE LIVROS PARA EXIBIR UM POR UM -->
                <%for (Livros livro : livros) {%>
                <tr>
                    <td><%=livro.getId()%></td>
                    <td><%=livro.getTitulo()%></td>
                    <td><%=livro.getAutor()%></td>
                    <td><%=livro.getStatus()%></td>
                    <td><%=livro.getDataEmprestimo() != null ? formato.format(livro.getDataEmprestimo()) : " - "%></td>
                    <td><%=livro.getDataDevolucao() != null ? formato.format(livro.getDataDevolucao()) : " - "%></td>
                    <td><%=livro.getResponsavel()%></td>
                    <td style="width: 10px"><a style=" border-color:#286BA6; background-color: #286BA6;" class="btn btn-primary" style = "color: white;" href="<% if(livro.getStatus().equals("Disponível")) { %>reserva?id=<%=livro.getId()%><%} else { %>devolver?id=<%=livro.getId()%><% }%>"><% if(livro.getStatus().equals("Disponível")) { %>Reservar<%} else {%>Devolver<% }%></a></td>
                    <td style="width: 10px"><a style=" border-color:#286BA6; background-color: #286BA6;" class="btn btn-primary" style = "color: white;" href="excluir?id=<%=livro.getId()%>">Excluir</a></td>
                </tr>
                <%}%>
            </tbody>

        </table>
        <%} else { %>
        <p>Ops, nenhum livro cadastrado.</p>
        <% }%>
        <div class="btn-group" role="group" aria-label="Basic example">
            <!-- BOTÃO CADASTRO QUE REDIRECIONARÁ PARA A PÁGINA /cadastro, QUE É CODIFICADA NO CadastroServlet.java -->
            <a style=" border-color:#286BA6; background-color: #286BA6;" class="btn btn-primary" style = "color: white;" href="cadastro"> Cadastrar Livro</a>
        </div>
        <div class="btn-group" role="group" aria-label="Basic example">

        </div>

    </body>
</html>
