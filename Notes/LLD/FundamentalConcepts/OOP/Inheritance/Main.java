import java.util.*;
public class Main{
    Scanner sc=new Scanner(System.in);
    public static void main(String... args){
        Main obj1=new Main();

        //case1
        //Snake snake=new Snake(); error
        Snake snake=new Snake("Jhon",2,"snake");
        System.out.println(snake.getName());//call parent method 
        snake.shedSkin(); //child method call
        snake.speak();//child method call 
        System.out.println(snake.profile());

        System.out.println("----------------------------------------------------------------");
        
        //case2
        Pets snake2=new Snake("Jhon",2,"snake");
        System.out.println(snake2.getName());//call parent method 
        snake2.speak();
        //child methods  : error
        /*snake2.shedSkin(); //child method call
        snake2.speak();//child method call
        System.out.println(snake2.profile());//child method call*/

        //TO CALL CHILD METHODS DO : typecast obj to child type to access child also i.e typecaste to case 1
        
        ((Snake)snake2).shedSkin(); //child method call
        ((Snake)snake2).speak();//child method call
        System.out.println(((Snake)snake2).profile());

         System.out.println("----------------------------------------------------------------");

         //case3
         Pets snake3=new Pets("Jhon",2,"snake");
        System.out.println(snake.getName());//call parent method 
    
        //CANNOT BE CASTED TO SNAKE OBJECT TO BE LIKE CASE 1 BECAUSE IT'S NOT A INSTANCE OF SNAKE IT'S JUST A PLAIN PET OBJECT
        /*((Snake)snake3).shedSkin(); //child method call
        ((Snake)snake3).speak();//child method call
        System.out.println(((Snake)snake3).profile());*/
        
        System.out.println("----------------------------------------------------------------");

        //Pet2
        Cat cat1=new Cat();
        cat1.climbTree();
        
        System.out.println("----------------------------------------------------------------");

        Cat cat2=new Cat(1);
        cat2.speak();
        cat2.climbTree();
    }
}