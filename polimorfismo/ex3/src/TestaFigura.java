public class TestaFigura {
    public static void main(String[]args ){
        Circulo bola = new Circulo();
        Quadreado caixa = new Quadreado();

        // O polimorfismo ocorre no metodo area();
        System.out.println(bola.area(5));
        System.out.println(caixa.area(4));

    }
}
