import java.util.*;
public class Main{
    Scanner sc=new Scanner(System.in);
    public static void main(String... args){
        Main obj1=new Main();

        //case1

        Snake snake=new Snake("Sam",2,"snake");

        snake.speak();
      
        System.out.println("----------------------------------------------------------------");
        
        //case2
        Pets snake2=new Snake("Jhon",2,"snake");
        snake2.speak();//child method call instead of parent

        System.out.println("----------------------------------------------------------------");

        //case3
        Pets snake3=new Pets("Mike",2,"snake");
        snake3.speak();
       
        System.out.println("----------------------------------------------------------------");

    }
}