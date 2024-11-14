/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrartareas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JToggleButton;

/**
 *
 * @author Juan Avila
 */
public class FrameTareas extends javax.swing.JFrame 
{      
    GuardarTarea guardarTarea = GuardarTarea.getGuardarTarea();
    ArrayList<JToggleButton> listaTareasToggle = new ArrayList<>();

    /**
     * Creates new form Tareas
     */
    public FrameTareas() {
        initComponents();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        botonEleminarTarea = new javax.swing.JButton();
        botonCrearTarea1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        Titulo.setText("Lista de tareas");

        botonEleminarTarea.setText("Eliminar tarea");
        botonEleminarTarea.setActionCommand("botonEliminar");
        botonEleminarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEleminarTareaActionPerformed(evt);
            }
        });

        botonCrearTarea1.setText("Crear Tarea");
        botonCrearTarea1.setActionCommand("botonCrear");
        botonCrearTarea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearTarea1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(102, 51, 255));
        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonEleminarTarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(botonCrearTarea1)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEleminarTarea)
                    .addComponent(botonCrearTarea1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearTarea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearTarea1ActionPerformed
        // TODO add your handling code here:        
        CrearTarea crearTarea = CrearTarea.getCrearTarea(this);
        crearTarea.enable();
    }//GEN-LAST:event_botonCrearTarea1ActionPerformed

    private void botonEleminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEleminarTareaActionPerformed
        // TODO add your handling code here:
        EliminarTarea eliminarTarea = 
                EliminarTarea.getEliminarTarea(listaTareasToggle);
        for(JToggleButton tb : listaTareasToggle)
            //eliminarTarea.eliminarById(0);
        updatePanel();
    }//GEN-LAST:event_botonEleminarTareaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FrameTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrameTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrameTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch(javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrameTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run() {
                new FrameTareas().setVisible(true);                
            }
        });
    }    
    public void updatePanel(){
        jPanel1.removeAll();
        listaTareasToggle = new ArrayList<>(
            guardarTarea.recupararTareas()
        );
        
        for(JToggleButton tb: listaTareasToggle)
        {
            System.out.println("df");
            tb.setPreferredSize(new Dimension(300, 150));
            tb.setVisible(true);
            jPanel1.add(tb);
            
        }
        jPanel1.revalidate(); // Actualiza el layout del panel
        jPanel1.repaint(); // Redibuja el panel para mostrar los cambios
        jPanel1.setBackground(Color.GREEN);
        System.out.println("aaa");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonCrearTarea1;
    private javax.swing.JButton botonEleminarTarea;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
     
}
