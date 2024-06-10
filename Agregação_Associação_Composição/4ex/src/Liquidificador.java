public class Liquidificador {
    boolean ligado;

    public Liquidificador(){
        ligado = false;
    }
    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    public boolean isLigado(){
        if (ligado == true)
            return true;
        else
            return false;
    }
    public void observar(){
        if (ligado == true)
            System.out.println( "on");
        else
            System.out.println( "on");
    }
}
