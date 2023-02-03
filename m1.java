import java.util.Scanner;

public class m1 {
    public static int avg(int a, int b, int c){

        return (a+b+c)/3;

    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();

        int b = scn.nextInt();

        int c = scn.nextInt();

        System.out.print(avg(a, b, c));

    }
}