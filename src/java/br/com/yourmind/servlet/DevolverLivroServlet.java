package br.com.yourmind.servlet;

import br.com.yourmind.Livros;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DevolverLivroServlet", urlPatterns = {"/devolver"})
public class DevolverLivroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        /*
            RECEBE O LIVRO A SER DEVOLVIDO ATRAVÉS DA URL, REALIZA A DEVOLUÇÃO E
            REDIRECIONA PARA A PÁGINA /mostra
        */
        Integer codigo = Integer.valueOf(request.getParameter("id"));
        List<Livros> livros = Livros.getLivros();
        Livros livro;

        for (int i = 0; i < livros.size(); i++) {

            Integer codigoDoVetor = livros.get(i).getId();

            if (codigo.equals(codigoDoVetor)) {
                livro = livros.get(i);
                livro.setDataDevolucao(null);
                livro.setDataEmprestimo(null);
                livro.setResponsavel("Não Consta");
                livro.setStatus("Disponível");
                break;
            }
        }

        response.sendRedirect("http://localhost:15966/YourMindWeb/mostra");
    }

}
