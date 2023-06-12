/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: service interface de la bebida
 */
package service;

import entity.Bebida;
import java.util.List;

public interface IBebidaService {

    // crea un registro
    public void crearRegistro(List<Bebida> lista, Bebida bebida);

    // elimina un registro
    public void eliminarRegistro(List<Bebida> lista, String nombre);

    // actualiza un registro
    public void actualizarRegistro(List<Bebida> lista, Bebida bebida);

    // obtiene un registro
    public Bebida obtenerRegistro(List<Bebida> lista, int id);
}
