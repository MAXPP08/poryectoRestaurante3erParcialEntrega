/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model interface del la comida
 */
package model;

import entity.Comida;
import java.util.List;

public interface IComidaModel {

    // El Método que crea un tipo de comida
    public void crearRegistro(List<Comida> lista, Comida comida);

    // El Método que elimina un tipo de comida
    public void eliminarRegistro(List<Comida> lista, String nombre);

    // El Método que actualiza un tipo de comida
    public void actualizarRegistro(List<Comida> lista, Comida comida);

    // El Método que muestra un tipo de comida
    public Comida obtenerRegistro(List<Comida> lista, int id);

}
