/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: entity del recibo
 */
package entity;

import java.util.ArrayList;
import java.util.List;

public class Recibo {

    private List<ElementoMenu> elementos;

    public Recibo() {
        this.elementos = new ArrayList<>();
    }

    public List<ElementoMenu> getElementos() {
        return elementos;
    }

}
