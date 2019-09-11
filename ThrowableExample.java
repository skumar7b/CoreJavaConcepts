
import java.io.*; 
import java.util.properties;

class ThrowableExample 
{
public static void main(String[] args) throws Throwable {
  Properties pr = new Properties();
  FileInputStream fi = new FileInputStream("clogg.properties");
  stringToDouble("100.5");
}
  
  public static void sringToDouble(String s){
   double myd = 0.0;
   try{
     myd = Double.parseDouble(s);
     System.out.println("After converting String to double");
     
   }catch(Throwable t){
     System.out.println("this is the catch block");
   }
    System.out.println("This is the value of myd --"+myd);
  }
}
