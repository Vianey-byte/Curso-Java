package Clase3Reto2;

public class Pasajero{
    private String nombre;
    private String pasaporte;

    //Constructor para crear un pasajero
    public Pasajero(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    //Para la info del pasajero
    public String getNombre(){
        return nombre;
    }

    public String getPasaporte(){
        return pasaporte;
    }
}