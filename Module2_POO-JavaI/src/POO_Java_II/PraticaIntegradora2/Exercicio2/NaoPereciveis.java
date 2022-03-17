package POO_Java_II.PraticaIntegradora2.Exercicio2;

public class NaoPereciveis extends Produto {
    private String tipo;
    public NaoPereciveis(String name, Double preco, String tipo) {
        super(name, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NaoPereciveis{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
