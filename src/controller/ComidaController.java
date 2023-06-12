/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: controller de la comida
 */
package controller;

import entity.Comida;
import java.util.List;
import service.ComidaServiceImpl;
import service.IComidaService;

public class ComidaController {

    // Unimos el servicio y controller
    IComidaService service = new ComidaServiceImpl();

    //El método crea una comida
    public void crearRegistro(List<Comida> lista, Comida comida) {
        service.crearRegistro(lista, comida);
    }

    //El método elimina un comida
    public void eliminarRegistro(List<Comida> lista, String nombre) {
        service.eliminarRegistro(lista, nombre);
    }

    //El método actualiza una comida
    public void actualizarRegistro(List<Comida> lista, Comida comida) {
        service.actualizarRegistro(lista, comida);
    }

    //El método muestra una comida
    public Comida obtenerRegistro(List<Comida> lista, int id) {
        return service.obtenerRegistro(lista, id);
    }
}
