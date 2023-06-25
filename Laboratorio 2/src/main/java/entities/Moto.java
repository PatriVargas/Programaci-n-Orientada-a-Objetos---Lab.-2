package entities;

class Moto extends Vehiculo {
    private String cilindrada;

    public Moto(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    @Override
    public String getDetalle() {
        return "Cilindrada: " + cilindrada;
    }
    
}
