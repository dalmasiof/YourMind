package br.com.yourmind.servlet;

import br.com.yourmind.Livros;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/excluir")
public class ExcluirLivroServelet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        /*
            RECEBE O LIVRO A SER EXCLUÍDO ATRAVÉS DA URL, REALIZA A EXCLUSÃO E
            REDIRECIONA PARA A PÁGINA /mostra
        */

        Integer codigo = Integer.valueOf(request.getParameter("id"));
        List<Livros> livros = Livros.getLivros();

        for (int i = 0; i < livros.size(); i++) {

            Integer codigoDoVetor = livros.get(i).getId();

            if (codigo.equals(codigoDoVetor)) {
                livros.remove(i);
                break;
            }
        }

        response.sendRedirect("http://localhost:15966/YourMindWeb/mostra");

    }

}
