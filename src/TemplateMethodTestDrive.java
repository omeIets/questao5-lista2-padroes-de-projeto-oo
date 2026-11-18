public class TemplateMethodTestDrive {
    public static void main(String[] args) {
        String texto = "Padroes de Projeto Orientados a Objetos";

        ProcessadorTexto maiuscula = new TudoMaiuscula();
        ProcessadorTexto minuscula = new TudoMinuscula();

        System.out.println("Original:  " + texto);
        System.out.println("Maiuscula: " + maiuscula.converterTexto(texto));
        System.out.println("Minuscula: " + minuscula.converterTexto(texto));
    }
}