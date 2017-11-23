public class Loenkonto {

    private int saldo;

    public void indbetalPenge (int belob) {
        saldo = saldo + belob;

    }


    public int getSaldo() {
        return saldo;
    }

    public int setSaldo(int saldo) {
        this.saldo = saldo;
        return saldo;
    }
}
