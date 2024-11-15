/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrartareas;

import java.awt.Dimension;
import java.time.Duration;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JToggleButton;

/**
 *
 * @author Juan Avila
 */
public class FrameTareas extends javax.swing.JFrame 
{          
    private ArrayList<JToggleButton> listaTareasToggle = 
                new ArrayList<JToggleButton>();
    private GuardarTarea guardarTarea = GuardarTarea.getGuardarTarea();
   
    /**
     * Creates new form Tareas
     */
    public FrameTareas() {
        initComponents();
       updatePanel();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        botonEleminarTarea = new javax.swing.JButton();
        botonCrearTarea1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

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

        jToggleButton1.setText("Tarea#1");
        jToggleButton1.setAlignmentY(0.0F);
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Tarea#2");
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jToggleButton3.setText("Tarea#3");
        jToggleButton3.setBorderPainted(false);
        jToggleButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jToggleButton4.setText("Tarea#4");
        jToggleButton4.setActionCommand("Tarea#1");
        jToggleButton4.setBorderPainted(false);
        jToggleButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jToggleButton2)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton3)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton4)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jToggleButton1)
                    .addContainerGap(137, Short.MAX_VALUE)))
        );

        jToggleButton1.getAccessibleContext().setAccessibleName("Tarea_1");
        jToggleButton2.getAccessibleContext().setAccessibleName("Tarea_2");
        jToggleButton2.getAccessibleContext().setAccessibleDescription("");
        jToggleButton3.getAccessibleContext().setAccessibleName("Tarea_3");
        jToggleButton4.getAccessibleContext().setAccessibleName("Tarea_4");

        jButton1.setText("       ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonEleminarTarea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(botonCrearTarea1)))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(jButton1))
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
        boolean b = false;
        int t = 0; 
        for(int i = 0; i < listaTareasToggle.size(); i++)
        {
            if(listaTareasToggle.get(i).isSelected())
            {               
               t= i;
               b = true;
               listaTareasToggle.get(i).setSelected(false);
               listaTareasToggle.get(i).setVisible(true);
               //guardarTarea.actualizarTareas(listaTareasToggle);
               break;
            }            
        }     
        if(!b) 
            crearTarea.enable();
        else
            crearTarea.enable(t);            
        
        updatePanel();
    }//GEN-LAST:event_botonCrearTarea1ActionPerformed

    private void botonEleminarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEleminarTareaActionPerformed
        EliminarTarea eliminarTarea = EliminarTarea.getEliminarTarea(listaTareasToggle);
        for(int i = 0; i < listaTareasToggle.size(); i++)
        {
            if(listaTareasToggle.get(i).isSelected())
            {
               listaTareasToggle.get(i).setSelected(false);
               eliminarTarea.eliminarById(i);               
               listaTareasToggle.get(i).setVisible(false);
               break;
            }            
        }
        guardarTarea.actualizarTareas(listaTareasToggle);
        updatePanel();
        
    }//GEN-LAST:event_botonEleminarTareaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
                        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        updatePanel();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        ArrayList<JToggleButton> temp = new ArrayList<JToggleButton>(guardarTarea.recupararTareas());
        if(listaTareasToggle.size() == 0)
        {
            listaTareasToggle.add(jToggleButton1);
            listaTareasToggle.add(jToggleButton2);
            listaTareasToggle.add(jToggleButton3);
            listaTareasToggle.add(jToggleButton4);           
        }
        
        for (int i= 0; i < listaTareasToggle.size(); i++){

           listaTareasToggle.get(i).setVisible(false);
        }
        for (int i= 0; i < temp.size(); i++)
            {   
                listaTareasToggle.get(i).setVisible(true);
                listaTareasToggle.get(i).setBackground(guardarTarea.getBackground(guardarTarea.getPrioridad(i)));
                listaTareasToggle.get(i).setText(
                   guardarTarea.getTitulo(i)
                );           
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonCrearTarea1;
    private javax.swing.JButton botonEleminarTarea;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JToggleButton jToggleButton2;
    public javax.swing.JToggleButton jToggleButton3;
    public javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
     
}
