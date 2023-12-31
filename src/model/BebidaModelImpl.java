/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model de la bebida
 */
package model;

import entity.Bebida;
import java.util.List;

public class BebidaModelImpl implements IBebidaModel {

    /**
     * El método crea una comida
     *
     * @param lista
     * @param bebida
     */
    @Override
    public void crearRegistro(List<Bebida> lista, Bebida bebida) {
        lista.add(bebida);
    }

    /**
     * El método elimina una bebida
     *
     * @param lista
     * @param nombre
     */
    @Override
    public void eliminarRegistro(List<Bebida> lista, String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo
        (nombre) == 0) {
                lista.remove(i);
                break;
            }
        }
    }

    /**
     * El método actualiza una bebida
     *
     * @param lista
     * @param bebida
     */
    @Override
    public void actualizarRegistro(List<Bebida> lista, Bebida bebida) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo
        (bebida.getNombre()) == 0) {
                lista.set(i, bebida);
                break;
            }
        }
    }

    /**
     * El método obtiene un registro
     *
     * @param lista
     * @param modelo
     */
    @Override
    public Bebida obtenerRegistro(List<Bebida> lista, int id) {
        return lista.get(id);
    }

}
