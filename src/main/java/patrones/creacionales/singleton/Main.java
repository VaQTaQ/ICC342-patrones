package patrones.creacionales.singleton;


// El logger solo se inicializa una vez, aunque lo llamemos varias veces.
// Ambas variables apuntan a la misma instancia.
public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Primer mensaje");

        Logger logger2 = Logger.getInstance();
        logger2.log("Segundo mensaje");

        if (logger1 == logger2) {
            System.out.println("Es la misma instancia");
        } else {
            System.out.println("Son diferentes instancias");
        }
    }
}
