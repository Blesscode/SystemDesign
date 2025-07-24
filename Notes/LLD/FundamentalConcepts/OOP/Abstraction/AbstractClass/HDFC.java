class HDFC extends AbstractBank{

    HDFC(){
        System.out.println("Welcome to HDFC net Banking, a "+AbstractBank.bankType+" banking website that is "+super.leagallyAuthorized);
    }

    @Override
    Integer getIntrestRate(){
        return 8;
    }

}