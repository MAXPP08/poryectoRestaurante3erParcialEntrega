/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: Interfaz principal
 */
package view;

import controller.ElementoMenuController;
import controller.ReciboController;
import controller.RestauranteController;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import entity.Recibo;
import entity.Comida;
import entity.ElementoMenu;
import entity.Restaurante;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;

public class ComidaView extends javax.swing.JFrame {

    private RestauranteController controllerRestaurante;
    private Restaurante restaurante;
    private ReciboController controllerRecibo;
    private Recibo recibo;

    private ElementoMenuController controllerElementoMenu;
    private ElementoMenu elemento;

    public ComidaView() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);

        this.controllerRestaurante = new RestauranteController();
        this.restaurante = controllerRestaurante.crearRegistro();
        cargarDatos();

        this.controllerRecibo = new ReciboController();
        this.recibo = controllerRecibo.crearRegistro();

        this.controllerElementoMenu = new ElementoMenuController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        labelMariscos = new javax.swing.JLabel();
        labelBebidas = new javax.swing.JLabel();
        labelPostre = new javax.swing.JLabel();
        cmbComidasMariscos = new javax.swing.JComboBox<>();
        cmbComidas = new javax.swing.JComboBox<>();
        cmbComidasTacos = new javax.swing.JComboBox<>();
        cantidadComidasMariscos = new javax.swing.JSpinner();
        cantidadComidas = new javax.swing.JSpinner();
        cantidadComidasTacos = new javax.swing.JSpinner();
        btnAgregarComidaMariscos = new javax.swing.JButton();
        precioComidasTacos = new javax.swing.JLabel();
        precioComidasMariscos = new javax.swing.JLabel();
        precioComidas = new javax.swing.JLabel();
        btnAgregarComidaTacos = new javax.swing.JButton();
        btnAgregarComida = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblPrecioCantidadMariscos = new javax.swing.JLabel();
        lblPrecioCantidad = new javax.swing.JLabel();
        lblPrecioCantidadTacos = new javax.swing.JLabel();
        labelIconComida = new javax.swing.JLabel();
        labelIconBebida = new javax.swing.JLabel();
        labelIconPostre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/logoRestaurante.png"))); // NOI18N
        getContentPane().add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 6, -1, -1));

        labelMariscos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/mariscos.jpeg"))); // NOI18N
        getContentPane().add(labelMariscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 210, -1, -1));

        labelBebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/refrescos.jpg"))); // NOI18N
        getContentPane().add(labelBebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        labelPostre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/tarta.jpeg"))); // NOI18N
        getContentPane().add(labelPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        cmbComidasMariscos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbComidasMariscosItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbComidasMariscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 342, -1, -1));

        cmbComidas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbComidasItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbComidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        cmbComidasTacos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbComidasTacosItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbComidasTacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        cantidadComidasMariscos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(cantidadComidasMariscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 396, -1, -1));

        cantidadComidas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        cantidadComidas.setToolTipText("");
        getContentPane().add(cantidadComidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        cantidadComidasTacos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(cantidadComidasTacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, 20));

        btnAgregarComidaMariscos.setText("Agregar Orden");
        btnAgregarComidaMariscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaMariscosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarComidaMariscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 396, -1, -1));

        precioComidasTacos.setText("Precio");
        getContentPane().add(precioComidasTacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        precioComidasMariscos.setText("Precio");
        getContentPane().add(precioComidasMariscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 370, -1, -1));

        precioComidas.setText("Precio");
        getContentPane().add(precioComidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        btnAgregarComidaTacos.setText("Agregar Orden");
        btnAgregarComidaTacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaTacosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarComidaTacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        btnAgregarComida.setText("Agregar Orden");
        btnAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 403, -1, -1));

        btnContinuar.setText("Pagar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 425, -1, -1));

        lblPrecioCantidadMariscos.setText("0");
        getContentPane().add(lblPrecioCantidadMariscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 370, -1, -1));

        lblPrecioCantidad.setText("0");
        getContentPane().add(lblPrecioCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        lblPrecioCantidadTacos.setText("0");
        getContentPane().add(lblPrecioCantidadTacos, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 50, -1));

        labelIconComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/comida.png"))); // NOI18N
        getContentPane().add(labelIconComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        labelIconBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/bebida.png"))); // NOI18N
        getContentPane().add(labelIconBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        labelIconPostre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/postre.png"))); // NOI18N
        getContentPane().add(labelIconPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        jMenu1.setText("Usos");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/hogar.png"))); // NOI18N
        jMenuItem1.setText("Inicio");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/menu.png"))); // NOI18N
        jMenuItem2.setText("Menú");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cmbComidasMariscosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbComidasMariscosItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombrePlatillo = (String) cmbComidasMariscos.getSelectedItem();

            // Busca el platillo correspondiente en la lista de comidas
            Comida platilloSeleccionado = null;
            for (Comida comida : restaurante.getComidasMariscos()) {
                if (comida.getNombre().equals(nombrePlatillo)) {
                    platilloSeleccionado = comida;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (platilloSeleccionado != null) {
                double precio = platilloSeleccionado.getPrecio();
                lblPrecioCantidadMariscos.setText(String.valueOf(precio));
            }
        }

    }//GEN-LAST:event_cmbComidasMariscosItemStateChanged

    private void btnAgregarComidaMariscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaMariscosActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt
        (cantidadComidasMariscos.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;

            Double precioElemento;

            nombreElemento = cmbComidasMariscos.getSelectedItem().toString();

            precioElemento = Double.valueOf(lblPrecioCantidadMariscos.getText());

            elemento = controllerElementoMenu.crearRegistro();
            elemento.setCantidad(cantidadElemento);
            elemento.setNombre(nombreElemento);
            elemento.setPrecio(precioElemento);

            this.controllerRecibo.agregarElemento(recibo, elemento);

            JOptionPane.showMessageDialog(null,
                    "Pedido agregado");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Seleccione una cantidad");
        }
    }//GEN-LAST:event_btnAgregarComidaMariscosActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        new CuentaView(recibo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt
        (cantidadComidas.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;

            Double precioElemento;

            nombreElemento = cmbComidas.getSelectedItem().toString();

            precioElemento = Double.valueOf(lblPrecioCantidad.getText());

            elemento = controllerElementoMenu.crearRegistro();
            elemento.setCantidad(cantidadElemento);
            elemento.setNombre(nombreElemento);
            elemento.setPrecio(precioElemento);

            this.controllerRecibo.agregarElemento(recibo, elemento);

            JOptionPane.showMessageDialog(null,
                    "Pedido agregado");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Seleccione una cantidad");
        }
    }//GEN-LAST:event_btnAgregarComidaActionPerformed

    private void cmbComidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbComidasItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombrePlatillo = (String) cmbComidas.getSelectedItem();

            // Busca el platillo correspondiente en la lista de comidas
            Comida platilloSeleccionado = null;
            for (Comida comida : restaurante.getComidas()) {
                if (comida.getNombre().equals(nombrePlatillo)) {
                    platilloSeleccionado = comida;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (platilloSeleccionado != null) {
                double precio = platilloSeleccionado.getPrecio();
                lblPrecioCantidad.setText(String.valueOf(precio));
            }
        }
    }//GEN-LAST:event_cmbComidasItemStateChanged

    private void cmbComidasTacosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbComidasTacosItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombrePlatillo = (String) cmbComidasTacos.getSelectedItem();

            // Busca el platillo correspondiente en la lista de comidas
            Comida platilloSeleccionado = null;
            for (Comida comida : restaurante.getComidasTacos()) {
                if (comida.getNombre().equals(nombrePlatillo)) {
                    platilloSeleccionado = comida;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (platilloSeleccionado != null) {
                double precio = platilloSeleccionado.getPrecio();
                lblPrecioCantidadTacos.setText(String.valueOf(precio));
            }
        }
    }//GEN-LAST:event_cmbComidasTacosItemStateChanged

    private void btnAgregarComidaTacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaTacosActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt
        (cantidadComidasTacos.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;

            Double precioElemento;

            nombreElemento = cmbComidasTacos.getSelectedItem().toString();

            precioElemento = Double.valueOf(lblPrecioCantidadTacos.getText());

            elemento = controllerElementoMenu.crearRegistro();
            elemento.setCantidad(cantidadElemento);
            elemento.setNombre(nombreElemento);
            elemento.setPrecio(precioElemento);

            this.controllerRecibo.agregarElemento(recibo, elemento);

            JOptionPane.showMessageDialog(null,
                    "Pedido agregado");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Seleccione una cantidad");
        }
    }//GEN-LAST:event_btnAgregarComidaTacosActionPerformed

    public static void main(String args[]) {
        /**
         * Implementación de libreria jtattoo para el diseño de ventanas
         */
        try {
            UIManager.setLookAndFeel
            ("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {

        } catch (InstantiationException ex) {

        } catch (IllegalAccessException ex) {

        } catch (UnsupportedLookAndFeelException ex) {

        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComidaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComida;
    private javax.swing.JButton btnAgregarComidaMariscos;
    private javax.swing.JButton btnAgregarComidaTacos;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JSpinner cantidadComidas;
    private javax.swing.JSpinner cantidadComidasMariscos;
    private javax.swing.JSpinner cantidadComidasTacos;
    private javax.swing.JComboBox<String> cmbComidas;
    private javax.swing.JComboBox<String> cmbComidasMariscos;
    private javax.swing.JComboBox<String> cmbComidasTacos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel labelBebidas;
    private javax.swing.JLabel labelIconBebida;
    private javax.swing.JLabel labelIconComida;
    private javax.swing.JLabel labelIconPostre;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMariscos;
    private javax.swing.JLabel labelPostre;
    private javax.swing.JLabel lblPrecioCantidad;
    private javax.swing.JLabel lblPrecioCantidadMariscos;
    private javax.swing.JLabel lblPrecioCantidadTacos;
    private javax.swing.JLabel precioComidas;
    private javax.swing.JLabel precioComidasMariscos;
    private javax.swing.JLabel precioComidasTacos;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {

        for (Comida comida : restaurante.getComidasMariscos()) {
            cmbComidasMariscos.addItem(comida.getNombre());
            lblPrecioCantidadMariscos.setText(String.valueOf(comida.getPrecio()));
        }
        for (Comida comida1 : restaurante.getComidas()) {
            cmbComidas.addItem(comida1.getNombre());
            lblPrecioCantidad.setText(String.valueOf(comida1.getPrecio()));
        }

        for (Comida comida2 : restaurante.getComidasTacos()) {
            cmbComidasTacos.addItem(comida2.getNombre());
            lblPrecioCantidadTacos.setText(String.valueOf(comida2.getPrecio()));
        }
    }
}
