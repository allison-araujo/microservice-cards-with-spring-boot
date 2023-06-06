# Microserviço de avaliação e cadastro de cartão

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
