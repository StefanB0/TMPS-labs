package lab0;

import lab0.lib.Bob;
import lab0.lib.Calculator;
import lab0.lib.Converter;
import lab0.lib.Person;

public class Main {
    public static void main(String[] args) {
        Person nicu = new Person("Nicu");
        Bob bob = new Bob(12, "Build a wall");

        nicu.PrintParameters();
        bob.PrintParameters();

        Calculator calculator = new Calculator();
        Converter converter = new Converter();

        int sum = calculator.Add(2, 2);
        int a = 4;
        Double b = converter.intDouble(a);
    }
}