/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: service interface de postre
 */
package service;

import entity.Postre;
import java.util.List;

public interface IPostreService {

    // crea un registro
    public void crearRegistro(List<Postre> lista, Postre postre);

    // elimina un registro
    public void eliminarRegistro(List<Postre> lista, String nombre);

    // actualiza un registro
    public void actualizarRegistro(List<Postre> lista, Postre postre);

    // obtiene un registro
    public Postre obtenerRegistro(List<Postre> lista, int id);
}
