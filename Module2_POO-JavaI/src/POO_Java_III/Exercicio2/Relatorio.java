package POO_Java_III.Exercicio2;

public class Relatorios implements DocumentoImprimivel{
    private String content;
    private  String autor;
    private int numeroDePaginas;
    private String revisor;

    public Relatorios(String content, String autor, int numeroDePaginas, String revisor) {
        this.content = content;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.revisor = revisor;
    }

    @Override
    public void imprimir() {
        System.out.println("----------Relatório---------");
        System.out.println("Autor: " + autor);
        System.out.println("Revisor" + revisor);
        System.out.println("Conteúdo: " + content);
    }
}
