import java.util.Scanner; 
public class HexadecimalToDecimal { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Input a hexadecimal number: "); 
        String hex = in.next();          
        int dec = Integer.parseInt(hex, 16);          
        System.out.println("Equivalent decimal number is: " + dec); 
        in.close(); 
    } 
} 