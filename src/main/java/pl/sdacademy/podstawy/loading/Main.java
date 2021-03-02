package pl.sdacademy.podstawy.loading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Starting");
        System.out.println("Class Loaded" + LoadingExample.STATIC_FIELD);
        new LoadingExample();
    }
    public static int staticField() {
        System.out.println("Static field");
        return 1;
    }
    public static int staticInitializer() {
        System.out.println("Static initializer");
        return 1;
    }
    public static int objectInitializer() {
        System.out.println("Object initializer");
        return 1;
    }
    public static int firstConstructor() {
        System.out.println("First constructor");
        return 1;
    }
    public static int secondConstructor() {
        System.out.println("Second constructor");
        return 1;
    }
    public static int objectField() {
        System.out.println("Object field");
        return 1;
    }
}