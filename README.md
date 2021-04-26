# Aplicativo Spring MVC com segurança sem estado usando JWT apoiado por LDAP

Em vez de verificar a autenticação do usuário usando o banco de dados MongoDB, ele usa um servidor LDAP.

#### Requisitos

 * Java 8
 * Servidor LDAP

#### Configurações de LDAP

 * Mude suas configurações dentro de `src/main/resources/application.properties`
 * Altere a função permitida dentro de `ProtectedController`

A configuração LDAP não é fornecida aqui (dependendo do seu serviço de TI).

#### Construindo e instalando o aplicativo

 * Execute `mvn clean install`.
 * implantar o WAR integrado em seu contêiner de servlet favorito (JBoss, Tomcat, ...)

 
