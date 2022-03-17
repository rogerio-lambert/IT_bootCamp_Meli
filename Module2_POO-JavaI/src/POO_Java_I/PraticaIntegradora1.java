package POO_Java_I;

        import java.util.HashMap;
        import java.util.Map;

public class PraticaIntegradora1 {
    public static void main(String[] args) {
        HashMap<String, int []> citiesTemperatures = new HashMap<>();
        citiesTemperatures.put("Londres", new int[] {-2, 33});
        citiesTemperatures.put("Madrid", new int[] {-3, 32});
        citiesTemperatures.put("Nueva York", new int[] {-8, 27});
        citiesTemperatures.put("Buenos Aires", new int[] {4, 37});
        citiesTemperatures.put("Assunción", new int[] {6, 42});
        citiesTemperatures.put("São Paulo", new int[] {5, 43});
        citiesTemperatures.put("Lima", new int[] {0, 39});
        citiesTemperatures.put("Santiago de Chile", new int[] {-7, 26});
        citiesTemperatures.put("Lisboa", new int[] {-1, 31});
        citiesTemperatures.put("Tokio", new int[] {-10, 35});
        String hotterCity = "";
        int highterTemperature =-200;
        String colderCity = "";
        int lowerTemperature =  200;
        for (Map.Entry<String, int[]> city : citiesTemperatures.entrySet()) {
            int minTemp = city.getValue()[0];
            int maxTemp = city.getValue()[1];
            if (minTemp < lowerTemperature) {
                lowerTemperature = minTemp;
                colderCity = city.getKey();
            }
            if (maxTemp > highterTemperature) {
                highterTemperature = maxTemp;
                hotterCity = city.getKey();
            }
        }
        System.out.println("A cidade mais quente é " + hotterCity + " com a temperatura máxima de " + highterTemperature);
        System.out.println("A cidade mais fria é " + colderCity  + " com a temperatura mínima de " + lowerTemperature);
    }
}
