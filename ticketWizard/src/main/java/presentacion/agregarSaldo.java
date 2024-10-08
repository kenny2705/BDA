/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import negocio.Control;
import negocio.Sesion;

/**
 *
 * @author jorge
 */
public class agregarSaldo extends javax.swing.JFrame {
    
    

    private String correoUsuario;  // Correo o identificador del usuario
      // Constructor que recibe el correo del usuario

    public agregarSaldo() {
        initComponents();
         mostrarSaldo();
    }
    
    
   

    
     // Método para mostrar el saldo del usuario
    private void mostrarSaldo() {
        String correoUsuario = Sesion.getCorreoUsuario();  // Obtener el correo del usuario desde la sesión
        Control sql = new Control();
        double saldo = sql.consultarSaldo(correoUsuario);  // Consultar el saldo en la BD
        lblSaldo.setText("Saldo disponible: " + saldo);  // Mostrar saldo en la etiqueta
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtCantidadIngreso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setText("Agregar saldo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtCantidadIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadIngresoActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad a ingresar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantidadIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(372, 372, 372))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(230, 230, 230))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(btnAgregar)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadIngresoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        menu a = new menu();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
         // Obtener la cantidad ingresada por el usuario
        String cantidadTexto = txtCantidadIngreso.getText().trim();
        if (!cantidadTexto.isEmpty()) {
            try {
                // Validar que la entrada sea un número válido y convertirlo a double
                double cantidad = Double.parseDouble(cantidadTexto);
                if (cantidad < 0) {
                    lblSaldo.setText("La cantidad no puede ser negativa.");
                    return;
                }

                String correoUsuario = Sesion.getCorreoUsuario(); // Obtener el correo del usuario desde la sesión
                Control control = new Control();
                boolean exito = control.agregarSaldo(correoUsuario, cantidad);
                
                if (exito) {
                    lblSaldo.setText("Saldo agregado exitosamente. Nuevo saldo: " + (control.consultarSaldo(correoUsuario) + cantidad)); // Actualizar el saldo
                } else {
                    lblSaldo.setText("Error al agregar saldo.");
                }
            } catch (NumberFormatException ex) {
                lblSaldo.setText("Ingrese un valor numérico válido.");
            }
        } else {
            lblSaldo.setText("El campo no puede estar vacío.");
        }
        
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTextField txtCantidadIngreso;
    // End of variables declaration//GEN-END:variables
}
