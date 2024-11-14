/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrartareas;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JToggleButton;

/**
 *
 * @author Juan Avila
 * 
 * Guarda los cambios hechos en una tarea y la agrega al listado de tareas  
 */
public class GuardarTarea extends JToggleButton
{       
    private  ArrayList<JToggleButton> listaTareasToggle = new ArrayList<>();       
    private static GuardarTarea guardarTarea;
    private int[] prioridad;

    private ArrayList<String> tituloTarea = new ArrayList<>(), 
        descripcionTarea = new ArrayList<>();
    
    
    private GuardarTarea(){}
    
    public static GuardarTarea getGuardarTarea()
    {                
        return (guardarTarea == null)?                
                guardarTarea = new GuardarTarea():
                guardarTarea;
    }

    public void nuevaTarea(String tituloTarea, 
            String descripcionTarea, int prioridad)
    {
        this.tituloTarea.add(tituloTarea);
        this.descripcionTarea.add(descripcionTarea);
        
        JToggleButton tarea = new JToggleButton(tituloTarea);
        tarea.setText(tituloTarea);
        tarea.setName(tituloTarea);
        Color[] backgroundColor = new Color[]{
            Color.red,
            Color.yellow, 
            Color.green
        };        
        if(prioridad != 0)
            tarea.setBackground(backgroundColor[prioridad - 1]);
        
        listaTareasToggle.add(tarea);       
    }
    
    public ArrayList<JToggleButton> recupararTareas(){        
        return listaTareasToggle;  
    }
    
    public void actualizarTareas(ArrayList<JToggleButton> tb)
    {
        listaTareasToggle = new ArrayList<>(tb);        
    }
}
