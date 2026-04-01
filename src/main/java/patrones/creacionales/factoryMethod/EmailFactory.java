package patrones.creacionales.factoryMethod;

public class EmailFactory extends NotificacionFactory {
    public Notificacion crearNotificacion() {
        return new Email();
    }
}
