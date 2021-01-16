import java.util.*;
public class EvenOdd {
public static void main(String[] args) {
    System.out.println("enter the number");
 Scanner sc = new Scanner(System.in);
 int a = sc.nextInt();
 sc.close();
 
  if (a%2 == 0)
  {
   System.out.println("number is even" );
   

 }
 else 
 {
    System.out.println("number is odd");

 }    
}

}