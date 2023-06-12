/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: service de un elemento del menu
 */
package service;

import entity.ElementoMenu;
import model.ElementoMenuModelImpl;
import model.IElementoMenuModel;

public class ElementoMenuServiceImpl implements IElementoMenuService{
    
    private IElementoMenuModel model = new ElementoMenuModelImpl();
    /**
     * Método que regresa la creación del registro
     * @return 
     */
    @Override
    public ElementoMenu crearRegistro(){
      return model.crearRegistro();
    }
}
