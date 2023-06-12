/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: service de la comida
 */
package service;

import entity.Comida;
import java.util.List;
import model.ComidaModelImpl;
import model.IComidaModel;

public class ComidaServiceImpl implements IComidaService {

    IComidaModel model = new ComidaModelImpl();

    //El método crea una comida
    @Override
    public void crearRegistro(List<Comida> lista, Comida comida) {
        model.crearRegistro(lista, comida);
    }

    //El método elimina una comida
    @Override
    public void eliminarRegistro(List<Comida> lista, String nombre) {
        model.eliminarRegistro(lista, nombre);
    }

    //El método actualiza una comida
    @Override
    public void actualizarRegistro(List<Comida> lista, Comida comida) {
        model.actualizarRegistro(lista, comida);
    }

    //El método muestra una comida
    @Override
    public Comida obtenerRegistro(List<Comida> lista, int id) {
        return model.obtenerRegistro(lista, id);
    }

}
