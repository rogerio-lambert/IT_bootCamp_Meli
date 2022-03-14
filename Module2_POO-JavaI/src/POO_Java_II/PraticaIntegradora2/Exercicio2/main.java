package POO_Java_II.PraticaIntegradora2.Exercicio1.Exercicio2;

public class main {
    public static void main(String[] args) {
        Produto teste = new Produto("Oleo de peroba",10.50d);
        System.out.println(teste.calcular(5));
        Pereciveis tofu = new Pereciveis("tofu", 30d, 2);
        System.out.println(tofu.calcular(5));
        Distribuidora joselita =  new Distribuidora();
        joselita.inserirProduto(teste);
        joselita.inserirProduto(tofu);
        joselita.obterPrecoTotal();
    }
}
