package br.com.yourmind;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Livros {
    
    // Atributos
    private String titulo;
    private String autor;
    private String status;
    private String responsavel;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Integer id;
    
    private static int codigo = 1;
    private static List<Livros> livros = new ArrayList<Livros>();
    
    static {
        Livros.adiciona(new Livros("A Revolução dos Bichos", "George Orwell"));
        Livros.adiciona(new Livros("1984", "George Orwell"));
        Livros.adiciona(new Livros("Jogos Vorazes", "Suzanne Collins"));
        Livros.adiciona(new Livros("Em Chamas", "Suzanne Collins"));
        Livros.adiciona(new Livros("A Esperança", "Suzanne Collins"));
        Livros.adiciona(new Livros("O Pequeno Príncipe", "Antoine De Saint-exupéry"));
        Livros.adiciona(new Livros("O Mágico de Oz", "L. Frank Baum"));
        
    }
    
    
    // Construtores

    public Livros() {
    }
    
    public Livros(String titulo , String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = Livros.codigo;
        Livros.codigo++;
    }

    public Livros(String titulo, String autor, String status, String responsavel, Date dataEmprestimo, Date dataDevolucao) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
        this.responsavel = responsavel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.id = Livros.codigo;
        Livros.codigo++;
    }
    
    // Métodos
    public void alterarDataEmprestimo(Date novaDataEmprestimo) {
        this.dataEmprestimo = novaDataEmprestimo;
    }
    
    public void alterarDataDevolucao(Date novaDataDevolucao) {
        this.dataDevolucao = novaDataDevolucao;
    }
    
    public void alterarResponsavel(String novoResponsavel) {
        this.responsavel = novoResponsavel;
    }
    
    public void alterarStatus(String novoStatus) {
        this.status = novoStatus;
    }
    
    public static void adiciona(Livros livro) {
        livro.setStatus("Disponível");
        livro.setResponsavel("Não Consta");
        livro.setDataDevolucao(null);
        livro.setDataEmprestimo(null);
        Livros.livros.add(livro);
    }
    
    public static void excluirLivro(Integer idExclusao) {

        for (int i = 0; i < livros.size(); i++) {

            Livros get = livros.get(i);

            if (get.id == idExclusao){
                livros.remove(i);
            }
        }
   }
     
    public static void reservarLivro(Integer idReserva,Date dataEmprestimoReserva,Date dataDevolucaoReserva,String resp) {
           
        for (int i = 0; i < livros.size(); i++) {
             
            Livros get = livros.get(i);
             
            if (get.id == idReserva){
                 
                get.dataDevolucao =  dataDevolucaoReserva;
                get.dataEmprestimo = dataEmprestimoReserva;
                get.responsavel = resp;

                livros.set(i, get);
            }
        }
    }
    
    public static List<Livros> getLivros() {
        return livros;
    }
    
    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    public void SetId(Integer novoId) {
         this.id = novoId;
    }
    
    public Integer getId() {
        return id;
    }
    
    
    
    
}
