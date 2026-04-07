/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationandlogin;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class RegistrationAndLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner (System.in);
        
       System.out.print("Create a username");
       String username = input.nextLine();
       
       System.out.println("Create a password");
       String password = input.next();
       
       System.out.println("Enter a South African cellphone number");
       int cellphonenumber = input.nextInt();
    }
    
}
