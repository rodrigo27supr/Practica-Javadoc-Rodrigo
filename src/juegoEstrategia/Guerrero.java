package juegoEstrategia;

/**
 * En esta clase representamos un guerrero en un campo de batalla ficticio
 * Gestionamos sus estadísticas y su capacidad de combate
 * @author Rodrigo
 * @version 1.0
 * @since 2026-04-10
 */
public class Guerrero {
    private String nombre;
    private int nivel;
    private double salud;

    /**
     * Crea un nuevo guerrero con valores iniciales
     * @param nombre El nombre del guerrero
     * @param salud La cantidad de puntos de vida
     */
    public Guerrero(String nombre, double salud) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = 1;
    }

    /**
     * Incrementa la experiencia y el nivel del guerrero
     * @param puntos Son los puntos de experiencia a sumar
     * @return El nuevo nivel alcanzado por el guerrero
     * @throws IllegalArgumentException Si los puntos de experiencia son negativos
     */
    public int subirNivel(int puntos) throws IllegalArgumentException {
        if (puntos < 0) {
            throw new IllegalArgumentException("La experiencia no puede ser negativa.");
        }
        this.nivel += (puntos / 100);
        return this.nivel;
    }

    /**
     * Calcula el daño en base a el nivel actual
     * @return El valor del daño de ataque como double
     */
    public double calcularAtaque() {
        return 10.5 * nivel;
    }

    /**
     * Versión antigua del sistema de daño
     * @deprecated Sustituido por calcularAtaque() para que el juego sea ms justo
     * @return Un valor entero fijo de daño
     */
    @Deprecated
    public int golpeBasico() {
        return 10;
    }

    /**
     * Obtiene el nombre del guerrero
     * @return El nombre del guerrero como String
     */
    public String getNombre() {
        return nombre;
    }
}