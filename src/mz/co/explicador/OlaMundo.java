
package mz.co.explicador;

import javax.swing.JOptionPane;

/**
 *
 * @author joseseie
 */
public class OlaMundo {
    
    // Exercício: Mostrar olá mundo de 3 formas diferentes.
    
    public static void main(String[] args) {
        
        System.out.println("Olá Mundo!!");
        
        olaMundo3();
        
    }
    
    
    public static void olaMundo3 () {
        
        System.err.println("Olá Mundo 03!!");
        
    }
    
    
    public static void olaMundo2 () {
        
        JOptionPane.showMessageDialog(null, "Olá Mundo");
        
    }
    
}
