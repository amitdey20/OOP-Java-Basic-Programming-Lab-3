import java.util.Scanner;
public class OctalToHexadecimal {
   public static void main(String[] args) {
     Scanner input=new Scanner(System.in) ;
     System.out.println("Input an Octal number:");
     String octal=input.next();
     int decimal = Integer.parseInt(octal, 8); 
     System.out.println("Hexadecimal number is:" +Integer.toHexString(decimal).toUpperCase());
 input.close();
  }    
}
