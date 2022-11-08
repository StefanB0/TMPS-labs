package lab0.lib;

public class Person {
    public String name;

    public Person(String name){
        this.name = name;
    }

    public void PrintParameters(){
        System.out.print("My name is" + name);
    }
}

