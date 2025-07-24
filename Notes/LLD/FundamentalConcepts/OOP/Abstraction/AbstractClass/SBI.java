class SBI extends AbstractBank{
    SBI(){
        System.out.println("Welcome to SBI net Banking");
    }
    Integer branches=6;

    @Override
    Integer getIntrestRate(){
        return 9;
    }

    String getBranches(){
       return "We have in total "+branches+" branches.";
    }



}