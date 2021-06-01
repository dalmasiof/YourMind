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
    
    
    private static List<Livros> livros = new ArrayList<Livros>();
    
    static {
        Livros livro1 = new Livros("Livro 1", "Autor 1");
        Livros livro2 = new Livros("Livro 2", "Autor 2");
        Livros.adiciona(livro1);
        Livros.adiciona(livro2);
    }
    
    
    // Construtores
    public Livros() {
    }
    
    public Livros(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livros(String titulo, String autor, String status, String responsavel, Date dataEmprestimo, Date dataDevolucao) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
        this.responsavel = responsavel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
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
    
    
}
