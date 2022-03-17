package POO_Java_III.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Curriculo implements DocumentoImprimivel{
    private String nome;
    private List<String> test;
    private ArrayList<String> habilidades;
    private ArrayList<String> experiencias;

    public Curriculo(String nome, ArrayList<String> habilidades, ArrayList<String> experiencias) {
        this.nome = nome;
        this.habilidades = habilidades;
        this.experiencias = experiencias;
    }

    @Override
    public void imprimir() {
        System.out.println("--------Curriculo vitae---------");
        System.out.println("nome: " + nome);
        System.out.println("Habilidades:");
        habilidades.forEach(System.out::println);
        System.out.println("Experiencias:");
        experiencias.forEach(System.out::println);
    }
}
