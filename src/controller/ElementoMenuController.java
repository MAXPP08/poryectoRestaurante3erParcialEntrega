/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: controller de los elementos
 */
package controller;

import entity.ElementoMenu;
import service.ElementoMenuServiceImpl;
import service.IElementoMenuService;

public class ElementoMenuController {

    // Unimos el servicio y controller
    private IElementoMenuService service = new ElementoMenuServiceImpl();

    //El método crea un Registro
    public ElementoMenu crearRegistro() {
        return service.crearRegistro();
    }
}
