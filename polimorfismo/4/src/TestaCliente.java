public class TestaCliente {
    public static void main(String[] args){
        Cliente primeiro = new Cliente();
        ClienteEspecial esp = new ClienteEspecial();

        // O polimorfismo ocorre no metodo toString()
        System.out.println(primeiro);
        System.out.println(esp);
    }
}
