import java.lang.String;
public class Class1{
    private String name;
    private Integer age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
       return this.name;
    }    
    public void setAge(Integer age){
        this.age=age;
    }
    public Integer getAge(){
        return this.age ;
    }

    @Override
    public String toString(){
        return "name:= "+getName()+" age:="+this.getAge();
    }

}