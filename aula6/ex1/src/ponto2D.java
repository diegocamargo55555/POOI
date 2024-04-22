public class ponto2D {
    private double x,y;
    private static int contador = 0;

    public ponto2D(){
        x = 0;
        y = 0;
        contador++;
    }

    public  ponto2D(double x, double y){
        this.x = x;
        this.y = y;
        contador++;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public static int getContador(){
        return  contador;
    }


}
