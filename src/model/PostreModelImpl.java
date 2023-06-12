/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model del postre
 */
package model;

import entity.Postre;
import java.util.List;

public class PostreModelImpl implements IPostreModel {

    /**
     * El método crea una postre
     *
     * @param lista
     * @param postre
     */
    @Override
    public void crearRegistro(List<Postre> lista, Postre postre) {
        lista.add(postre);
    }

    /**
     * El método elimina una postre
     *
     * @param lista
     * @param nombre
     */
    @Override
    public void eliminarRegistro(List<Postre> lista, String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo
            (nombre) == 0) {
                lista.remove(i);
                break;
            }
        }
    }

    /**
     * El método actualiza una postre
     *
     * @param lista
     * @param postre
     */
    @Override
    public void actualizarRegistro(List<Postre> lista, Postre postre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo
            (postre.getNombre()) == 0) {
                lista.set(i, postre);
                break;
            }
        }
    }

    /**
     * El método elimina una postre
     *
     * @param lista
     * @param modelo
     */
    @Override
    public Postre obtenerRegistro(List<Postre> lista, int id) {

        return lista.get(id);

    }

}
