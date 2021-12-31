# BootCamp_ColaboraAi
Trabalho BootCamp da Faculdade Impacta para conclusão do curso de MBA Full Stack Development

# Banco de dados MySql
Para funcionar deve ter uma base criada em branco com o nome ( projeto ), com o usuario root e senha admin123.
caso queira mudar ir nos arquivos de configuração do projeto e mude. (recomendo que não mude)

script para criar o bonco pelo Mysql Workbench ou qualquer outra IDE

CREATE SCHEMA `projeto` DEFAULT CHARACTER SET latin1 ;

# Portas Dos MicroServices

Naming-server : 8761  http://localhost:8761

Api-gateway: 8765

Cadastro-login: 8100 neste microserviço esta subindo os scripsts do banco ele deve ser rodado primeiro que os demais  

Campanha: 8200

Beneficiario: 8300

Colaborador: 8400

Cadasto-gerais: 8500

# Documentação
Cadastro-login
http://localhost:8100/swagger-ui.html   

Campanha
http://localhost:8200/swagger-ui.html   

Beneficiario
http://localhost:8300/swagger-ui.html   

Colaborador
http://localhost:8400/swagger-ui.html

Cadastro Gerais
http://localhost:8500/swagger-ui.html

# Monitoramento com Zipkin
Com o zipkin rodando no doquer
http://localhost:9411

para instalar o zipkin no docker usar o comando   
docker run -p 9411:9411 openzipkin/zipkin:2.23.2 
