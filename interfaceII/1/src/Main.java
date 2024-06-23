public class Main {
    public static void main(String[] args) {
        Instrumento[] instru1 = new Instrumento[5];
        instru1[0] = new Corda();
        instru1[1] = new Percussao();
        instru1[2] = new Sopro();
        instru1[3] = new SoproMetal();
        instru1[4] = new SoproMadeira();

        sinfonia(instru1);




    }

    public static void sinfonia(Instrumento[] instrumentos){
        for (Instrumento i : instrumentos) {
            i.nome();
            i.afinar();
            i.tocar();
        }
    }


}