public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        //int eggsPerChicken = 5, chickenCount = 3, totalEggs;
        int eggsPerChicken = 4, chickenCount = 8, totalEggs;
        //eggsPerChicken = ovos por galinha
        //chickenCount = quantidade de galinhas
        //totalEggs = total de ovos
        
        //primeiro dia (segunda-feira)
        totalEggs = eggsPerChicken * chickenCount;
        //segundo dia (ganha 1 galinha e depois multiplica para acumular)
        totalEggs += eggsPerChicken * ++chickenCount;
        //terceiro dia (animal come metade das galinhas pela manhã)
        totalEggs += eggsPerChicken * ( chickenCount / 2);
        System.out.println(totalEggs);
    }   
}
