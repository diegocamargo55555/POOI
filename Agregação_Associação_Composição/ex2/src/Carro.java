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
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public String getTipoMotor() {
        return motor.getTipo();
    }

    public String getBanco() {
        return bancos.getBancos();
    }


}
