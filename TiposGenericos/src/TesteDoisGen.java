public class TesteDoisGen {
    public static void main(String[] args) {
        // Cria referencias Gen para Integer e para String.
        DoisGen<Integer, String> iOb;
        DoisGen<String, Character> strOb;

        // Cria um objeto Gen<Integer> e atribui sua
        // referencia para iOb. Note o uso de autoboxing
        // para encapsular o valor 88 em um objeto Integer.
        iOb = new DoisGen<Integer, String>(88, "88");

        // Mostra o tipo de dado usado por iOb.
        iOb.showType();

        // Obt�m o valor em iOb. Note que
        // nenhuma coer��o (cast) � necess�rio.
        int v = iOb.getOb1();
        System.out.println("valor: " + v);

        String b = iOb.getOb2();
        System.out.println("valor: " + v);


        System.out.println();

        // Cria um objeto Gen para Strings.
        strOb = new DoisGen<String, Character>("Testa Genericos", 'T');

        // Mostra o tipo de dado usado por strOb.
        strOb.showType();

        // Obt�m o valor de strOb. Novamente, note
        // que nenhum coer��o (cast) � necess�rio.
        String str = strOb.getOb1();
        System.out.println("valor: " + str);

        Character cha = strOb.getOb2();
        System.out.println("valor: " + cha);
    }
}
