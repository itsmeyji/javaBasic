package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        // 부모 변수가 부모 인스턴스 참조 : 자식 객체 아직 생성 안됨
        System.out.println("1");
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();


        // 자식 변수가 자식 인스턴스 참조 : child 와 child 내부에 parent 인스턴스도 생성됨
        System.out.println("2");
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
    }
}
