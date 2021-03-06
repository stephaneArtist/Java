package esgi;

import java.util.Scanner;

public class MainDice {

    public static void main(String[] args) {

        System.out.println("Parti B");
        esgi.Dice dice = new esgi.Dice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of throws :");
        int iteration = Integer.parseInt(sc.next());

        for(int i = 1 ; i < iteration+1 ; i++){

            dice.launch();
            System.out.println(" Game" +i+ " ");
            System.out.println("Result = "+dice.getValue());
        }

        System.out.println();

        System.out.println("Parti C");

        esgi.Dice diceO = new esgi.Dice();
        esgi.Dice diceT = new esgi.Dice();

        sc = new Scanner(System.in);
        System.out.println("Please enter the number of throws :");
        iteration = Integer.parseInt(sc.next());

        for (int i = 1 ; i < iteration + 1 ; i++){

            diceO.launch();
            diceT.launch();
            System.out.println(" Game " +i+ " ");
            System.out.println("Result Dic 1 = "+diceO.getValue()+"| Result Dic 2 = "+diceT.getValue());

            if(diceO.getValue() == diceT.getValue()){

                System.out.println("You have won");
            }
        }

    }

}
