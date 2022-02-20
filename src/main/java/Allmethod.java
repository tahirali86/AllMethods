import java.util.Scanner;

public class Allmethod {

    public static void main(String args[]){

        long EvenOdd= EvenOdd(6);
        System.out.println(EvenOdd);
        AtoZ();
        Concatinate();
    }

    static long EvenOdd(int n) {
        int num;
        System.out.println("Enter an Integer number:");

        //The input provided by user is stored in num
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        //abc
        /* If number is divisible by 2 then it's an even number
         * else odd number*/
        if ( num % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
        return 0;
    }



    static void AtoZ() {


        char c;

        for(c = 'A'; c <= 'Z'; ++c)
            System.out.print(c + " ");
    }
    static void Concatinate() {
        String s1="Tahir";
        String s2="Ali";
        String s3=s1.concat(s2);
        System.out.println(s3);

    }


}

