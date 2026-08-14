import java.util.Scanner; 
public class DecimalToBinary { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Input a Decimal Number: "); 
        int dec = in.nextInt();         
        System.out.println("Binary number is: " + Integer.toBinaryString(dec)); 
        in.close(); 
    } 
}