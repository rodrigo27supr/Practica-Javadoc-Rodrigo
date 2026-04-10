package juegoEstrategia;

/**
 * Clase principal para probar el funcionamiento del sistema de guerreros y escuadrones.
 * @author Rodrigo
 * @version 1.0
 * @since 2026-04-10
 */
public class Main {

    /**
     * Método de entrada al programa
     */
    public static void main(String[] args) {
        // Crear guerreros
        Guerrero g1 = new Guerrero("Aragorn", 150.0);
        Guerrero g2 = new Guerrero("Legolas", 120.0);

        // Probar lógica de niveles y excepciones
        try {
            System.out.println(g1.getNombre() + " sube de nivel...");
            g1.subirNivel(250); // Debería subir 2 niveles
        } catch (IllegalArgumentException e) {
            System.err.println("Error al subir nivel: " + e.getMessage());
        }

        // Crear escuadrón y reclutar
        Escuadron miEscuadron = new Escuadron("Compañía del Anillo");
        miEscuadron.reclutar(g1);
        miEscuadron.reclutar(g2);

        // Mostrar resultados
        System.out.println("Escuadrón: " + miEscuadron.getNombreEscuadron());
        System.out.println("Potencia de ataque total: " + miEscuadron.potenciaTotal());

        // Probar suministros
        boolean exito = miEscuadron.consumirSuministros(30);
        System.out.println("Suministros consumidos?: " + (exito ? "Sí" : "No"));

        // Probar método deprecated
        System.out.println("Daño básico (antiguo): " + g1.golpeBasico());
    }
}