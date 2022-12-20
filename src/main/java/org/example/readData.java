package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readData {
    public void readFile() {
        Scanner scan = null;
        try {
            File myObj = new File("../data/WorldCupGoals.csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if( data != null){
                    String tokens[] = data.split(",");
                }
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


