package patrones.creacionales.factoryMethod;

public class SMSFactory extends NotificacionFactory {
    public Notificacion crearNotificacion() {
        return new SMS();
    }
}
