public class Especial extends ContaCorrente {
    public Especial(double saldo, double tirar, double depositar){
        super(saldo, tirar, depositar);
        return;
    }
    public double Retirar(){
        return saldo - (tirar+ getTaxa());
    }
    public double getTaxa(){
        return tirar/100 *1;
    }
}
