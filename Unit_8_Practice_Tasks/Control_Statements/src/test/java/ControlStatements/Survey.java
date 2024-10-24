package ControlStatements;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Survey {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 9, 2, 0);
        List<Integer> numbers1 = new ArrayList<>(numbers);
        numbers1.remove(Integer.valueOf(3));

        for (int number : numbers1) {
            System.out.println(number);

        }
        try {
            AMethod();
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());

        }
    }


    public static void validate (int number){

        if(number< 0){
            throw new RuntimeException("Number cannot be less than 0");
        }
    }

    public static void AMethod() throws FileNotFoundException {
        FileReader in1 = new FileReader("input.txt");
    }
//
//    public void AMethod() {
//        try {
//            FileReader in1 = new FileReader("input.txt");
//        }
//        catch (
//                FileNotFoundException e) {
//            System.err.println("Error fetching file" + e.getMessage());
//        }


    }





