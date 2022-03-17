package POO_Java_III.Exercicio1;

public class Deposito implements Transacao {
    @Override
    public boolean transacaoOk() {
        return false;
    }

    @Override
    public boolean transacaoNaoOk() {
        return false;
    }
}
