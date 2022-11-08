package lab0.lib;

public class Builder extends Person {
    public int workexperience;

    public Builder(String name, int workexperience) {
        super(name);
        this.workexperience = workexperience;
    }

    @Override
    public void PrintParameters() {
        String ws = String.valueOf(workexperience);
        System.out.print("My name is" + name + ", I am a builder with " + ws + "years of experience" );
    }
}

