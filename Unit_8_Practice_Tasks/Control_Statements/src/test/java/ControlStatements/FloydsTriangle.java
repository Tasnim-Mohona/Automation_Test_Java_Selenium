package ControlStatements;

public class FloydsTriangle {
    public static void main(String[] args)
    {
        int numberOfRows = 5;
        int number = 1;
        for (int row = 1; row <= numberOfRows; row++)
        {
            for (int column = 1; column <= row; column++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
