
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;  
public class Main
{
    public static void binary(int num,String str, int i){
         
         if(i >= num ){
             System.out.println(str);
             return;
         }
          i++;
          binery( num,  str+'0', i);
          binery( num,  str+'1', i);
          
         
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int num = sc.nextInt();  
         
sc.close();  
 
String str =  "";
int i = 0;
 binary( num,  str,i);

    }
}
