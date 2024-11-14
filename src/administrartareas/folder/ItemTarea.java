/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrartareas;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
/**
 *
 * @author Juan Avila
 */
public class ItemTarea extends JToggleButton
{
    private String titulo, preView;
    private boolean estado = false;
    private static ItemTarea itemTarea;
    
    private ItemTarea(String titulo, String preView)
    {
        this.titulo = titulo;
        this.preView = preView;
    }    
    
    public static ItemTarea getItemTarea(String titulo, String preView)
    {
        return (itemTarea == null) ? 
                itemTarea = new ItemTarea(titulo, preView) : itemTarea;
    }    
    
    
}
