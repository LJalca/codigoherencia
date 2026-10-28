/**
 * Subclase que modela una cosechadora agrícola.
 * Hereda de MaquinariaAgricola e introduce capacidad de tolva y tipo de grano.
 */
public class Cosechadora extends MaquinariaAgricola {
    private double capacidadTolvaToneladas;
    private String tipoGranoPrincipal;

    public Cosechadora(String codigo, String marca, double horasUso, double capacidadTolvaToneladas, String tipoGranoPrincipal) {
        super(codigo, marca, horasUso);
        if (capacidadTolvaToneladas <= 0) {
            throw new IllegalArgumentException("La capacidad de tolva debe ser mayor a cero.");
        }
        if (tipoGranoPrincipal == null || tipoGranoPrincipal.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de grano principal no puede estar vacío.");
        }
        this.capacidadTolvaToneladas = capacidadTolvaToneladas;
        this.tipoGranoPrincipal = tipoGranoPrincipal.trim();
    }

    public double getCapacidadTolvaToneladas() {
        return capacidadTolvaToneladas;
    }

    public String getTipoGranoPrincipal() {
        return tipoGranoPrincipal;
    }

    @Override
    public String obtenerFichaTecnica() {
        return "[COSECHADORA] " + super.obtenerFichaTecnica() + " | Tolva: " + capacidadTolvaToneladas + " ton | Grano: " + tipoGranoPrincipal;
    }
}
