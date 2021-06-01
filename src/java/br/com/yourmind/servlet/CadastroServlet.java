package br.com.yourmind.servlet;

import br.com.yourmind.Livros;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        /*
            O MÉTODO doGet É CHAMADO QUANDO OS BOTÕES DA PÁGINA /mostra SÃO
            PRESSIONADOS.
            
            O MÉTODO doGet REDIRECIONA PARA O Cadastro.jsp, 
            ODNE SERÃO REALIZADOS AS COLETAS DOS DADOS INPUTADOS PELO USUÁRIO
        */
        
        RequestDispatcher rd = request.getRequestDispatcher("/Cadastro.jsp");
        rd.forward(request, response);
		
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        /*
            O MÉTODO doPost É CHAMADO QUANDO O BOTÃO DE CADASTRAR É PRESSIONADO
            NO Cadastro.jsp.
            
            O MÉTODO doPost É O RESPONSÁVEL POR CADASTRAR O NOVO LIVRO NA LISTA
            ESTÁTICA Livros.livros.
        
            APÓS REALIZAR O CADASTRO, O MÉTODO REDIRECIONA O USUÁRIO PARA A
            PÁGINA /mostra
        */
        
        String titulo = request.getParameter("txttitulo");  // PARÂMETRO "txttitulo" DEFINIDO NO INPUT DA PÁGINA Cadastro.jsp
        String autor = request.getParameter("txtautor");  // PARÂMETRO "txtautor" DEFINIDO NO INPUT DA PÁGINA Cadastro.jsp
        
        Livros livro = new Livros(titulo, autor);  // CRIANDO NOVO OBJETO DO TIPO Livros PARA INSERIR NA LISTA Livros.livros
        Livros.adiciona(livro);  // ADICIONANDO NOVO OBJETO NA LISTA
        
        response.sendRedirect("http://localhost:15966/YourMindWeb/mostra");  // REFIRECIONANDO PARA /mostra
        
    }

}
