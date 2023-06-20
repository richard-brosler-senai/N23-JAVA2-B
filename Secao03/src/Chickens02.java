public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
    	int qtdeOvos;
    	//Primeiro dia
    	qtdeOvos = 100;
    	//Segundo dia
    	qtdeOvos += 121;
    	//Teceiro dia
    	qtdeOvos += 117;
    	//Média diária
    	double dailyAverage = qtdeOvos / 3.0;
    	double monthlyAverage = dailyAverage * 30;
    	double monthlyProfit = monthlyAverage * 0.18;
    	
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
