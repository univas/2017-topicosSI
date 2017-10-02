
# Primeira prova de Tópicos Avançados em Sistemas de Informação

## Objetivo do projeto

Disponibilizar um serviço REST para geração do número de Fibonacci, correspondente a um número inteiro, sabendo que:
* F0 = 0
* F1 = 1
* Fn = Fn-1 + Fn-2

## Criação do projeto

* Criar os artefatos necessários de um projeto Gradle para gerar a seguinte estrutura de aplicação Java EE:

```
fibcalc-ear-0.1-SNAPSHOT.ear
|- fibcalc-war-0.1-SNAPSHOT.war
|- lib
   |- fibcalc-api-0.1-SNAPSHOT.jar
   |- fibcalc-core-0.1-SNAPSHOT.jar
   |- fibcalc-lib-0.1-SNAPSHOT.jar
```

* Defina a interface de serviço REST para o gerador de número de Fibonacci no projeto API (fibcalc-api-0.1-SNAPSHOT.jar).

* Faça a implementação serviço REST para o gerador de número de Fibonacci no projeto core (fibcalc-core-0.1-SNAPSHOT.jar). A implementação deverá simplesmente chamar a classe do projeto de biblioteca. Para isso, o projeto core deverá depender de ambos, API e biblioteca.

* No projeto de biblioteca (fibcalc-lib-0.1-SNAPSHOT.jar), crie uma classe com um método estático capaz de calcular o número de Fibonacci. Uma alternativa é usar o código abaixo:

```
  public static int fibonacci(int n) {
      int lo = 0;
      int hi = 1;
      for (int i = 0; i < n; i++) {
          hi = lo + hi;
          lo = hi - lo;
      }
      return lo;
  }
```

## Detalhes da interface REST

### Definição das URLs

Context root do projeto:

`http://<host>:<port>/fibcalc`

Endereço da aplicação REST:

`http://<host>:<port>/fibcalc/rest`

Endereço do serviço REST:

`http://<host>:<port>/fibcalc/rest/fibcalc`

### Definição do serviço REST

#### Cálculo do número de Fibonacci

* URL: \<context-root\>/rest/fibcalc/fib/{num}
* Método: GET
* Parâmetros:
  * `num` (parâmetro de path)
* Resposta: JSON com o parâmetro e o resultado ( `{ "number": "6", "fibonacci": "8" }` ).

## Outras informações

* O deployment da aplicação deverá ser feito no WildFly 10.1.0.Final.
* O projeto deverá estar disponível em um repositório público no GitHub.
* Nenhum arquivo gerado deverá ser incluído no repositório (nem mesmo os arquivos de configuração do Eclipse, que podem ser gerados pelo plugin de Eclipse do Gradle).
* Os arquivos gerados deverão ser ignorados pelo controle de versão (`.gitignore`).
* O repositório do projeto deverá ser enviado por e-mail (e-mail publicado na área do aluno no portal da Univás).

## Critérios de avaliação

* Geração da estrutura correta do projeto: 40 pontos
* Execução correta do serviço REST: 30 pontos
* Arquivos gerados ignorados corretamente e não presentes no GitHub: 10 pontos
* Posicionamento correto das classes: 20 pontos
  * Interface de serviço no projeto API
  * Implementação do serviço no projeto core
  * Implementação do cálculo no projeto library
  * Dependência correta entre os projetos
