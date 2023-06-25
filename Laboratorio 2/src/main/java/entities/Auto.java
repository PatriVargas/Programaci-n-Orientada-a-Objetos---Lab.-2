package entities;

class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public String getDetalle() {
        return "Puertas: " + puertas;
    }
}
