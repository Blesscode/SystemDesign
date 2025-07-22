# INHERITANCE

- Extend a parent method in a child
- the child can access both parent and chils method if reference is of child type object
- If a parent method is overriden in child then child implementation should be visible
- Keep a check for super()

## KeyPoints

1. The child class obj whenever is created then:
   i. Parent constructor call -> through super()
   ii. after that child constructor will work
   i.e.

   ```
   MAIN
   public static void main(){
       Child objchild=new Child("abc",1);

   }

   CHILD
   Child(name,age){
       //super(); internally present by default -> Parent Class
       System.out.println("Child called");
   }


   PARENT
   Parent(){
       //super(); internally present by default -> Object Class
       System.out.println("Parent called");
   }

   OUTPUT
   Parent called
   Child called
   ```

   CASE2 : explicity call

   ```
   MAIN
   public static void main(){
       Child objchild=new Child("abc",1);

   }

   CHILD
   Child(String name,Integer age){
       super(name,age); //explicitly called
       System.out.println("Child called");
   }

   PARENT
   Parent(){
       //super(); internally present by default
       System.out.println("Parent called");
   }
    Parent(String name,Integer age){
       //super(); internally present by default
       System.out.println("Parent called with 2 param constructor");
   }

   OUTPUT
   Parent called with 2 param constructor
   Child called
   ```

   NOTE: EVERY CONSTRUCTOR HAS SUPER() AS IT'S FIRST LINE UNTIL EXPLICITLY DEFINED AND THAT SUPER CALLS IT'S PARENT**The parent constructors internally will not call super() , and that super will call Object Class parent of each class**

2. does not take part in inheritance:
   i. Constructor does not take part in inheritance , & above behaviour is due to super() not inheritance
   ii. Private access modifier
3. HAS-A : what a child or parent have as it's personal ,methods
4. IS-A : what a child also have indirectly because of extending the parent
5. super = to parent class reference : var,methods **❌not in static area**
   super() = constructor call parent **⚠️Only inside constructor,also as 1st statement,by default present**
6. this = present class reference
   this()= constructor call of present class **⚠️Only inside constructor,also as 1st statement,not added by default**
