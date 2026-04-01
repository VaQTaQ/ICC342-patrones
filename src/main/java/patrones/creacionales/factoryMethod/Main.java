package patrones.creacionales.factoryMethod;

public class Main {
    public static void main(String[] args) {

        NotificacionFactory factory;

        factory = new EmailFactory();
        Notificacion n1 = factory.crearNotificacion();
        n1.enviar();

        factory = new SMSFactory();
        Notificacion n2 = factory.crearNotificacion();
        n2.enviar();
    }
}
