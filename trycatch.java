import java.util.Scanner;
class trycatch{
  public static void main(String[]args){
  Scanner s=new Scanner(System.in);
  try
  {
String a=s.next();
int a1=Integer.parseInt(a);
  }
  catch(ArithmeticException e){
    System.out.println("zero division error");
  }
  catch(NumberFormatException e){
    System.out.println("number format error");
  }
}
}