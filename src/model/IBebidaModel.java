/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model interface del la bebida
 */
package model;

import entity.Bebida;
import java.util.List;

public interface IBebidaModel {

    // El Método que crea un tipo de bebida
    public void crearRegistro(List<Bebida> lista, Bebida bebida);

    // El Método que elimina un tipo de bebida
    public void eliminarRegistro(List<Bebida> lista, String nombre);

    // El Método que actualiza un tipo de bebida
    public void actualizarRegistro(List<Bebida> lista, Bebida bebida);

    // El Método que muestra un tipo de bebida
    public Bebida obtenerRegistro(List<Bebida> lista, int id);
}
