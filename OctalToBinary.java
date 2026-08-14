import java.util.Scanner;  
public class OctalToBinary { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Input any octal number: "); 
        String oct = in.next();          
        int dec = Integer.parseInt(oct, 8);         
        System.out.println("Binary number is: " + Integer.toBinaryString(dec)); 
        in.close(); 
    } 
}
