public class TesteConversaoDeTemperatura {


    public static void main(String[] args) {

        ConverteTemperatura converteTemp = new ConverteTemperatura();

        try {
            System.out.println("A temperatura é de " +converteTemp.converteFahrenheitParaCelsius(30)+"ºC");

        } catch (FahrenheitException e) {
            e.printStackTrace();
        }

        System.out.println("");

        try {
            System.out.println("A temperatura é de "+ converteTemp.converteFahrenheitParaCelsius(86)+ "ºC");

        } catch (FahrenheitException e) {
            e.printStackTrace();
        }

        System.out.println("");

        // Teste de Exceção (FahrenheitException)
        try {
            System.out.println(converteTemp.converteFahrenheitParaCelsius(-469.67));

        } catch (FahrenheitException e) {
            e.printStackTrace();
        }
    }
}

