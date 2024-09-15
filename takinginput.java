package corejava;
import java.util.*;
public class takinginput{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the name");
    String name = scan.nextLine();
    System.out.println(name);
    System.out.println("Enter the first number");
    int num = scan.nextInt();
    System.out.println(num);
    scan.close();
  }
}