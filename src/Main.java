import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter values a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = Operaters.add(a, b);
        System.out.println(add);
        int minus = Operaters.minus(a, b);
        System.out.println(minus);
             Multiplication tables=new Multiplication();
             tables.tables(9);





    }
}

class Operaters {
    static int add(int a, int b) {
        return a + b;

    }

    static int minus(int a, int b) {
        return a - b;

    }

    static int mul(int a, int b) {
        return a * b;

    }

    static int div(int a, int b) {
        return a / b;

    }

    static int modules(int a, int b) {
        return a % b;
    }


}