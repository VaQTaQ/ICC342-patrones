package patrones.creacionales.factoryMethod;

public class Email implements Notificacion {
    public void enviar() {
        System.out.println("Enviando email");
    }
}
