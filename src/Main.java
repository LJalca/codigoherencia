/**
 * Demostración de herencia, llamada a super() y sobreescritura de métodos.
 */
public class Main {
    public static void main(String[] args) {
        Tractor tractor = new Tractor("TRAC-01", "John Deere", 120.5, 140, true);
        Cosechadora cosechadora = new Cosechadora("COSE-02", "Case IH", 85.0, 6.5, "Maíz");

        tractor.registrarHoras(5.5);
        cosechadora.registrarHoras(4.0);

        System.out.println(tractor.obtenerFichaTecnica());
        System.out.println(cosechadora.obtenerFichaTecnica());
    }
}
