public class Retangulo extends TwoDShape{

    public Retangulo(){
        largura = 5;
        altura = 8;
    }
    public double getLargura(){
        return largura;
    }
    public double getaltura(){
        return altura;
    }


    public boolean square(){
        if (largura == altura){
            return true;
        }else
            return false;
    }

    public double area(){
        return largura * altura;
    }
}
