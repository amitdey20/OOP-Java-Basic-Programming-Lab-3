import java.util.Scanner; 
public class HexadecimalToBinary { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter Hexadecimal Number : "); 
        String hex = in.next();         
        int dec = Integer.parseInt(hex, 16);         
        System.out.println("Binary Number is: " + Integer.toBinaryString(dec)); 
        in.close(); 
    } 
}
