package Tutorias.sistemaVehiculos.modelos;

public class Car extends Vehicle{
    byte capacity;
    String fuelType;
    public Car(String brand, String model, String year, String registrationNumber, byte capacity, String fuelType) {
        super(brand, model, year, registrationNumber);
        this.capacity = capacity;
        this.fuelType = fuelType;
    }
    @Override
    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Año: " + this.year);
        System.out.println("Número de registro: " + this.registrationNumber);
        System.out.println("Capacidad: " + this.capacity);
        System.out.println("Tipo de combustible: " + this.fuelType);
    }

    public byte getCapacity() {
        return capacity;
    }

    public void setCapacity(byte capacity) {
        this.capacity = capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
