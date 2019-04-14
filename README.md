#Credenciais do sistema

# **Login: user@gmail.com**
# **Senha: 123456**


# sIng.Ed - Sistema Integrado de Gestão de Serviços
Projeto da hackathon code a city 2.0 o qual visa facilitar e otimizar o fluxo de informações ente construtora, síndico e condômino. De modo que todos os stakeholders sempre estejam na mesma página de conhecimento sobre o que ocorre o seu condomínio.

**Problema:** informação entre os três stakeholders(construtora, síndico e condôminio) funciona de forma falha, ou simplesmente não funciona.

**Solução:** através de uma plataforma mobile conectar esses três stakeholders de forma que a informação flua em de ponta a ponta na dinâmica da comunicação.

**Fluxo da informação:**
Construtora - síndico - condômino

A **construtora** monitora as manutenções que o condomínio possui a obrigação de realizar em um espaço de tempo de cinco anos, para poder ter garantia em casos de danos estruturais no edifício.

O **síndico** pode monitorar de forma mais otimizada as manutenções preventivas que precisam ser feitas e consiga repassar essa informação tanto para a construtora como para o condômino. De forma que a construtora validará a informação e enviará um status informando se as manutenções estão ok, e o condôminio tenha acesso sobre esses status, de modo que ele possua transparência sobre o que ocorre no seu prédio.

O **condômino** possa acompanhar o que acontece no seu prédio de forma transparente e possa realizar reports para cobrar manutenções em relação ao prédio.

## Arquitetura

Modelo MVC - Model-View-Controller onde a parte do controller e view estarão presentes na ponta do usuário enquanto o model (que representa nosso banco de dados) estará na ponta da nuvem. O sistema de banco de dados escolhido foi o firebase por possuir uma melhor integração com a aplicação.


## Banco de dados
Firebase
Pois possui uma melhor integração com a aplicação
Banco de dados em nuvem escalável para grandes fluxos de informação


## Fluxo em formato BPMN se encontra na pasta "documentação" e na Wiki do projeto





