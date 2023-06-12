/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model del restaurante
 */
package model;

import entity.Restaurante;

public class RestauranteModelImpl implements IRestauranteModel {

    @Override
    public Restaurante crearRegistro() {
        return new Restaurante();
    }

}
