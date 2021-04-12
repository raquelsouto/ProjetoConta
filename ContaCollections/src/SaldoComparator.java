import java.util.Comparator;

public class SaldoComparator implements Comparator<ContaPoupanca> {

    @Override
    public int compare(ContaPoupanca c1, ContaPoupanca c2) {
        if(c1.getSaldo() > c2.getSaldo()) {
            return 1;
        } else if (c1.getSaldo() < c2.getSaldo()) {
            return -1;
        }
        return 0;
    }
}
