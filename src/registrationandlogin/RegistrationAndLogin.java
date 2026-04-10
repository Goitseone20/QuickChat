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
class Login{
    String UserName;
    String Password;
    String Cellphone;
    
     
    boolean checkUserName(String UserName){
        if (UserName.length()==5 && UserName.contains("_")){
            System.out.println("UserName successfully captured");
            return true;
        
        }
        
        else{
            System.out.println("UserName is not correctly formatted");
            return false;
            
        }
    }
    boolean checkPassword(){
      if (Password.length()==8 && Password.contains(".*[A-Z].") && Password.contains("\\d") && Password.contains(".[!@#$%^&*].")){
            System.out.println("Password successfully captured ");
           return true; 
        }
        else{
            System.out.println("Password is not correctly formatted");
            return false;
        }
        
    }
    boolean checkCellphone(String Cellphone){
        if(Cellphone.length()==10 && Cellphone.contains(".[*//(+27\\d(9)")){
          System.out.println("Cellphone number successfully added");
          return true;
        }
        else{
            System.out.println("Cellphone number incorrectly formatted or does not contain intenational code");
            return false;
        }
    }
    static void registration(){
        Scanner input= new Scanner(System.in);
        
    }
     
        
    }



       
    
public class RegistrationAndLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
      
    
}
}
