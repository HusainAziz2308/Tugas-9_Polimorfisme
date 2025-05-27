package Polimorfisme;

class Parent {
    int x = 5;

    public void Info() {
        System.out.println("Ini class Parent");
    }
}

class Child extends Parent {
    int x = 10;

    @Override
    public void Info() {
        System.out.println("Ini class Child");
    }
}

public class Tes {
    public static void main(String[] args) {
        Parent tes = new Child();
        System.out.println("Nilai x = " + tes.x); // Output: 5
        tes.Info(); // Output: Ini class Child
    }
}
