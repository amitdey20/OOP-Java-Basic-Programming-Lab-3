import java.util.Scanner; 
public class BinaryAddition { 
public static void main(String[] args) { 
    Scanner in = new Scanner(System.in); 
    System.out.print("Input first binary number: "); 
    String b1 = in.next(); 
    System.out.print("Input second binary number: "); 
    String b2 = in.next(); 
    int n1 = Integer.parseInt(b1, 2); 
    int n2 = Integer.parseInt(b2, 2);         
    System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(n1 + n2)); 
    in.close(); 
    } 
} 