public class EletroApp {
    public static void main(String[] args){

        Eletrodomestico[] eletrodomesticos = new Eletrodomestico[2];

        eletrodomesticos[0] = new Geladeira();
        eletrodomesticos[1] = new Microondas();

        Ligar(eletrodomesticos);


    }


    public static void Ligar(Eletrodomestico[] eletrodomesticos){
        for (Eletrodomestico eletrodomestico: eletrodomesticos){
            eletrodomestico.ligar();
            eletrodomestico.desligar();
        }
    }
}
