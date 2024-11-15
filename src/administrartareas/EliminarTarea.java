/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrartareas;

import java.util.ArrayList;
import javax.swing.JToggleButton;

/**
 *
 * @author Juan Avila
 */
public class EliminarTarea 
{
    private ArrayList<JToggleButton> tb;
    private GuardarTarea guardarTarea = GuardarTarea.getGuardarTarea();
    
    private static EliminarTarea eliminarTarea;
    
    private EliminarTarea(ArrayList<JToggleButton> tb)
    {
        this.tb = new ArrayList<JToggleButton>(tb);
    }
    
    public static EliminarTarea getEliminarTarea(ArrayList<JToggleButton> tb)
    {
        return (eliminarTarea == null) ? 
                eliminarTarea = new EliminarTarea(tb):
                eliminarTarea;
    }
    public void eliminarById(int i){
        tb.remove(i);
        tb.sort(null);
        guardarTarea.actualizarTareas(tb);
    }
}
