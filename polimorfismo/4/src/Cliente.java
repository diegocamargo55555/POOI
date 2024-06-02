public class Cliente {
    double saldo, limite;
    String nome;

    public Cliente(){
        nome = "first";
        saldo = 555.55;
        limite = 444.44;
    }
    public String toString(){
        return nome + "\nsaldo: " + saldo + "\nlimite: " + limite;
    }
}
