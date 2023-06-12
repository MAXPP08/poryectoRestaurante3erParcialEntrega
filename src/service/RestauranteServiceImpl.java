/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: service de restaurante
 */
package service;

import entity.Restaurante;
import model.IRestauranteModel;
import model.RestauranteModelImpl;

public class RestauranteServiceImpl implements IRestaurenteService {

    // Union de model - service
    private IRestauranteModel model = new RestauranteModelImpl();

    @Override
    public Restaurante crearRegistro() {
        return model.crearRegistro();
    }

}
