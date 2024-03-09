public class SolicitudReparacion implements Comparable<SolicitudReparacion> {
    private int id;
    private String descripcion;
    private int prioridad;

    public SolicitudReparacion(int id, String descripcion, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(SolicitudReparacion otraSolicitud) {
        return Integer.compare(otraSolicitud.prioridad, this.prioridad);
    }


    public String getDescripcion() {
        return descripcion;
    }

}
