/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrartareas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import administrartareas.JFrameNuevaTarea;

/**
 *
 * @author Juan Avila
 * 
 * Se activa el panel para crear una nuevas tarea
 */
public class CrearTarea extends JToggleButton
{
    private static JFrame jFrameCrearTarea = new JFrameNuevaTarea();
    private final JFrame jFrameTareas;
    private static CrearTarea crearTarea;
    
    private CrearTarea(JFrame jFrameTarea)
    {   
        this.jFrameTareas = jFrameTarea;        
    }
    
    public static CrearTarea getCrearTarea(JFrame jFrameTarea)
    {          
        return (crearTarea == null) ? 
                crearTarea = new CrearTarea(jFrameTarea) : crearTarea;
    }
    
    @Override
    public void enable()
    {  
       jFrameCrearTarea.setVisible(true);
       //jFrameTareas.setVisible(false);
    }
    
    @Override
    public void disable() 
    {
        jFrameCrearTarea.setEnabled(false);
        jFrameTareas.setVisible(true);
    }    
}