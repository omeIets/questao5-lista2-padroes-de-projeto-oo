public abstract class ProcessadorTexto {

    // Template Method
    public final String converterTexto(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] convertidos = converterCaracteres(caracteres);
        return juntarCaracteres(convertidos);
    }

    // passo variável - cada subclasse define como converte
    protected abstract char[] converterCaracteres(char[] chars);

    // passos comuns - implementação padrão, igual para todas as subclasses
    protected char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }

    protected String juntarCaracteres(char[] chars) {
        return new String(chars);
    }

}