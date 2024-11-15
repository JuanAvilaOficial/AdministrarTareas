/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrartareas;
import java.awt.Color;
import java.awt.List;
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
    private int[] prioridad = new int[5];
    private int index;

    private ArrayList<String> tituloTarea = new ArrayList<String>(), 
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
        setPrioridad(getIndex(), prioridad);
        
        JToggleButton tarea = new JToggleButton(tituloTarea);
        tarea.setText(tituloTarea);
        tarea.setName(tituloTarea);
        
        if(prioridad != 0)
            tarea.setBackground(getBackground(prioridad - 1));
        
        tarea.setVisible(true);        
        listaTareasToggle.add(tarea);       
    }
    public Color getBackground(int i){
        Color[] backgroundColor = new Color[]{
            Color.GRAY,
            Color.red,
            Color.yellow, 
            Color.green
        };        
        return backgroundColor[i];
    }
    public String getTitulo(int i){
        return this.tituloTarea.get(i);
    }
    public void setTitulo(int i, String titulo){
        this.tituloTarea.set(i, titulo);
    }
    public String getDescripcion(int i){
        return this.descripcionTarea.get(i);
    }
    public void setDescripcion(int i, String descripcion){
        this.descripcionTarea.set(i, descripcion);
    }
    
    public int getPrioridad(int i){
        return this.prioridad[i];
    }
    public void setPrioridad( int index, int t){        
        this.prioridad[index] = t;        
    }
    
    public int getIndex(){
        return this.index;
    }
    public void setIndex(int  i){
        this.index = i;
    }
    public ArrayList<JToggleButton> recupararTareas(){        
        return listaTareasToggle;  
    }
    
 
    public void actualizarTareas(ArrayList<JToggleButton> tb)
    {
        listaTareasToggle = new ArrayList<JToggleButton>(tb);        
    }
}
