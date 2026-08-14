import java.util.Scanner;  
public class OctalToHexadecimal { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Input a octal number : "); 
        String oct = in.next();         
        int dec = Integer.parseInt(oct, 8);         
System.out.println("Equivalent hexadecimal number: " + Integer.toHexString(dec).toUpperCase()); 
        in.close(); 
    } 
}