package br.com.meli.numero.conversores.controler;

import br.com.meli.numero.conversores.service.MorseConverter;
import br.com.meli.numero.conversores.service.RomanConverter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversores")
public class ConverterController {
    @GetMapping("/decimal-romano")
    public ResponseEntity<String> converterRomanos(@RequestParam Integer numeroDecimal) {
        return ResponseEntity.ok(RomanConverter.converter(numeroDecimal));
    }

    @GetMapping("/codigo-morse")
    public ResponseEntity<String> converterMorse(@RequestParam String palavra) {
        return ResponseEntity.ok(MorseConverter.converter(palavra));
    }
}
