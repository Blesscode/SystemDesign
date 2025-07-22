import java.util.*;
public class Main{
    Scanner sc=new Scanner(System.in);
    public static void main(String... args){
        Main mainObj=new Main();
        Class1 obj1=new Class1();

        System.out.print("Age:= ");
        Integer age=Integer.parseInt(mainObj.sc.nextLine());
        obj1.setAge(age);

        System.out.print("Name:= ");
        String name=mainObj.sc.nextLine();
        obj1.setName(name);
        System.out.println("dtls are name:= "+obj1.getName()+" age:="+obj1.getAge());
        System.out.println(obj1.toString());
    }
}