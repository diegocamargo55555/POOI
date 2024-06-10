public abstract class ContaBancaria {
    String nome;
    double saldo;

    public ContaBancaria(String nome1){
        this.nome = nome1;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void retira(double valor);

    public void depositar(double valor){
        setSaldo(saldo + valor);
    }






}
