package POO_Java_III.Exercicio2;

import POO_Java_III.Exercicio2.util.Impressora;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Curriculo rogerio;
        ArrayList<String> habilidades =new ArrayList<String>(Arrays.asList("Programar", "tocar rabeca e pífanos", "dançar", "fabricar instrumentos"));
        ArrayList<String> experiencias = new ArrayList<String>(Arrays.asList("empreendedor", "professor", "luthier", "programador"));
        rogerio = new Curriculo("Rogério de Castro Lambert", habilidades, experiencias);
        Impressora.imprima(rogerio);

        Relatorio vendas;
    }
}
