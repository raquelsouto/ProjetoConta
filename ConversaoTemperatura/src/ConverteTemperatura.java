public class ConverteTemperatura {

    public double converteFahrenheitParaCelsius(double temperaturaFahrenheit) throws FahrenheitException {
        if(temperaturaFahrenheit >= -459.67) {
            double celsius = (5*(temperaturaFahrenheit - 32))/9;
            return celsius;

        } else {
            throw new FahrenheitException("Conversão Inválida.");
        }
    }

}

