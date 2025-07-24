class HDFC implements BankInterface{

    HDFC(){
         System.out.println("Welcome to HDFC net Banking, a "+BankInterface.bankType+" banking website");
    }

    @Override
    public Integer getIntrestRate(){
        return 8;
    }

}