public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1000, 150, 200);
        Especial exp1 = new Especial(1000, 2000, 5000);




        System.out.println("Saldo Inicial: " + conta.getSaldo());
        conta.Retirar(conta.tirar, conta.saldo);
        conta.saldo = conta.Retirar(conta.saldo, conta.tirar);
        System.out.println("Saldo após Retirada: " + conta.saldo);

        conta.saldo = conta.Deposito(conta.depositar, conta.saldo);

        System.out.println("Saldo após Deposito: " + conta.saldo);


    }
}