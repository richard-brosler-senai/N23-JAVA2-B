public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Camisa";
        String message = custName+" quer "
        		+ "comprar um(a) "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 65.50;
        double tax = 1.07; //7%
        int quantity = 3;
        
        // Declare and assign a calculated totalPrice
        double totalPrice = quantity * price * tax;
        
        // Modify message to include quantity 
        message = custName + " quer \" comprar " + quantity + " " + 
        			itemDesc + "(s)";
        
        System.out.println(message);
        
        // Print another message with the total cost
        message = "O custo total com o imposto é $ " + totalPrice;
        
        int num1 = 55555;
        long num2 = 66666;
        long num3;
        num3 = num1 * num2;
    }    
}
