package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Addition result: " + addition.operate(5, 10));

        StringManipulator toUpperCase = input -> input.toUpperCase();
        System.out.println("Uppercase string: " + toUpperCase.manipulate("hello world"));

        Function<String, Integer> countUppercase = StringListProcessor::countUppercase;
        String testString = "Hello World!";
        System.out.println("Uppercase letters count: " + countUppercase.apply(testString));

        Supplier<Integer> randomNumberSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Random number: " + randomNumberSupplier.get());
    }
}
