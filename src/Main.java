public class Main {
    public static void main(String[] args) {
        GestorSolicitudes gestor = new GestorSolicitudes();

        gestor.agregarSolicitud(new SolicitudReparacion(1, "Pantalla rota", 3));
        gestor.agregarSolicitud(new SolicitudReparacion(2, "Teclado no funciona", 2));
        gestor.agregarSolicitud(new SolicitudReparacion(3, "Disco duro falla", 1));


        SolicitudReparacion solicitudAsignada = gestor.asignarSolicitud();
        System.out.println("Solicitud asignada: " + solicitudAsignada.getDescripcion());
    }
}
