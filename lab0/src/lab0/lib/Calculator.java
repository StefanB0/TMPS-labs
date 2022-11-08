package lab0.lib;

public class Calculator {
    public int Add(int a, int b) {
        return a + b;
    }

    public int Subtract(int a, int b) {
        return a - b;
    }

    public int Multiply(int a, int b) {
        return a * b;
    }

    public int Divide(int a, int b) {
        return a / b;
    }

    public int RaisePower(int a, int b) {
        int p = 1;
        for (int i = 0; i < b; i++) {
            p *= a;
        }
        return a + b;
    }
}

