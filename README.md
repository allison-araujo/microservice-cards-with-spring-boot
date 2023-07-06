# Microserviço de avaliação e cadastro de cartão

<img src=https://github.com/allison-araujo/microservice-cards-with-spring-boot/assets/39178001/64f136ca-c911-4312-a649-1e6adde72657 width="700" height="500" />


<img src=https://github.com/allison-araujo/microservice-cards-with-spring-boot/assets/39178001/32312970-c7fd-4d9f-8a44-fdef8f1ca56a width="700" height="500"/>

<img src=https://github.com/allison-araujo/microservice-cards-with-spring-boot/assets/39178001/c07b94c5-00d6-4ee0-8723-4bc494620370  width="700" height="500"/>


## criar cliente

### endpoint:

http://localhost:8080/client

{
"name": "dboinha",
"cpf": "01234567890",
"age": 30
}

## cadastro de cartão do cliente criado

### endpoint:

http://localhost:8080/cards

{
"name": "SANTANDER",
"flag": "VISA",
"income": 5000,
"limite": 6000
}

## buscar cartoes cadastrado:

http://localhost:8080/cards

### ver cartões existente do cliente cadastrado

http://localhost:8080/avaliable-credit/situation-client

### emitir cartão para cliente

endpoint: http://localhost:8080/avaliable-credit/request-cards

{
"idCard": 1,
"cpf": "01234567890",  
 "address": "R X de abril",
"limitReleased": 15600
}

## avaliar credito do cliente

endpoint:
http://localhost:8080/avaliable-credit

{
"cpf": "01234567890",
"income": 10000
}
