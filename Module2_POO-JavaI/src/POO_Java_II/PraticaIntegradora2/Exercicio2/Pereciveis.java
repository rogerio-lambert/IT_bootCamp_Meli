package POO_Java_II.PraticaIntegradora2.Exercicio2;

public class Pereciveis extends Produto {
    private int diasParaVencer;
    public Pereciveis(String name, Double preco, int diasParaVencer) {
        super(name, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public Double calcular(int quantidadeDeProdutos) {
        return super.calcular(quantidadeDeProdutos)/discount();
    }

    private int discount() {
        switch (diasParaVencer) {
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 2;
            default:
                return 1;
        }
    }
}
