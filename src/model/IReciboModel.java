/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model interface del recibo
 */
package model;

import entity.ElementoMenu;
import entity.Recibo;
import javax.swing.table.DefaultTableModel;

public interface IReciboModel {

    public void agregarElemento(Recibo recibo, ElementoMenu elemento);

    public void imprimirRecibo(Recibo recibo, DefaultTableModel modelo);

    public Recibo crearRegistro();

}
