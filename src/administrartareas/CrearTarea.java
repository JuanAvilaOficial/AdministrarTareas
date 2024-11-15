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
    private static JFrameNuevaTarea jFrameCrearTarea = new JFrameNuevaTarea();
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
       this.jFrameCrearTarea.setVisible(true);
       //this.jFrameTareas.setVisible(false);
    }
    public void enable(int i)
    {  
       this.jFrameCrearTarea.setVisible(true);
       this.jFrameCrearTarea.traer(i);
       //this.jFrameTareas.setVisible(false);
    }
    
    
    @Override
    public void disable() 
    {
        
        this.jFrameCrearTarea.setVisible(false);
        this.jFrameTareas.setVisible(true);
    }    
}