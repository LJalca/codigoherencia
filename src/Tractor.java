/**
 * Subclase que modela un tractor agrícola.
 * Hereda de MaquinariaAgricola e introduce potencia en HP y tracción.
 */
public class Tractor extends MaquinariaAgricola {
    private int potenciaHp;
    private boolean dobleTraccion;

    public Tractor(String codigo, String marca, double horasUso, int potenciaHp, boolean dobleTraccion) {
        super(codigo, marca, horasUso);
        if (potenciaHp <= 0) {
            throw new IllegalArgumentException("La potencia en HP debe ser mayor a cero.");
        }
        this.potenciaHp = potenciaHp;
        this.dobleTraccion = dobleTraccion;
    }

    public int getPotenciaHp() {
        return potenciaHp;
    }

    public boolean isDobleTraccion() {
        return dobleTraccion;
    }

    @Override
    public String obtenerFichaTecnica() {
        String traccionStr = dobleTraccion ? "4x4 (Doble Tracción)" : "4x2 (Simple)";
        return "[TRACTOR] " + super.obtenerFichaTecnica() + " | Potencia: " + potenciaHp + " HP | Tracción: " + traccionStr;
    }
}
