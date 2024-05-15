public class Produto {
    private String nome;
    private double preco, saldo;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    public double getPreco(){
        return preco;
    }

    public double getSaldo(){
        return saldo;
    }


    public String getNome(){
        return nome;
    }

    public boolean ehCaro(double preco){
        if (preco > 50){
            return true;
        }else
            return false;
    }

    public double compra(){
        return (getSaldo() - getPreco());
    }
}
