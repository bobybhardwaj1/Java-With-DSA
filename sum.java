package corejava;
import java.util.*;
public class sum{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1 = scan.nextInt();
    System.out.println("Enter the second number");
    int num2 = scan.nextInt();
    int result = num1+num2;
    System.out.println("Sum of two number is:"+result);
    scan.close();
  }
}
