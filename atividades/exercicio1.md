
# Exercício 1:

## Criação do projeto:

* Criar os artefatos necessários de um projeto Gradle para criar a seguinte estrutura de aplicação Java EE:

```
calculadora-ear-0.1-SNAPSHOT.ear
|- calculadora-war-0.1-SNAPSHOT.war
|- lib
   |- calculadora-api-0.1-SNAPSHOT.jar
   |- calculadora-core-0.1-SNAPSHOT.jar
```

* Defina a interface de serviço REST para uma calculadora de duas operações no projeto API (calculadora-api-0.1-SNAPSHOT.jar).

* Faça a implementação serviço REST de calculadora projeto core (calculadora-core-0.1-SNAPSHOT.jar).

## Detalhes da interface REST:

### Somar:

* URL: \<context-root\>/rest/calc/sum
* Método: GET
* Parâmetros:
  * `first` (parâmetro de query)
  * `second` (parâmetro de query)
* Resposta: JSON com os parâmetros e o resultado ( `{ "first": "1", "second": "2", "result": "3" }` ).

### Subtrair:

* URL: \<context-root\>/rest/calc/subtract
* Método: POST
* Parâmetros:
  * `first` (parâmetro de formulário)
  * `second` (parâmetro de formulário)
* Resposta: JSON com os parâmetros e o resultado ( `{ "first": "1", "second": "2", "result": "-1" }` ).

## Outras informações:

* O deployment da aplicação deverá ser feito no WildFly 10.1.0.Final.
* O projeto deverá estar disponível em um repositório público no GitHub.
* Nenhum arquivo gerado deverá ser incluído no repositório (nem mesmo os arquivos de configuração do Eclipse, que podem ser gerados pelo plugin de Eclipse do Gradle).
* Os arquivos gerados deverão ser ignorados pelo controle de versão (`.gitignore`).
* O repositório do projeto deverá ser enviado por e-mail (e-mail publicado na área do aluno no portal da Univás).
