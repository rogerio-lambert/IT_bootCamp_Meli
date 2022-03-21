package br.com.meli.springboot2.praticaItegradora2.exceptions;

public class EsporteNaoCadastradoException extends Exception {
    private static final long serialVersionUID = -1957137827451037216L;

    public EsporteNaoCadastradoException(String mensagem) {
        super(mensagem);
    }

}
