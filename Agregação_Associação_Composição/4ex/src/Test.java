public class Test {
    public static void main(String[] args){
        Cozinha cozi1 = new Cozinha();
        cozi1.ligar();

        cozi1.geladeira.observar();
        cozi1.liquidificador.observar();
        cozi1.microondas.observar();
    }
}
