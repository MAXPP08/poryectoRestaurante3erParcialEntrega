/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: controller del postre
 */
package controller;

import entity.Postre;
import java.util.List;
import service.IPostreService;
import service.PostreServiceImpl;

public class PostreController {

    IPostreService service = new PostreServiceImpl();

    //El método crea un Postre
    public void crearRegistro(List<Postre> lista, Postre postre) {
        service.crearRegistro(lista, postre);
    }

    //El método elimina un Postre
    public void eliminarRegistro(List<Postre> lista, String nombre) {
        service.eliminarRegistro(lista, nombre);
    }

    //El método actualiza un Postre
    public void actualizarRegistro(List<Postre> lista, Postre postre) {
        service.actualizarRegistro(lista, postre);
    }

    //El método muestra un Postre
    public Postre obtenerRegistro(List<Postre> lista, int id) {
        return service.obtenerRegistro(lista, id);
    }
}
