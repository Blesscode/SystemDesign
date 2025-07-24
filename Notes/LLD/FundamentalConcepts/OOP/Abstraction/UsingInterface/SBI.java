class SBI implements BankInterface{
    SBI(){
        System.out.println("Welcome to SBI net Banking, a "+BankInterface.bankType+" banking website");
    }
    Integer branches=6;

    @Override
    public Integer getIntrestRate(){
        return 9;
    }

    String getBranches(){
       return "We have in total "+branches+" branches.";
    }



}