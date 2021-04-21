## Exercício 2 

1. Considere o problema de conversão de temperaturas entre Celsius e Fahrenheit em Java.

* Crie duas exceções, TemperatureException que herda de Exception e FahrenheitException que herda de TemperatureException.

* Crie uma classe utilitária (Utils) com um método para converter temperaturas em graus Fahrenheit para graus Celsius (toCelsius()), ambas representadas em ponto-flutuante (double).

* Porém, caso o valor a ser convertido seja menor que zero absoluto (-459,67°F) deve-se lançar a exceção FahrenheitException. A formula para conversão é dada por:

        C = 5(F - 32)/9


