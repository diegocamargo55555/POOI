public class MaisDois implements Series{
    int inicio;
    int valor;

    // Implement the methods specified by Series.

    public MaisDois() {
        inicio = 0;
        valor = 0;
    }

    public int getNext() {
        valor += 2;
        return valor;
    }

    public void reset() {
        valor = inicio;
    }

    public void setStart(int x) {
        inicio = x;
        valor = x;
    }

}
