package Clase3Reto2;

public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    //Constructor
    public Vuelo(String codigo, String destino, String horaSalida){
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    //Reservar asiento
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            System.out.println("Reserva realizada con éxito.");
            return true;
        }
        else {
            System.out.println("El asiento ya está reservado.");
            return false; 
        }
        }

        //Para crear pasajero dentro del método
        public boolean reservarAsiento(String nombre, String pasaporte) {
            Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
            return reservarAsiento(nuevoPasajero);
        }

        //Cancelar su reservación
        public void cancelarReserva() {
            if (asientoReservado != null){
                System.out.println("Cancelando reserva...");
                asientoReservado = null;
            } else{
                System.out.println("No hay reserva por cancelar.");   }
            }
        

        //Tabla información vuelo
        public String obtenerItinerario() {
            String info = "Itinerario del vuelo: /n";
            info += "Codigo: " + codigoVuelo + "/n";
            info += "Destino: " + destino + "/n";
            info += "Salida: " + horaSalida + "/n";
            info += "Pasajero: ";

             if (asientoReservado != null){
                info += asientoReservado.getNombre();
            } else{
                info += "[Sin reserva]";
             }
        
        return info;
        
    }


}
