import javax.swing.JOptionPane;

public class ShoppingCart01 {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName = "Alex";
        String itemDesc = "Camisa";
        
        // Assign the message variable 
        String message = custName + " quer comprar um(a) " + itemDesc;
        
        // Print and run the code
        System.out.println(message);
        // Mostrando Janela ao invés de console para mensagem
        JOptionPane.showMessageDialog(null, message);
    }
}
