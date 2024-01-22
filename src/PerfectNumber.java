import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the numebr");
        int number=sc.nextInt();
       if( isPerfectNumber(number)){
           System.out.println(number+"is perfect number");
       }
       else{
           System.out.println(number+"is not a perfect number");

       }

    }
    static boolean isPerfectNumber(int number)
    {
        int sum=0;
        if(number<=0)
        {
            return  false;
        }
        for (int i = 1; i <number ; i++) {
            if(number%i==0)
            {
                sum+=i;
            }
        }
        return sum==number;
    }
}