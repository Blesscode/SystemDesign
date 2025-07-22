class Snake extends Pets{
   //no default constructor will be provided
    Snake(String PetName,Integer age,String type){
        super(PetName,age,type); //explicit super call with call paremeter constructor not default super()
        System.out.println("My pet is a: "+this.type);
    }
    @Override
    public void speak() {
        System.out.println( this.getName() + " the snake makes a Hiss sound");
    }

    public String profile(){
        return super.getName()+" is an adorable Snake,of age "+super.age+" "+super.adopted()+"and he love to eat meat and ";
        
    }
    public void shedSkin() {
        System.out.println( "It sheds its skin.");
    }

}