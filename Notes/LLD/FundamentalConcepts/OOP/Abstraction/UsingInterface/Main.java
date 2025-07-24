class Main{

    public static void main(String... args){
        BankInterface obj1=new SBI();
        System.out.println(BankInterface.greetCustomer());
        System.out.println(obj1.getIntrestRate());
        System.out.println(obj1.aboutUs());
        System.out.println(((SBI)obj1).getBranches()); 
        

        BankInterface obj2=new HDFC();
        System.out.println(BankInterface.greetCustomer());
        System.out.println(obj2.getIntrestRate());
    }
}