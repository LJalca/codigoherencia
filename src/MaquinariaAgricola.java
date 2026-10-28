/**
 * Superclase base que modela una maquinaria agrícola genérica.
 * Demuestra herencia, atributos protegidos y validación de invariantes.
 */
public class MaquinariaAgricola {
    protected String codigo;
    protected String marca;
    protected double horasUso;

    public MaquinariaAgricola(String codigo, String marca, double horasUso) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede ser nulo ni vacío.");
        }
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede ser nula ni vacía.");
        }
        if (horasUso < 0) {
            throw new IllegalArgumentException("Las horas de uso no pueden ser negativas.");
        }
        this.codigo = codigo.trim().toUpperCase();
        this.marca = marca.trim();
        this.horasUso = horasUso;
    }

    public void registrarHoras(double horasAdicionales) {
        if (horasAdicionales <= 0) {
            throw new IllegalArgumentException("Las horas a registrar deben ser mayores a cero.");
        }
        this.horasUso += horasAdicionales;
    }

    public String obtenerFichaTecnica() {
        return "Código: " + codigo + " | Marca: " + marca + " | Horas de Uso: " + horasUso + " h";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public double getHorasUso() {
        return horasUso;
    }
}
