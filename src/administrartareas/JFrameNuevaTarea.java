/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrartareas;
import javax.swing.JTextPane;
/**
 *
 * @author Juan Avila
 */
public class JFrameNuevaTarea extends javax.swing.JFrame
{    
    private FrameTareas frameTareas = new FrameTareas();
    private GuardarTarea guardarTarea = GuardarTarea.getGuardarTarea();
    private boolean actualizar = false;
    /**
     * Creates new form JFrameTarea
     */
    public JFrameNuevaTarea() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextDescripcion = new javax.swing.JScrollPane();
        jTextPane = new javax.swing.JTextPane();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabelTitulo.setText("Nueva tarea");

        jTextTitulo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jTextTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTituloActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.setActionCommand("botonGuardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextDescripcion.setToolTipText("dfsd");

        jTextPane.setToolTipText("");
        jTextDescripcion.setViewportView(jTextPane);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prioridad", "Alta", "Media", "Baja" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextTitulo)
                    .addComponent(jTextDescripcion))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTituloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CrearTarea crearTarea = CrearTarea.getCrearTarea(frameTareas);
        JTextPane descripcionTarea = null;
        descripcionTarea = (JTextPane) jTextDescripcion.getViewport().getView();        
        if(jTextDescripcion.getViewport().getView() 
                instanceof JTextPane && !actualizar) 
        {          
            guardarTarea.nuevaTarea(jTextTitulo.getText(), jTextPane.getText(), 
                    jComboBox1.getSelectedIndex());
        }
        else if(actualizar)
        {
            actualizar = false;
            guardarTarea.setTitulo(guardarTarea.getIndex(), jTextTitulo.getText());
            guardarTarea.setDescripcion(guardarTarea.getIndex(), jTextPane.getText());
            guardarTarea.setPrioridad(guardarTarea.getIndex(), jComboBox1.getSelectedIndex());            
        }
        jTextTitulo.setText("");
        jTextPane.setText("");
        jComboBox1.setSelectedIndex(0);
        crearTarea.disable();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void traer(int i){
        actualizar = true; 
        guardarTarea.setIndex(i);
        jTextTitulo.setText(guardarTarea.getTitulo(i));
        jTextPane.setText(guardarTarea.getDescripcion(i));
        jComboBox1.setSelectedIndex(guardarTarea.getPrioridad(i));
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jTextDescripcion;
    private javax.swing.JTextPane jTextPane;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables

}
