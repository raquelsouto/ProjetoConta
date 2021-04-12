import java.util.Comparator;

public class TitularComparator implements Comparator<ContaPoupanca>{

    //Utilize o critério de ordenar pelo nome do titular 
    @Override
    public int compare(ContaPoupanca conta1, ContaPoupanca conta2) {
        return conta1.getTitular().compareTo(conta2.getTitular());
    }
}
