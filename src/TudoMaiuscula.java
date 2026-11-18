public class TudoMaiuscula {

    public static String converterTextoEmMaiusculo(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresAgoraMaiusculos = converterCaracteresEmMaiusculo(caracteres);
        String resultado = juntarCaracteresAgoraMaiusculo(caracteresAgoraMaiusculos);
        return resultado;
    }

    private static char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }

    private static char[] converterCaracteresEmMinusculo(char[] chars) {
        char[] resultado = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultado[i] = Character.toLowerCase(chars[i]);
        }
        return resultado;
    }

    private static String juntarCaracteresAgoraMinusculo(char[] chars) {
        return new String(chars);
    }
}