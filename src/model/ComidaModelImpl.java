/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model de la comida
 */
package model;

import entity.Comida;
import java.util.List;

public class ComidaModelImpl implements IComidaModel {

    /**
     * El método crea una comida
     *
     * @param lista
     * @param comida
     */
    @Override
    public void crearRegistro(List<Comida> lista, Comida comida) {
        lista.add(comida);
    }

    /**
     * El método elimina una comida
     *
     * @param lista
     * @param nombre
     */
    @Override
    public void eliminarRegistro(List<Comida> lista, String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo
        (nombre) == 0) {
                lista.remove(i);
                break;
            }
        }
    }

    /**
     * El método actualiza una comida
     *
     * @param lista
     * @param comida
     */
    @Override
    public void actualizarRegistro(List<Comida> lista, Comida comida) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo
        (comida.getNombre()) == 0) {
                lista.set(i, comida);
                break;
            }
        }
    }

    /**
     * El método elimina una comida
     *
     * @param lista
     * @param modelo
     */
    @Override
    public Comida obtenerRegistro(List<Comida> lista, int id) {
        return lista.get(id);
    }

}
