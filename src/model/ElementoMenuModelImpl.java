/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model del elementoModel
 */
package model;

import entity.ElementoMenu;

public class ElementoMenuModelImpl implements IElementoMenuModel{
    @Override
    public ElementoMenu crearRegistro(){
        return new ElementoMenu();
    }
}
