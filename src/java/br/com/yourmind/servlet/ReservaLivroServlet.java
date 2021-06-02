package br.com.yourmind.servlet;

import br.com.yourmind.Livros;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reserva")
public class ReservaLivroServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private Livros livro;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
            O MÉTODO doGet É CHAMADO QUANDO OS BOTÕES DA PÁGINA /mostra SÃO
            PRESSIONADOS.
            
            O MÉTODO doGet REDIRECIONA PARA O Cadastro.jsp, 
            ODNE SERÃO REALIZADOS AS COLETAS DOS DADOS INPUTADOS PELO USUÁRIO
        */
        
        Integer codigo = Integer.valueOf(request.getParameter("id"));
        List<Livros> livros = Livros.getLivros();

        for (int i = 0; i < livros.size(); i++) {

            Integer codigoDoVetor = livros.get(i).getId();

            if (codigo.equals(codigoDoVetor)) {
                livro = livros.get(i);
                break;
            }
        }

        request.setAttribute("livro", livro);
        RequestDispatcher rd = request.getRequestDispatcher("/Reserva.jsp");
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
            O MÉTODO doPost É CHAMADO QUANDO O BOTÃO DE RESERVAR É PRESSIONADO
            NO index.jsp.
            
            O MÉTODO doPost É O RESPONSÁVEL POR RESERVAR O LIVRO NA LISTA
            ESTÁTICA Livros.livros. 
        
            APÓS REALIZAR A RESERVA, O MÉTODO REDIRECIONA O USUÁRIO PARA A
            PÁGINA /mostra
        */
        
        int id = Integer.parseInt(request.getParameter("txtId"));  // PARÂMETRO "txtId" DEFINIDO NO INPUT DA PÁGINA Reserva.jsp
        Date dataEmprestimo = converterParaDate(request.getParameter("txtDataEmprestimo"));  // PARÂMETRO "txtDataEmprestimo" DEFINIDO NO INPUT DA PÁGINA Reserva.jsp
        Date dataDevolucao = converterParaDate(request.getParameter("txtDataDevolucao"));  // PARÂMETRO "txtDataDevolucao" DEFINIDO NO INPUT DA PÁGINA Reserva.jsp
        String responsavel = request.getParameter("txtResponsavel");  // PARÂMETRO "txtResponsavel" DEFINIDO NO INPUT DA PÁGINA Reserva.jsp
        
        if(dataEmprestimo != null && dataDevolucao != null && responsavel != null) {
            
            livro.setDataEmprestimo(dataEmprestimo);
            livro.setDataDevolucao(dataDevolucao);
            livro.setResponsavel(responsavel);
            livro.setStatus("Indisponível");
            
        }
        

        response.sendRedirect("http://localhost:15966/YourMindWeb/mostra");

    }

    private Date converterParaDate(String dataComoString) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        Date dataFormatada = null;

        try {
            dataFormatada = sdf.parse(dataComoString);
        } catch (ParseException e) {
        }

        return dataFormatada;
    }

}
