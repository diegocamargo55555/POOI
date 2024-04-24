public class retangulo {
    private double comprimento, largura;

    public retangulo(){
        comprimento = 1;
        largura =  1;
    }

    public retangulo(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double getComprimento(){
        return comprimento;
    }

    public double getLargura(){
        return largura;
    }


    public double CPerimetro(){
        return comprimento + largura;
    }

    public double CArea(){
        return comprimento * largura;
    }
    public void puts(){
        System.out.println("Perimetro: "+ CPerimetro() + "\nArea: " + CArea());
    }


}
