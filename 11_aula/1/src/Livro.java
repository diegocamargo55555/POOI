public class Livro extends Produto{
    String autor;
    int paginas;

    public Livro(String nome, double preco, String autor, int paginas){
        super(nome, preco);
        this.autor = autor;
        this.paginas = paginas;
    }


    public boolean ehExtenso(){
        if (paginas > 100)
            return true;
        else
            return false;
    }



    public double compra(){
        return (getSaldo() - getPreco() * 0.9);
    }



}
