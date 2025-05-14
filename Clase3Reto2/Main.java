package Clase3Reto2;

public class Main {
    public static void main(String[] args){

        //Crear pasajero
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "P12345");

        //Crear un vuelo
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

        //Reservar asiento
        vuelo1.reservarAsiento(pasajero1);

        //Mostrar itinerario
        System.out.println(vuelo1.obtenerItinerario());

        //Cancelar reserva
        vuelo1.cancelarReserva();

        //Mostrar itinerario nuevamente
        System.out.println(vuelo1.obtenerItinerario());

        //Reservar asiento usando nombre y pasaporte
        vuelo1.reservarAsiento("Mario Gonzalez", "P54321");

        //Mostrar itinerario
        System.out.println(vuelo1.obtenerItinerario());
        
    }

    
}
