public class Cozinha {
    public  Geladeira geladeira;
    public  Microondas microondas;
    public  Liquidificador liquidificador;

    public Cozinha(){
        this.geladeira.ligado = false;
        this.liquidificador.ligado = false;
        this.microondas.ligado = false;
    }


    public void ligar(){
        geladeira.ligar();
        microondas.ligar();
        liquidificador.ligar();
    }

    public void desligar(){
        geladeira.desligar();
        microondas.ligar();
        liquidificador.ligar();
    }
}
