abstract class AbstractBank{
    AbstractBank(){
        System.out.println("Trust Net Banking");
    }
    String leagallyAuthorized="Legally Authorized";
    static String bankType = "Private";

    abstract Integer getIntrestRate();


    static {
        //does not contains return
        //execute when class load
        System.out.println("You are now browsing our bank website");
    }
    static String greetCustomer() {
        return "Welcome customers";
    }

    String aboutUs(){
        return "This is a Private Banking website.";
    }
    
    static {
       
        System.out.println("We appreciate your trust on us ");
    }
}