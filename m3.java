import java.util.Scanner;

public class m3{

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();

        System.out.print(middle(s));

    }
    public static String middle(String s){

        if(s.length() % 2 == 0){

            return s.substring(s.length()/2, s.length()/2 + 2);

        }else{

            return s.substring(s.length()/2, s.length()/2 + 1);

        }

    }

}