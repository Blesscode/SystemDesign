interface BankInterface{
    

     // Constants (implicitly public static final)
    String bankType = "Private";

    /*abstract*/ Integer getIntrestRate();


    /*NOT ALLOWED
    static {
        System.out.println("You are now browsing our bank website");
    }*/
    static String greetCustomer() {
        return "Welcome customers";
    }

    default String aboutUs(){
        return "This is a "+ bankType +" Banking website.";
    }
    

}