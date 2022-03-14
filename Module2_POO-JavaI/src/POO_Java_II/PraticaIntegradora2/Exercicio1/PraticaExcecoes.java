package POO_Java_III.PraticaIntegradora2.Exercicio1;

public class PraticaExcecoes {
    static final int a = 0;
    static final int b = 300;

    public static void letraA() {
        try {
          System.out.println(b/a);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
    public static void letraB () {
        try {
            System.out.println(b/a);
        } catch (ArithmeticException e) {
            throw  new IllegalArgumentException("Não pode ser dividido por zero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
