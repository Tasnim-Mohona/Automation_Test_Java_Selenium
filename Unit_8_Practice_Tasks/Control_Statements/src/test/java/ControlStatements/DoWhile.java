package ControlStatements;

public class DoWhile {

    public static void main(String[] args) {
        // // do {
        //    // Code to be executed
        ////  } while (condition);

        int i = 0;

        do {
            System.out.println(i);
            i++;
        }
        while(i < 1);

        //// while (condition) {
       // //    // Code to be executed
        // //}
//        int j = 0;
//        while(j < 3){
//            System.out.println(j);
//            j++;
//        }

//  //The break statement is used to exit a loop or switch statement
//  //before it has completed all its iterations.

        int k = 0;
        while (k < 10) {
            if (k == 5) {
                break;
            }// exits loop when i = 0
            System.out.println(k);
            i++;
        }

        // continue

        for (int l = 0; l < 5; l++) {
            if (l == 2) {
                continue;  // skip the rest of the loop for i == 2
            }
            System.out.println(i);
        }
    }
}
