/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: service de la bebida
 */
package service;

import entity.Bebida;
import java.util.List;
import model.BebidaModelImpl;
import model.IBebidaModel;

public class BebidaServiceImpl implements IBebidaService {

    IBebidaModel model = new BebidaModelImpl();

    //El método crea una bebida
    @Override
    public void crearRegistro(List<Bebida> lista, Bebida bebida) {
        model.crearRegistro(lista, bebida);
    }

    //El método elimina una bebida
    @Override
    public void eliminarRegistro(List<Bebida> lista, String nombre) {
        model.eliminarRegistro(lista, nombre);
    }

    //El método actualiza una bebida
    @Override
    public void actualizarRegistro(List<Bebida> lista, Bebida bebida) {
        model.actualizarRegistro(lista, bebida);
    }

    //El método muestra una bebida
    @Override
    public Bebida obtenerRegistro(List<Bebida> lista, int id) {
        return model.obtenerRegistro(lista, id);
    }

}
