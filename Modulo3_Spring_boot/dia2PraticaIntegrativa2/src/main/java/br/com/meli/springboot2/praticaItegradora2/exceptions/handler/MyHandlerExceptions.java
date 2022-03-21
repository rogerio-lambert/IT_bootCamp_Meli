package br.com.meli.springboot2.praticaItegradora2.exceptions.handler;

import br.com.meli.springboot2.praticaItegradora2.exceptions.EsporteNaoCadastradoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyHandlerExceptions {
    @ExceptionHandler(value = EsporteNaoCadastradoException.class)
    protected ResponseEntity<Object> handleEsporteException(EsporteNaoCadastradoException ex) {
        String bodyOfResponse = ex.getMessage();
        return ResponseEntity.badRequest().body(bodyOfResponse);
    }
}
