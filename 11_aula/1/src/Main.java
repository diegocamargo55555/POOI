public class Main {
    public static void main(String[] args) {
        Produto t1 = new Produto("oner", 99);
        Livro redes = new Livro("redes", 300, "tanebaum", 600);

        System.out.println("é caro " + t1.ehCaro(99));

        System.out.println("saldo apos compra:  " + t1.compra());

        System.out.println("é caro " + redes.ehCaro(99));

        System.out.println("saldo apos compra:  " + redes.compra());
    }




}