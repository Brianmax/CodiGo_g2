package Tutorias.sistemaVehiculos.modelos;

import java.util.ArrayList;
import java.util.List;

public class VehicleRegistry {
    List<Vehicle> listVehicles;
    List<Usuario> usuarios;

    public VehicleRegistry(List<Vehicle> listVehicles) {
        this.listVehicles = listVehicles;
    }

    public boolean registerVehicle(int id, Vehicle vehicle){
        // verificamos si existe el usuario
        for(Usuario usuario: this.usuarios){
            if(usuario.getId() == id){
                this.listVehicles.add(vehicle);
                return true;
            }
        }
        return false;
    }
    public void showVehicles(){
        for(Vehicle vehicle: this.listVehicles){
            vehicle.showDetails();
        }
    }
    public void showVehiclesByBrand(String registrationNumber){
        for(Vehicle vehicle: this.listVehicles){
            if(vehicle.getRegistrationNumber().equals(registrationNumber)){
                vehicle.showDetails();
            }
        }
    }
    public boolean addUsers(Usuario usuario){
        this.usuarios.add(usuario);
        return true;
    }
}
