package POO_Java_III.Exercicio2;

import java.util.ArrayList;

public class LivrosEmPDF implements DocumentoImprimivel{
    private ArrayList<String> paginas;
    private String autor;
    private String titulo;
    private String genero;

    @Override
    public void imprimir() {
        System.out.println("Título: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Paginas: ");
        paginas.forEach(System.out::println);
    }
}
