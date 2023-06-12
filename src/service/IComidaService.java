/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: service interface de la comida
 */
package service;

import entity.Comida;
import java.util.List;

public interface IComidaService {

    // crea un registro
    public void crearRegistro(List<Comida> lista, Comida comida);

    // elimina un registro
    public void eliminarRegistro(List<Comida> lista, String nombre);

    // actualiza un registro
    public void actualizarRegistro(List<Comida> lista, Comida comida);

    // obtiene un registro
    public Comida obtenerRegistro(List<Comida> lista, int id);
}
