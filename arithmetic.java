import java.util.Scanner;
public class arithmetic {

  public static void main(String[] args) {
  
   int sum1;
   int sum2;
   int diff;
   int prod;
   int result1;
   int result2;
   int result3;
   
   Scanner N = new Scanner(System.in);
   
   System.out.print("");
   sum1 = N.nextInt();
   
   System.out.print("");
   sum2 = N.nextInt();
   
   System.out.print("");  
   prod = N.nextInt();
   
   System.out.print("");
   diff = N.nextInt();
   
   result1 = sum1 + sum2;
   result2 = result1 * prod;
   result3 = result2 - diff;
   
   System.out.print("");
   System.out.println(sum1 + " + " + sum2 + " * " + prod + " - " + diff + " = ");
   System.out.println(result1 + "*" + prod + " - " + diff + " = ");
   System.out.println(result2 + " - " + diff + " = " + result3); 
  
   
  }
}
