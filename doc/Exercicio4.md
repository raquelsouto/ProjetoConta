# Exercício 4 

1. Criem um projeto que contenha uma calsse Conta de maneira que ela possua no mínimo um atributo numero;   

* private int numero;   

* Além da classe Conta devem ser criadas duas classes ContaCorrente e ContaPoupança com os respectivos atributos que acharem necessário (obs: criar os metodos get e set das classes), que herdam da classe conta.

2. Faça sua classe ContaPoupanca implementar a interface
Comparable<ContaPoupanca>. Utilize o critério de ordenar pelo número da conta ou pelo seu saldo.

3. Crie uma classe TestaOrdenacao, onde você vai instanciar diversas contas e adicioná-las a uma List<ContaPoupanca>. Use o Collections.sort() nessa lista.
    * Faça um laço para imprimir todos os números das contas na lista já ordenada

4. O que teria acontecido se a classe ContaPoupanca não implementasse
Comparable<ContaPoupanca> mas tivesse o método compareTo? Faça um teste:
    * remova temporariamente a sentença implements Comparable<ContaPoupanca>, não remova o método compareTo e veja o que acontece. Basta ter o método, sem assinar a interface?

5. Utilize uma LinkedList em vez de ArrayList:List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>(); Precisamos alterar mais algum código para que essa substituição funcione? Rode o programa. Alguma diferença?

6. Como posso inverter a ordem de uma lista? Como posso embaralhar todos os elementos de uma lista? Como posso rotacionar os elementos de uma lista? Investigue a documentação da classe Collections dentro do pacote java.util.

7. Mude o critério de comparação da sua ContaPoupanca. Adicione um atributo nomeDoCliente na sua classe (caso ainda não exista algo semelhante) e tente mudar o compareTo para que uma lista de ContaPoupanca seja ordenada alfabeticamente pelo atributo nomeDoCliente.

8. Crie um código que insira 30 mil números numa ArrayList e pesquise-os. Vamos usar um método de System para cronometrar o tempo gasto

    * Troque a ArrayList por um HashSet e verifique o tempo que vai demorar:
    Collection<Integer> teste = new HashSet<Integer>();

    O que é lento? A inserção de 30 mil elementos ou as 30 mil buscas? Descubra computando o tempo gasto em cada for separadamente;
    
    Depois, altere o código para usar o generics, e não haver a necessidade do casting, além da garantia de que nosso mapa estará seguro em relação a tipagem usada.

11. Crie uma classe Banco que possui uma List de Conta chamada contas. Repare que numa lista de Conta, você pode colocar tanto ContaCorrente quanto contaPoupanca por causa do polimorfismo. Crie um método void adiciona(Conta c), um método Conta pega(int x) e outro int pegaTotalDeContas. Basta usar a sua lista e delegar essas chamadas para os métodos e coleções que estudamos.

12. No Banco, crie um método Conta buscaPorNome(String nome) que procura por uma Conta cujo nome seja equals ao nome dado. Você pode implementar esse método com um for na sua lista de Conta, porém não tem uma performance eficiente. Adicionando um atributo privado do tipo Map<String, Conta> terá um impacto significativo. Toda vez que o método adiciona(Conta c) for invocado, você deve invocar .put(c.getNome(), c) no seu mapa. Dessa maneira, quando alguém invocar o método Conta buscaPorNome(String nome), basta você fazer o get no seu mapa, passando nome como argumento!

13. Crie o método hashCode para a sua conta, de forma que ele respeite o equals de que duas contas são equals quando tem o mesmo número. Verifique se sua classe funciona corretamente num HashSet. Remova o método hashCode. Continua funcionando? Dominar o uso e o funcionamento do hashCode é fundamental para o bom programador.