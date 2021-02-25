// Program for a calculator
import java.util.Scanner;
public class Loops{
  public static void main(){
    double num1,num2,result;//Decalaring variables
    char operator;
    result=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Two Numbers");
    num1=sc.nextDouble();
    num2=sc.nextDouble();
    sc.nextLine();//Use to clear buffer
    System.out.println("Enter the operator");
    String tmp=sc.nextLine();
    operator= tmp.charAt(0);
    //Switch Statements
    switch(operator){
      case'+': result= num1+num2;
      System.out.println("Your Answer:"+result); break; 
      case'-': result=num1-num2;
      System.out.println("Your Answer:"+result); break;
      case'*': result=num1*num2;
      System.out.println("Your Answer:"+result); break;
      case'/': result=num1/num2;
      System.out.println("Your Answer:"+result); break;
      case'%': result=num1%num2;
      System.out.println("Your Answer:"+result); break;
      default: System.out.println("Invalid Operator");
    }
  }
}