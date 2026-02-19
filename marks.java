import java.util.Scanner;
class student{
    int rol;
    String name;
    String dept;
    student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll no: ");
        rol = sc.nextInt();
        System.out.println("Enter Name: ");
        name = sc.next();
        System.out.println("Enter Department: ");
        dept = sc.next();
    }
}
class marks extends student{
    int m1, m2, m3;
    marks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark-1: ");
        m1= sc.nextInt();
        System.out.println("Enter Mark-2: ");
        m2=sc.nextInt();
        System.out.println("Enter Mark-3: ");
        m3=sc.nextInt();
    }
    void calculate(){
      int total=(m1+m2+m3);
      System.out.println("Total marks: "+total);
    }
    void display(){
        System.out.println("Roll no: " + rol);
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        
    }
    public static void main(String[]args){
        marks obj = new marks();
        obj.calculate();
        obj.display();
    }
}
