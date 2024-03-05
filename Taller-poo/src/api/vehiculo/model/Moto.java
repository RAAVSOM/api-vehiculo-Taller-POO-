
package api.vehiculo.model;

public class Moto implements Vehiculo{
    private String marca;
    private int modelo;
    private String placa;
    private int velocidadMAX;
    private int cilindraje;

    public Moto(String marca, int modelo, String placa, int velocidadMAX, int cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadMAX = velocidadMAX;
        this.cilindraje = cilindraje;
    }

    public Moto() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidadMAX() {
        return velocidadMAX;
    }

    public void setVelocidadMAX(int velocidadMAX) {
        this.velocidadMAX = velocidadMAX;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public void acelerar() {
        System.out.println("La moto esta acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("La moto esta frenando");
    }

    @Override
    public void estacionar() {
        System.out.println("La moto esta estacionandose");
    }

    @Override
    public void direccionar() {
        System.out.println("La moto esta colocando una direccion");
    }
    
}
