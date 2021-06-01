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


@WebServlet("/mostra")
public class MostraLivrosServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    /*
        ESTA CLASSE É A RESPONSÁVEL POR ENVIAR TODOS OS LIVROS CADASTRADOS PARA
        O Cadastro.jsp, QUE POR SUA VEZ É O RESPONSÁVEL POR EXIBIR OS LIVROS NA
        TELA.
    */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // PEGA TODOS OS LIVROS CADASTRADOS NA LISTA ESTÁTICA Livros.livros
        List<Livros> livros = Livros.getLivros();
	
        
        // SETTA O ATRIBUTO "livros" PARA RECEBER A VARIÁVEL livros
        request.setAttribute("livros", livros);
        
        // INDICA PARA QUAL PÁGINA DEVERÁ ENVIAR O ATRIBUTO "livros"
        RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
        
        // ENVIA O ATRIBUTO E CARREGA A PÁGINA NA TELA
        rd.forward(request, response);
        
    }

}
