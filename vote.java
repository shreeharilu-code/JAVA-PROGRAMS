import java.util.Scanner;
public class vote{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a>=18)
      System.out.println("major an deligible to vote");
    else
      System.out.println("minor and not eligible to vote");
    
  }
}
    
  