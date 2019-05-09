package esgi_heritage;

import java.util.Arrays;
import java.util.Comparator;
import java.lang.*;

public class Exercice3 {
    public static void main(String[] args){
        
        Building[] array = new Building[4];
        array[0] = new Villa(3, false, "CCC", "massy", 50);
        array[1] = new Company("Sananes CORP", 100, 52, "Test", "Paris", 500);
        array[2] = new Villa(5, true, "AAA", "Paris", 105);
        array[2] = new Villa(10, true, "BBB", "Paris", 200);
        
        int i;
        int swim = 0;
        double totalArea = 0.0;
        double tax = 0.0;
        
        for (i = 0; i < array.length; i++) {
            totalArea += array[i].getSurface();
            tax += array[i].tax();

            if (array[i] instanceof Villa && ((Villa) array[i]).isSwimmingPool())
                swim++;
        }
        
        System.out.println("La surface totale est de " + totalArea);
        System.out.println("L'impot total est de " + tax);
        System.out.println("Le nombre de piscines est de " + swim);
        
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        Arrays.sort(array);
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        Comparator<Building> compt = (b1, b2) -> {
            String ownerNameA = b1.getOwner();
            String ownerNameB = b2.getOwner();
            return ownerNameA.compareTo(ownerNameB);
        };
        
        Arrays.sort(array, compt);
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}