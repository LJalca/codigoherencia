# Proyecto de Código: Herencia y Reutilización en Java (POO - Sesión 09)

## Descripción
Demostración de jerarquía de herencia orientada a objetos aplicada a la gestión de maquinaria agrícola:
- **`MaquinariaAgricola.java`**: Superclase base con atributos protegidos (`protected`) e invariantes de estado.
- **`Tractor.java`**: Subclase con atributos propios (potencia HP y tracción) y llamada a constructor `super(...)`.
- **`Cosechadora.java`**: Subclase con atributos propios (capacidad de tolva) y método `@Override`.
- **`Main.java`**: Punto de entrada demostrativo con salida concisa en consola.

## Compilación y Ejecución

```powershell
# 1. Compilar clases al directorio bin
javac -d bin src/*.java

# 2. Ejecutar la clase principal
java -cp bin Main
```
