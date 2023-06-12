/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model interface del postre
 */
package model;

import entity.Postre;
import java.util.List;

public interface IPostreModel {

    // El Método que crea un tipo de postre
    public void crearRegistro(List<Postre> lista, Postre postre);

    // El Método que elimina un tipo de postre
    public void eliminarRegistro(List<Postre> lista, String nombre);

    // El Método que actualiza un tipo de postre
    public void actualizarRegistro(List<Postre> lista, Postre postre);

    // El Método que muestra un tipo de postre
    public Postre obtenerRegistro(List<Postre> lista, int id);
}
