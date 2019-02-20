package exercice.Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Exercice2 {

    public static void main(String[] args) throws IOException {

        System.out.println("EXERCICE 2 - STRING BUILDER");
        StringBuilder [] sbTab ;
        sbTab = new StringBuilder[10];
        for (int i =0; i < sbTab.length; i++ ){
            sbTab[i]= new StringBuilder("Hello");
            System.out.println("=====> "+sbTab[i]);
        }

        System.out.println("EXERCICE 2 - STRING BUFFER\n");
        //readFile("C:\\Users\\steph\\Desktop\\ESGI\\3ème Année 2018-2019\\Java\\src\\src\\exercice\\truc.txt");
        readFileEmail("C:\\Users\\steph\\Desktop\\ESGI\\3ème Année 2018-2019\\Java\\src\\src\\exercice\\truc.txt", "truc.machin@myges.fr");
    }

    public static void readFile(String path) throws IOException {

        Instant start = Instant.now();
        int sum = 0;
        ArrayList<String> arrayList;
        arrayList = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        while(bufferedReader.readLine() != null){
            String[] st = bufferedReader.readLine().split(":");
            arrayList.add(st[1]);
        }
        for (String str: arrayList){

            int value = Integer.parseInt(str);
            sum += value;
        }
        System.out.println("SUM => "+(sum / arrayList.size()));

        Duration duration = Duration.between(start, Instant.now());
        int nano = duration.getNano();
        long durMs = TimeUnit.MILLISECONDS.convert(nano, TimeUnit.NANOSECONDS);
        System.out.println("RUN TIME MS : " +durMs);
    }

    public static void readFileEmail(String path, String email) throws IOException {
        Instant start = Instant.now();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Boolean b = false;
        int counter = 0;
        while(bufferedReader.readLine() != null || b == true){
            String [] strings = bufferedReader.readLine().split(":");
            if(strings[0].equals(email)){
                System.out.println("\nNOTE : " + strings[1]);
                counter ++;
                break;
            }
        }
        if(counter == 0){
            System.out.println("RESULT NOT FOUND");
        }
        Duration duration = Duration.between(start, Instant.now());
        int nano = duration.getNano();
        long millis = TimeUnit.MILLISECONDS.convert(nano, TimeUnit.NANOSECONDS);
        System.out.println("RUN TIME MS : " + millis);
        bufferedReader.close();
    }

}
