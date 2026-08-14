import java.util.Scanner; 
public class DecimalToHexadecimal { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Input a Decimal Number: "); 
        int dec = in.nextInt();         
     System.out.println("Hexadecimal number is : " + Integer.toHexString(dec).toUpperCase()); 
        in.close(); 
    } 
} 