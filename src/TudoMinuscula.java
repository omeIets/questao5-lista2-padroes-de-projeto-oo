public class TudoMinuscula {

    public static String converterTextoEmMinusculo(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresAgoraMinusculos = converterCaracteresEmMinusculo(caracteres);
        String resultado = juntarCaracteresAgoraMinusculo(caracteresAgoraMinusculos);
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