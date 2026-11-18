# Questão 5 - Lista 2 Padrões de Projeto OO
**Alunos:** Maria Letícia de Sousa Barboza e Caio Vinícius de Santana Gomes

Solução da questão **Processador de Textos**, aplicando o padrão **Template Method**.

## O Problema
`TudoMaiuscula` e `TudoMinuscula` seguem o mesmo algoritmo (extrair caracteres, converter, juntar)
e só diferem na conversão. O código estava duplicado.

## Mapeamento do Padrão
- **Classe abstrata (`ProcessadorTexto`):** define o Template Method `converterTexto()`, que fixa a ordem dos passos (`final`).
- **Passos comuns (`extrairCaracteres`, `juntarCaracteres`):** implementação padrão, escrita uma vez.
- **Passo variável (`converterCaracteres`):** método abstrato, implementado por cada subclasse.
- **Classes concretas (`TudoMaiuscula`, `TudoMinuscula`):** só implementam a conversão.
- **Cliente (`TemplateMethodTestDrive`):** usa o processador pela classe abstrata.

## Como Executar
```bash
cd src
javac *.java
java TemplateMethodTestDrive