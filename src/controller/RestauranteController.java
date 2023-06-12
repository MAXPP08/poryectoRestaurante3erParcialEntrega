/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: controller de la creación de registros
 */
package controller;

import entity.Restaurante;
import service.IRestaurenteService;
import service.RestauranteServiceImpl;

public class RestauranteController {

    private IRestaurenteService service = new RestauranteServiceImpl();

    //El método crea un Registro
    public Restaurante crearRegistro() {
        return service.crearRegistro();
    }
}
