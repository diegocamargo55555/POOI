public class testPonto2D {
    public static void main(String[] args) {
        ponto2D p1 = new ponto2D();
        System.out.println("cordenadas p1: "+ p1.getX() + "  " + p1.getY() + "\ncontador: " + ponto2D.getContador());

        ponto2D p2 = new ponto2D(10, 20);
        System.out.println("cordenadas p2: " + p2.getX() + "  " + p2.getY() + "\ncontador: " + ponto2D.getContador());
    }
}
