import java.util.Scanner;  
public class BinaryToOctal { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        System.out.print("Input a binary number: "); 
        String bin = in.next();         
        int dec = Integer.parseInt(bin, 2);         
        System.out.println("Octal number: " + Integer.toOctalString(dec)); 
        in.close(); 
    } 
} 