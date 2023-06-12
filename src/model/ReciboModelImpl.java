/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model del recibo
 */
package model;

import entity.ElementoMenu;
import entity.Recibo;
import javax.swing.table.DefaultTableModel;

public class ReciboModelImpl implements IReciboModel {

    @Override
    public void agregarElemento(Recibo recibo, ElementoMenu elemento) {
        recibo.getElementos().add(elemento);
    }

    @Override
    public void imprimirRecibo(Recibo recibo, DefaultTableModel modelo) {

        modelo.setRowCount(0);
        for (ElementoMenu elemento : recibo.getElementos()) {
            Object[] fila = new Object[3];

            fila[0] = elemento.getNombre();
            fila[1] = elemento.getPrecioTotal();
            fila[2] = elemento.getCantidad();

            modelo.addRow(fila);
        }

    }

    @Override
    public Recibo crearRegistro() {
        return new Recibo();
    }

}
