# Relatório de Utilização de Inteligência Artificial

## 1. Objetivo
Este documento detalha o processo de utilização de Inteligência Artificial (IA) como ferramenta de apoio para a resolução da questão **Processador de Textos**, sobre o padrão de projeto **Template Method**. A IA atuou como assistente técnico (tutoria e *pair programming*): em vez de entregar a solução pronta, foi pedido um passo a passo, e cada etapa sugerida virou um commit correspondente no repositório.

## 2. Etapas de Desenvolvimento com Suporte da IA

### 2.1. Planejamento: escolha da questão e ordem dos commits/passos
- **Apoio da IA:** A IA analisou a organização do repositório da Lista 1 e propôs a mesma estrutura para este (`src/`, `README.md`, `USO_IA.md`, `.gitignore` e commits com prefixos `docs`, `feat`, `test`, `fix`, `refactor`). Em seguida, dividiu a questão em passos, cada um com seu commit e sua mensagem, de modo que o histórico conte a evolução da solução:
   1. `.gitignore` na raiz e início do projeto;
   2. README com a descrição do problema;
   3. as duas classes originais, com os métodos em branco, como no enunciado;
   4. implementação dos métodos em branco, ainda com código duplicado;
   5. criação da classe abstrata com o Template Method;
   6. refatoração das duas classes para estenderem a classe abstrata;
   7. classe de simulação com `main()`;
   9. README final com o mapeamento do padrão;
   10. este relatório.
- **Prompts utilizados:**
    - "vamos nos basear na organização desse meu repositório passado: [link do repositório da Lista 1] vamos separar em passos para eu fazer o committ"
   - "vamos agora para a questao 5"
- **Ajustes sobre a resposta da IA:** A ordem dos commits foi seguida passo a passo. Aprendemos com a questão 4 a criar o `.gitignore` na raiz antes do primeiro commit e a adicionar os arquivos pelo nome (`git add <arquivo>`), conferindo `git status` antes de cada commit. Na questão 4, o `.gitignore` ficou na pasta errada, e foi preciso refazer o repositório.

### 2.2. Ajuste: métodos `protected`
- **O que a IA fez:** Nas classes originais do enunciado, os métodos são `private static`. A IA sugeriu, na classe abstrata `ProcessadorTexto`, tornar os passos do algoritmo (`extrairCaracteres`, `converterCaracteres` e `juntarCaracteres`) `protected` e não estáticos.
- **Por que o que a IA fez não serviu totalmente / por que o ajuste é necessário:** Um método `private` não é visível nas subclasses e não pode ser sobrescrito, e um método abstrato não pode ser `private`. Métodos `static` também não são sobrescritos. Como o Template Method depende de herança, os passos precisam ser `protected` e de instância.
- **Resultado:** As subclasses `TudoMaiuscula` e `TudoMinuscula` enxergam e implementam o passo variável (`converterCaracteres`), enquanto o código externo só enxerga o método público `converterTexto`.
- **Prompt utilizado:** "nesse codigo se os metodos n fosseme staticos precisariamos criar uma isntancia pra chamar elas dentro dessa funcao de convertertextoemmaiuscula?" (com o código de `TudoMaiuscula` anexado)

### 2.3. Elaboração da Documentação
- **Apoio da IA:** Geração dos modelos do `README.md` (descrição do problema, mapeamento dos papéis do Template Method e instruções de execução) e deste relatório.
   - **Mapeamento no README:** Classe abstrata (`ProcessadorTexto`), método-template (`converterTexto`), passos comuns (`extrairCaracteres` e `juntarCaracteres`), passo variável (`converterCaracteres`), classes concretas (`TudoMaiuscula` e `TudoMinuscula`) e cliente (`TemplateMethodTestDrive`).
- **Prompts utilizados:**
   - "vamos fazer o doc do uso da ia citando a ajuda na ordem dos commits/passos a serem feitos, a questao com os metodos estaticos e transofrmacao para protected e elaboracao da documentação"
