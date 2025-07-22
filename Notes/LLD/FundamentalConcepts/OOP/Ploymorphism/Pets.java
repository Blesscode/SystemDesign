class Pets{
    private String name;  // private: not inherited
    protected int age;    // protected: inherited
    public String type;   // public: inherited

    public Pets() {
        //super();
        System.out.println("Parent Pet empty constructor called");
    }

    public Pets(String name, int age) {
         //super();
        this.name = name;
        this.age = age;
        System.out.println("Parent Pet parameterized constructor with 2 feilds called");
    }
     Pets(String name, int age,String type) {
         //super();
        this.name = name;
        this.age = age;
        this.type=type;
        System.out.println("Parent Pet parameterized constructor with 3 feilds called");
    }
    public void speak() {
        System.out.println(name + " makes a sound.");
    }

    public String adopted(){
        return name +" is adopted,";
    }
    public String getName(){
        return name;
    }

}