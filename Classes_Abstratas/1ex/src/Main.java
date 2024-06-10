public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaSimples("G");

        c1.setSaldo(555.55);
        c1.depositar(444.44);

        System.out.println("saldo:"+ c1.getSaldo());



    }


}