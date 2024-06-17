public class MaisTrês implements Series{

    int inicio;
    int valor;

    public MaisTrês() {
        inicio = 0;
        valor = 0;
    }

    public int getNext() {
        valor += 3;
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
