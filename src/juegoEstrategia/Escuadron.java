package juegoEstrategia;

import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona un grupo de guerreros y como funcionarian
 * @author Rodrigo
 * @version 1.0
 * @since 2026-04-10
 */
public class Escuadron {
    private String nombreEscuadron;
    private List<Guerrero> miembros;
    private int suministros;

    /**
     * Inicializa un escuadrón vacio con suministros para empezar
     * @param nombre El nombre de la unidad militar
     */
    public Escuadron(String nombre) {
        this.nombreEscuadron = nombre;
        this.miembros = new ArrayList<>();
        this.suministros = 100;
    }

    /**
     * Añade un nuevo guerrero al grupo
     * @param guerrero Objeto de tipo Guerrero que se une al escuadrón
     */
    public void reclutar(Guerrero guerrero) {
        miembros.add(guerrero);
    }

    /**
     * Calcula la potencia de fuego combinada de todos los miembros
     * @return Suma total del ataque de todos los guerreros
     */
    public double potenciaTotal() {
        double total = 0;
        for (Guerrero guerrero : miembros) {
            total += guerrero.calcularAtaque();
        }
        return total;
    }

    /**
     * Consume suministros para mantener a las tropas
     * @param cantidad Cantidad de suministros a consumir
     * @return true si había suficientes suministros, false si no habian
     */
    public boolean consumirSuministros(int cantidad) {
        if (this.suministros >= cantidad) {
            this.suministros -= cantidad;
            return true;
        }
        return false;
    }
    /**
     * Obtiene el nombre identificativo del escuadrón
     * @return El nombre del escuadrón
     */
    public String getNombreEscuadron() {
        return nombreEscuadron;
    }
}