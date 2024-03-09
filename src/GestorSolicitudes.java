import java.util.PriorityQueue;

public class GestorSolicitudes {
    private PriorityQueue<SolicitudReparacion> colaSolicitudes;

    public GestorSolicitudes() {
        colaSolicitudes = new PriorityQueue<>();
    }

    public void agregarSolicitud(SolicitudReparacion solicitud) {
        colaSolicitudes.offer(solicitud);
    }

    public SolicitudReparacion asignarSolicitud() {
        return colaSolicitudes.poll();
    }


}
