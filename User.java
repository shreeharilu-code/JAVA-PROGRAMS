import java.util.Scanner;
public class User{
  
  public static void main(String[] args) { 
    String name,dept;
    int m1,m2,m3,m4,m5,rollno,tot;
    Scanner s=new Scanner(System.in);
    {
    name=s.next();
    dept=s.next();
    rollno=s.nextInt();
    m1=s.nextInt();
    m2=s.nextInt();
    m3=s.nextInt();
    m4=s.nextInt();
    m5=s.nextInt();
    }
    tot=m1+m2+m3+m4+m5;
    System.out.println("enter your name:"+name);
    System.out.println("enter your dept:"+dept);
    System.out.println("enter your rollno:"+rollno);
    System.out.println("enter your m1:"+m1);
    System.out.println("enter your m2:"+m2);
    System.out.println("enter your m3:"+m3);
    System.out.println("enter your m4:"+m4);
    System.out.println("enter your m5:"+m5);
    System.out.println("enter your tot:"+tot);
  }
  
  
}
