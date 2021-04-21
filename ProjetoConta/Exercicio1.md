# Programação 3 e Laboratório de Programação 3

## Exercício sobre POO  
Professor: Daniel Abella  
Curso: Sistemas de Informação
 
       
## Requisitos

● Os códigos devem ser escritos na linguagem Java  
● Os códigos fontes devem ser armazenados no GitHub  
● Os testes devem ser realizados utilizando o JUnit 4 ou posterior  

## Lista de Exercícios
Exercício 1. Construa uma classe chamada “Conta” com os atributos:

- “agencia” que representa o número da agência;
- “conta”, que representa o número da conta;
- “titular”, que representa o titular da conta;
- “limite” que armazena a quantidade atual disponível do limite da conta que o usuário possui;
- “saldo” que é o valor que realmente é pertencente ao usuário;
- “valorLimite” que consiste no valor máximo que o banco lhe fornece como valor de limite.

Complementarmente, deve ser criada uma classe ContaCorrente e uma classe ContaPoupanca.
Atividades:
- Construa os métodos public void, sacar(valor), depositar(valor), e setValorLimite(valor);
- Aplicar o conceito de abstract em classe e métodos;
- Aplicar final na classe, método e variável;
- Sobrecarga e sobrescrita de métodos;
- Uso do static.

2. Na construção dos três métodos faça com que eles lancem exceptions relacionados aos
argumentos, por exemplo, sacar, depositar ou setar um valor negativo para esses eventos.  

* Lance também uma exception no caso de tentar sacar um valor maior que o possível. Nos métodos lancem a exception “IllegalArgumentException()” (Java) com comando “throw”, passe o
motivo da exception(uma String) em seu construtor.

* Crie uma classe main, onde se deve instanciar um objeto da classe “ContaCorrente”, usar os três métodos construídos acima e tratar as exceções propostas com os comandos “try” e “catch”, no catch imprimir na tela o método “getMessage()” da exception declarada no catch. Faça
condições apropriadas para a execução das exceções.

* As exceptions criadas no exercício 1 são exceções unchecked que o Java não obriga a tratá-las mude todas as exceptions do exercício de “IllegalArgumentException()” para “Exception()” que são exceções checked e observe o que ocorre na compilação.