
# Segunda prova de Tópicos Avançados em Sistemas de Informação

## Objetivo do projeto

Salvar pedidos de compras e buscar a descrição de todos os pedidos.

## Banco de dados

* Nome do banco de dados: `shopping`

* Script de criação da tabela:
```sql
create table shopping_order (
  id integer not null,
  description varchar(50) not null,
  order_time timestamp not null,
  constraint pk_order primary key (id)
);
```
* Script de criação da sequence:
```sql
create sequence seq_shopping_order;
```

## Criação do projeto

* Criar os artefatos necessários de um projeto Gradle para gerar a seguinte estrutura de aplicação Java EE:

```
shopping-ear-0.1-SNAPSHOT.ear
|- shopping-war-0.1-SNAPSHOT.war (módulo Web)
|- shopping-ejb-0.1-SNAPSHOT.jar (módulo EJB)
|- lib
   |- shopping-api-0.1-SNAPSHOT.jar
   |- shopping-core-0.1-SNAPSHOT.jar
   |- shopping-ejb-client-0.1-SNAPSHOT.jar
```
> **ATENÇÃO**: A estrutura descrita acima não é a estrutura de projetos do Gradle, e sim a estrutura do EAR gerado.

* Defina a interface do serviço REST no projeto api (shopping-api-0.1-SNAPSHOT.jar).

* Defina a implementação do serviço REST no projeto core (shopping-core-0.1-SNAPSHOT.jar).

* Defina a interface do EJB de sessão no projeto ejb-client (shopping-ejb-client-0.1-SNAPSHOT.jar).

* Defina a implementação do EJB de sessão, da entidade JPA e do DAO no projeto ejb (shopping-ejb-0.1-SNAPSHOT.jar).

## URLs e nomes JNDI

* Context root do projeto: `http://<host>:<port>/shopping`

* Nome JNDI do DataSource: `java:/ShoppingDS`

## Definição do serviço REST

### Criação de pedido de compra

* URL: `<context-root>/order/add`
* Método: `POST`
* Parâmetros:
  * `description` (parâmetro de formulário)
* Resposta:
  * Pedido criado com sucesso (http status code 201).
  * Não é necessário corpo na resposta.
* Resultado esperado:
  * O pedido de compra criado na base de dados.
  * A data e hora do pedido (`order_time`) deve ser gerada pelo sistema, internamente no EJB de sessão.

### Busca das descrições de todos os pedidos

* URL: `<context-root>/order/all`
* Método: `GET`
* Parâmetros: Este método não requer parâmetros.
* Resposta:
  * JSON contendo array de descrições.
  * Exemplo: `[ "description1", "description2" ]`

## Outras informações

* O deployment da aplicação deverá ser feito no WildFly 10.1.0.Final.
* O projeto deverá estar disponível em um repositório público no GitHub.
* Nenhum arquivo gerado deverá ser incluído no repositório (nem mesmo os arquivos de configuração do Eclipse, que podem ser gerados pelo plugin de Eclipse do Gradle).
* Os arquivos gerados deverão ser ignorados pelo controle de versão (`.gitignore`).
* O repositório do projeto deverá ser enviado por e-mail (e-mail publicado na área do aluno no portal da Univás).

## Critérios de avaliação

* Geração da estrutura correta do projeto: 20 pontos
* Execução correta do serviço REST: 30 pontos
  * Durante a correção, irei executar uma collection do postman. Caso funcione corretamente sem a necessidade de alteração no projeto, ganha os 30 pontos.
  * Caso eu tenha que fazer apenas uma pequena alteração para cumprir a interface, ganha 20 pontos.
  * Caso eu tenha que fazer mais de uma pequena alteração, ganha 10 pontos.
  * Caso as alterações necessárias não sejam pequenas, ou seja, algo além de nomes de parâmetros, campos do resultado ou URLs, perde os pontos da questão.
* Salvamento correto das informações na base de dados: 30 pontos
  * Durante a correção, irei executar os request e verificarei se o dado foi salvo corretamente na tabela na minha base de dados. Caso funcione corretamente sem a necessidade de alteração no projeto, ganha os 30 pontos.
  * Caso eu tenha que fazer apenas uma pequena alteração (nome de um campo ou nome JNDI), ganha 20 pontos.
  * Caso eu tenha que fazer mais de uma pequena alteração, ganha 10 pontos.
  * Caso as alterações necessárias não sejam pequenas, ou seja, algo além de nomes tabelas e colunas ou nome JNDI, perde os pontos da questão.
* Arquivos gerados ignorados corretamente e não presentes no GitHub: 10 pontos
* Posicionamento correto das classes: 10 pontos
  * Interface de serviço no projeto API
  * Implementação do serviço no projeto core
  * Interface do EJB no projeto ejb-client
  * Implementação dos EJBs no projeto ejb (incluindo DAO)
  * Implementação do JPA no projeto ejb (classe de entidade e arquivo persistence.xml)
  * Dependência correta entre os projetos
