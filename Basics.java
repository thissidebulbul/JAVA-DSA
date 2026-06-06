import java.util.Scanner;

public class Basics {

    public static void main(String[]args){
        //This is my first program prints hello world
       // System.out.println("hello world");
       // now we use variable, datatypes and input method 
      /*  Scanner sc = new Scanner(System.in);
       System.out.println("what is your name :");
       String name = sc.nextLine();
       System.out.println("what is your age :");
       int age = sc.nextInt();
       sc.nextLine();
       System.out.println("what you are learning:");
       String skill = sc.nextLine();*/
       // this program shows swapping of two numbers
       int x = 20, y = 30;
       System.out.println("before swapping x :" + x + "y:" + y);
       int temp = y;
       y = x;
       x = temp;
       System.out.println("after swapping x :" + x + "and y :" + y);
    }
}