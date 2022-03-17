package br.com.meli.numero.conversores.service;


public class MorseConverter {

    static char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4',
            '5', '6', '7', '8', '9', '0', '!',',', '?', '.', '\''};
    static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----","-.-.--", "--..--", "..--..", ".-.-.-", ".----."};


    public static String converter(String palavra) {

        palavra = palavra.toLowerCase();
        String morseTranslate = "";

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j < alpha.length; j++) {
                if (palavra.charAt(i) == alpha[j]) {
                    morseTranslate += morse[j] + " ";
                    break;
                }
            }
        }

        return morseTranslate;
    }
}
