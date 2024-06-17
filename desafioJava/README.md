# Registro de Transações Bancárias

## Descrição
Você está desenvolvendo um programa simples em Java para manter um registro de transações bancárias. Cada transação é armazenada em uma lista.

## Entrada
O programa solicitará ao usuário que informe o saldo inicial da conta.
Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

## Entrada de Transações:
Para cada transação, o programa solicitará ao usuário:
O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
O valor da transação.
Saída
Utilizando listas (ArrayList ou LinkedList), o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.
 

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	
2500
2
d
100
s
500	

Saída
Saldo: 2100.0
Transacoes:
1. Deposito de 100.0
2. Saque de 500.0

Entrada
900
1
s
100	

Saída
Saldo: 800.0
Transacoes:
1. Saque de 100.0

Entrada
0
0	

Saída
Saldo: 0.0
Transacoes:

---------------------------------

# Registro de Transações Bancárias com Stream API

## Descrição
Você está aprimorando o programa anterior e agora deseja utilizar a Stream API do Java para processar as transações bancárias de forma mais eficiente.

## Entrada
O programa solicitará ao usuário que informe o saldo inicial da conta.
Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

## Entrada de Transações:
Para cada transação, o programa solicitará ao usuário:
O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
O valor da transação.
## Saída
Utilizando a Stream API, o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.
 

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	
100
2
d
10
s
20	

Saída
Saldo : 90.0
Transacoes:
d de 10.0
s de 20.0

Entrada
5000
1
d
500	

Saída
Saldo : 5500.0
Transacoes:
d de 500.0

---------------------------------

# Conta Bancária com Construtor em POO

## Descrição
Você está desenvolvendo um programa simples em Java para representar uma conta bancária. Utilizando programação orientada a objetos (POO), você criará uma classe ContaBancaria com um construtor que permitirá a inicialização da conta com um saldo inicial.

## Entrada
O programa solicitará ao usuário que informe o saldo inicial da conta.
Em seguida, o programa solicitará ao usuário que realize transações de depósito e saque.
## Saída
A classe ContaBancaria conterá métodos para realizar depósitos e saques, atualizando o saldo da conta.
O saldo atual será exibido após cada transação.
Se o valor do saque for maior que o saldo disponível na conta, imprima uma mensagem informando: Saldo insuficiente. Saque não realizado.
 

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	
50
50
100	

Saída
Deposito feito.
Saldo atual: 100.0
Saque feito.
Saldo atual: 0.0

Entrada
90
90
12	

Saída
Deposito feito.
Saldo atual: 180.0
Saque feito.
Saldo atual: 168.0

---------------------------------

# Herança Bancária: Entendendo a Herança e Polimorfismo

## Desafio
Após o sucesso no desenvolvimento do sistema básico de abertura de contas bancárias, o banco decidiu expandir seus serviços para oferecer diferentes tipos de contas. Agora, além das contas bancárias comuns, eles também oferecem contas poupança. Sua tarefa é implementar a herança e o polimorfismo no sistema, criando uma classe "ContaPoupanca" que herde da classe "ContaBancaria" anteriormente criada. A classe "ContaPoupanca" deve adicionar um novo atributo, taxa de juros, além dos atributos herdados.

### Dica: Utilize a herança para criar a classe "ContaPoupanca" que herde da classe "ContaBancaria" e adicione o atributo "taxaJuros". Implemente o método "exibirInformacoes()" na classe "ContaPoupanca" para exibir as informações adicionais.

## Entrada
O programa deve solicitar ao usuário as informações necessárias para abrir uma conta poupança. A entrada deve ser feita via console (linha de comando) e deve incluir o número da conta (um valor inteiro), o nome do titular (uma sequência de caracteres), o saldo inicial da conta (um valor decimal) e a taxa de juros da conta poupança (um valor decimal).

## Saída
Após receber as informações da conta poupança, o programa deve criar um objeto do tipo "ContaPoupanca" e exibir na tela as informações dessa conta, incluindo o número da conta, o nome do titular, o saldo atual e a taxa de juros. A saída deve ser formatada de forma clara e legível para o usuário.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	
Joao
123456
1000.0
1.5	

Saída
Conta Poupanca:
Joao
123456
Saldo: R$ 1000.0
Taxa de juros: 1.5%

Entrada
Ana
789012
2500.0
3.0	

Saída
Conta Poupanca:
Ana
789012
Saldo: R$ 2500.0
Taxa de juros: 3.0%

Entrada
Maria
987654
500.0
2.5	

Saída
Conta Poupanca:
Maria
987654
Saldo: R$ 500.0
Taxa de juros: 2.5%

---------------------------------

# Cofres Seguros: Dominando o Encapsulamento e Abstração

## Descrição
Você foi contratado para desenvolver um sistema de cofres seguros. O objetivo é criar dois tipos de cofres: um Cofre Digital, que é aberto por senha, e um Cofre Físico, que é aberto por chave.

## Entrada
O programa irá solicitar ao usuário que digite o tipo de cofre a ser criado: "digital" ou "físico". Se for escolhido o tipo "digital", o programa irá solicitar a senha e a confirmação de senha do cofre digital (ambas com apenas números). Caso seja escolhido o tipo "físico", não é necessário nenhuma outra entrada.

## Saída
O programa irá exibir as informações do cofre criado. Para o Cofre Digital, será exibido o tipo e o método de abertura (senha). Para o Cofre Físico, será exibido apenas o tipo e o método de abertura (chave).

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	
digital
12345
1234

Saída
Tipo: Cofre Digital
Metodo de abertura: Senha
Senha incorreta!

Entrada
fisico

Saída
Tipo: Cofre Fisico
Metodo de abertura: Chave

Entrada
digital
2525
2525

Saída
Tipo: Cofre Digital
Metodo de abertura: Senha
Cofre aberto!