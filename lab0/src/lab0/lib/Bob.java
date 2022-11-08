package lab0.lib;

public class Bob extends Builder {
    private String dream;
    public Bob(int workexperience, String dream) {
        super("Bob", workexperience);
        this.dream = dream;
    }

    @Override
    public void PrintParameters() {
        String ws = String.valueOf(workexperience);
        System.out.print("My name is" + name + ", I am a builder with " + ws + "years of experience" + "and my dream is to" + dream);
    }
}
