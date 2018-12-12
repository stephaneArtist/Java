package exercice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class exercice3 {

    public static void main(String[] args) {

        System.out.println("================= EXERCICE 3 - RUNTIME EXCEPTION =================\n");
        String[] strings={"45687543"};
        ArrayList<Exception> exceptions = calculetteSum(strings);

        for(Exception excpt: exceptions){
            System.out.println(excpt.getMessage());
        }
    }

    public static ArrayList<Exception> calculetteSum(String[] strings){

        int val = 0;
        int sum = 0;
        int tmp = 0;
        ArrayList<Exception> exceptions;
        exceptions = new ArrayList<Exception>();

        for(int i = 0; i < strings.length; i++){
            String string = strings[i];
            for(int j = 0; j < string.length(); j++){
                String st = string.substring(j, j+1);
                try{
                    val = Integer.parseInt(st);
                    sum += val;
                }catch (Exception exception){

                    if(sum > 0){
                        exceptions.add(new Exception(exception));
                        tmp = 1;

                    }else{
                        exceptions.add(new Exception(exception));
                        tmp = -1;
                    }
                }
            }
        }

        if(tmp == -1){
            System.out.println("FUNCTION IS WRONG...");
        }else if (tmp == 1){
            System.out.println("\nFUNCTION IS WRONG... BUT THE SUM WAS CALCULETED FOR THE FOINDED NUMBER IN THE STRING OF CHARACTERS");
            System.out.println("SUM : " + sum);
        }else{
            System.out.println("NO ERROR ☺");
            System.out.println("SUM : " + sum);
        }
        return exceptions;
    }
}
