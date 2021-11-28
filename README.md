# BootCamp_ColaboraAi
Trabalho BootCamp da Faculdade Impacta para conclusão do curso de MBA Full Stack Development

# Portas Dos MicroServices

Naming-server : 8761 
Api-gateway: 8765
Cadastro-login: 8100 neste microserviço esta subindo os scripsts do banco ele deve ser rodado primeiro que os demais  
Campanha: 8200
Beneficiario: 8300
Colaborador: 8400

# Documentação
http://localhost:8100/swagger-ui.html
http://localhost:8200/swagger-ui.html
http://localhost:8300/swagger-ui.html
http://localhost:8400/swagger-ui.html

# Monitoramento com Zipkin
Com o zipkin rodando no doquer
http://localhost:9411

para instalar o zipkin no docker usar o comando   
docker run -p 9411:9411 openzipkin/zipkin:2.23.2 
