public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private Banco bancos;
    public Carro(String marca, String modelo, String fabricante, Motor motor, Banco bancos) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.bancos = bancos;
    }

    public String toString(){
        return "marca: " + marca + "\nmodelo: " + modelo + "\nfabricante: "+ fabricante + "\nmotor: " + motor.getTipo() + "\nbanco: "+ bancos.getBancos();
    }


}

