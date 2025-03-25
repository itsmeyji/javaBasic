package extends1.super1;

public class Super1Main {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent = new Parent();

        System.out.println("1");
        child.hello();
        System.out.println("2");
        child.call();

        System.out.println("3");
        parent.hello();
    }
}
