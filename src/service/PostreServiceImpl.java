/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: service de postre
 */
package service;

import entity.Postre;
import java.util.List;
import model.IPostreModel;
import model.PostreModelImpl;

public class PostreServiceImpl implements IPostreService {

    // se une model con service
    IPostreModel model = new PostreModelImpl();

    //El método crea un postre
    @Override
    public void crearRegistro(List<Postre> lista, Postre postre) {
        model.crearRegistro(lista, postre);
    }

    //El método elimina un postre
    @Override
    public void eliminarRegistro(List<Postre> lista, String nombre) {
        model.eliminarRegistro(lista, nombre);
    }

    //El método actualiza un postre
    @Override
    public void actualizarRegistro(List<Postre> lista, Postre postre) {
        model.actualizarRegistro(lista, postre);
    }

    //El método muestra una postre
    @Override
    public Postre obtenerRegistro(List<Postre> lista, int id) {
        return model.obtenerRegistro(lista, id);
    }

}
