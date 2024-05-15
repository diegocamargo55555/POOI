public class ContaCorrente {
    public double saldo, tirar, depositar;

    public ContaCorrente(double saldo, double tirar, double depositar) {
        this.saldo = saldo;
        this.tirar = tirar;
        this.depositar = depositar;
    }

    public double Deposito(double saldo, double depositar) {
        return saldo + depositar;
    }

    public double Retirar(double saldo, double tirar){
        return saldo - (tirar+ (tirar/100)*2);
    }

    public double getSaldo() {
        return saldo;
    }
}