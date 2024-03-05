
package api.vehiculo.model;

public class Carro implements Vehiculo{
    private String marca;
    private int modelo;
    private String placa;
    private int velocidadMAX;

    public Carro(String marca, int modelo, String placa, int velocidadMAX) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidadMAX = velocidadMAX;
    }

    public Carro() {
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

    @Override
    public void acelerar() {
        System.out.println("El carro esta acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El carro esta frenando");
    }

    @Override
    public void estacionar() {
        System.out.println("El carro esta estacionandose");
    }

    @Override
    public void direccionar() {
        System.out.println("El carro esta colocando una direccion");
    }
    
}
