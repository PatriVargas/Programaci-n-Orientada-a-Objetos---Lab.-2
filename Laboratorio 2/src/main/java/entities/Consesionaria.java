package entities;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Consesionaria {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = cargarVehiculos();

        imprimirVehiculos(vehiculos);
        imprimirVehiculoMasCaro(vehiculos);
        imprimirVehiculoMasBarato(vehiculos);
        imprimirVehiculoConLetraEnModelo(vehiculos, 'Y');
        imprimirVehiculosOrdenadosPorPrecio(vehiculos);
        imprimirVehiculosOrdenadosPorMarcaModeloPrecio(vehiculos);
    }

    private static List<Vehiculo> cargarVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Peugeot", "206", 4, 200000));
        vehiculos.add(new Moto("Honda", "Titan", "125c", 60000));
        vehiculos.add(new Auto("Peugeot", "208", 5, 250000));
        vehiculos.add(new Moto("Yamaha", "YBR", "160c", 80500.50));
        return vehiculos;
    }

    private static void imprimirVehiculos(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
        System.out.println("=============================");
    }

    private static void imprimirVehiculoMasCaro(List<Vehiculo> vehiculos) {
        Vehiculo masCaro = Collections.max(vehiculos);
        System.out.println("Vehículo más caro: " + masCaro.getMarca() + " " + masCaro.getModelo());
    }

    private static void imprimirVehiculoMasBarato(List<Vehiculo> vehiculos) {
        Vehiculo masBarato = Collections.min(vehiculos);
        System.out.println("Vehículo más barato: " + masBarato.getMarca() + " " + masBarato.getModelo());
    }

    private static void imprimirVehiculoConLetraEnModelo(List<Vehiculo> vehiculos, char letra) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getModelo().contains(Character.toString(letra))) {
                System.out.println("Vehículo que contiene en el modelo la letra '" + letra + "': " + vehiculo.getMarca() +
                        " " + vehiculo.getModelo() + " " + vehiculo.getPrecio());
                break;
            }
        }
        System.out.println("=============================");
    }

    private static void imprimirVehiculosOrdenadosPorPrecio(List<Vehiculo> vehiculos) {
        Collections.sort(vehiculos);
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
        }
        System.out.println("=============================");
    }

    private static void imprimirVehiculosOrdenadosPorMarcaModeloPrecio(List<Vehiculo> vehiculos) {
        vehiculos.sort((v1, v2) -> {
            int comparacionMarca = v1.getMarca().compareTo(v2.getMarca());
            if (comparacionMarca != 0) {
                return comparacionMarca;
            } else {
                int comparacionModelo = v1.getModelo().compareTo(v2.getModelo());
                if (comparacionModelo != 0) {
                    return comparacionModelo;
                } else {
                    return Double.compare(v1.getPrecio(), v2.getPrecio());
                }
            }
        });

        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}

