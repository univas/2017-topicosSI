# Configuração do PostgreSQL no WildFly

## Criação do módulo com o driver

* Criar a pasta:
```
${WildFlyHome}/modules/system/layers/base/org/postgresql/main
```
* Copiar o driver do postgre para a pasta:
```
postgresql-42.1.4.jar
```
* Criar o arquivo module.xml na mesma pasta:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<module xmlns="urn:jboss:module:1.0" name="org.postgresql">
  <resources>
    <resource-root path="postgresql-42.1.4.jar"/>
  </resources>
  <dependencies>
     <module name="javax.api" export="true"/>
     <module name="javax.transaction.api"/>
   </dependencies>
</module>
```

# Configuração do Driver no standlone.xml
* Editar o arquivo standalone.xml que se encontra na pasta:
```
${WildFlyHome}/standalone/configuration
```
* Encontrar a tag `<drivers></drivers>` e incluir a configuração do Driver do PostgreSQL:
```xml
<driver name="PostgreSQL" module="org.postgresql">
    <driver-class>org.postgresql.Driver</driver-class>
</driver>
```
# Criação do Datasource
* Entre no console de administração do WildFly (http://localhost:9990/console)

* Escolha Configuration&rarr;Subsystems&rarr;Datasources&rarr;Non-XA&rarr;Add

* Escolha "Custom" e clique em "Next"

* Informe o nome (EstoqueDS) e o JNDI name (java:/EstoqueDS) e clique em "Next"

* Selecione "Detected Driver"&rarr;"PostgreSQL" e clique em "Next"

* Informe a URL do banco (jdbc:postgresql://localhost:5432/estoque), username (postgres) e senha e clique em "Next"

* Clique em "Finish"

* Para testar a conexão, clique no Datasource e selecione "View", escolha a aba "Connection" e clique em "Test Connection"
