import java.util.Scanner; 
public class DecimalToOctal { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Input a Decimal Number: "); 
        int dec = in.nextInt();          
        System.out.println("Octal number is: " + Integer.toOctalString(dec)); 
        in.close(); 
    } 
} 