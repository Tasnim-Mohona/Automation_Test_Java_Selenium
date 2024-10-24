package LambdaExpression;


interface SumCalculator {
    int sum(int a, int b);
}

public class SumOfIntegers {
    public static void main(String[] args){

        // Method Reference SumCalculator sumCalculator = Integer::sum;
        SumCalculator sumCalculator = (x, y) -> x + y;

        int result = sumCalculator.sum(7,9);
        System.out.println(result);
    }
}
