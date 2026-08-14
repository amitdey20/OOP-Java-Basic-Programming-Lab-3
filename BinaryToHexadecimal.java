import java.util.Scanner; 
public class BinaryToHexadecimal { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Input a binary number: "); 
        String bin = in.next();         
        int dec = Integer.parseInt(bin, 2);          
        System.out.println("HexaDecimal value: " + Integer.toHexString(dec).toUpperCase()); 
        in.close(); 
    } 
} 