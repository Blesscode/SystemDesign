class Main{

    public static void main(String... args){
        AbstractBank obj1=new SBI();
        System.out.println(AbstractBank.greetCustomer());
        System.out.println(obj1.getIntrestRate());
        System.out.println(obj1.aboutUs());
        System.out.println(((SBI)obj1).getBranches()); 
        

        AbstractBank obj2=new HDFC();
        System.out.println(AbstractBank.greetCustomer());
        System.out.println(obj2.getIntrestRate());
    }
}