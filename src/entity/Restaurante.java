/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: Se crean las listas de contenido de los combo
 */
package entity;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Comida> comidasMariscos;
    private List<Comida> comidas;
    private List<Comida> comidasTacos;
    private List<Bebida> bebidas;
    private List<Postre> postres;

    public Restaurante(List<Comida> comidasMariscos, List<Comida> comidas,
            List<Comida> comidasTacos, List<Bebida> bebidas, 
            List<Postre> postres) {
        this.comidasMariscos = comidasMariscos;
        this.comidas = comidas;
        this.comidasTacos = comidasTacos;
        this.bebidas = bebidas;
        this.postres = postres;
    }

    public Restaurante() {
        bebidas = crearBebidas();
        comidasMariscos = crearComidasMariscos();
        comidas = crearComidas();
        comidasTacos = crearComidasTacos();
        postres = crearPostres();
    }

    public List<Comida> getComidasMariscos() {
        return comidasMariscos;
    }

    public void setComidasMariscos(List<Comida> comidasMariscos) {
        this.comidasMariscos = comidasMariscos;
    }
    
    public List<Comida> getComidasTacos() {
        return comidasTacos;
    }

    public void setComidasTacos(List<Comida> comidasTacos) {
        this.comidasTacos = comidasTacos;
    }
    
    public List<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(List<Comida> comidas) {
        this.comidas = comidas;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public List<Postre> getPostres() {
        return postres;
    }

    public void setPostres(List<Postre> postres) {
        this.postres = postres;
    }

    /**
     * Contenido del combo
     * @return 
     */
    private List<Comida> crearComidasMariscos() {
        comidasMariscos = new ArrayList<>();

        Comida comida1 = new Comida
        ("Camarones Empanizados", 9.99, 10);
        comidasMariscos.add(comida1);

        Comida comida2 = new Comida
        ("Pulpo a la Dabla", 12.99, 15);
        comidasMariscos.add(comida2);

        Comida comida3 = new Comida
        ("Filite al Ajo", 6.99, 5);
        comidasMariscos.add(comida3);

        return comidasMariscos;
    }
    
    /**
     * Contenido del combo
     * @return 
     */
    private List<Comida> crearComidas() {
        comidas = new ArrayList<>();

        Comida comida1 = new Comida
        ("Coca-Cola", 10.99, 10);
        comidas.add(comida1);

        Comida comida2 = new Comida
        ("Cerveza Corona", 8.99, 15);
        comidas.add(comida2);

        Comida comida3 = new Comida
        ("Agua de Jamaica", 9.99, 5);
        comidas.add(comida3);

        return comidas;
    }
    
    /**
     * Contenido del combo
     * @return 
     */
    private List<Comida> crearComidasTacos() {
        comidasTacos = new ArrayList<>();

        Comida comida1 = new Comida
        ("Pastel de 3 leches", 10.99, 10);
        comidasTacos.add(comida1);

        Comida comida2 = new Comida
        ("Tarta de Limón", 8.99, 15);
        comidasTacos.add(comida2);

        Comida comida3 = new Comida
        ("Galletas", 9.99, 5);
        comidasTacos.add(comida3);

        return comidasTacos;
    }

    /**
     * Contenido del combo
     * @return 
     */
    private List<Postre> crearPostres() {
        postres = new ArrayList<>();

        Postre postre1 = new Postre
        ("Pastel de Chocolate", 5.99, false);
        postres.add(postre1);

        Postre postre2 = new Postre
        ("Helado de Vainilla", 3.99, false);
        postres.add(postre2);

        Postre postre3 = new Postre
        ("Cheesecake de Fresa", 4.99, false);
        postres.add(postre3);

        return postres;
    }

    /**
     * Contenido del combo
     * @return 
     */
    private List<Bebida> crearBebidas() {
        bebidas = new ArrayList<>();

        Bebida bebida1 = new Bebida("Refresco", 20, "chico");
        bebidas.add(bebida1);

        Bebida bebida2 = new Bebida("Jugo", 30, "chico");
        bebidas.add(bebida2);

        Bebida bebida3 = new Bebida("Agua", 40, "chico");
        bebidas.add(bebida3);

        return bebidas;
    }

}
