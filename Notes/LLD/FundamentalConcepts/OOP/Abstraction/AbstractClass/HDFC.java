class HDFC extends AbstractBank{

    HDFC(){
        System.out.println("Welcome to HDFC net Banking");
    }

    @Override
    Integer getIntrestRate(){
        return 8;
    }

}