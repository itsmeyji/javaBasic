package extends1.super2;

public class ClassB extends ClassA{

    // classA 의 자식 클래스인 classB의 생성자 작성
    public ClassB(int a){
        this(a, 0);
//        super();    // 기본 생성자, 생략 가능!!!!!!!!
        System.out.println("ClassB 생성자 a= " + a);
    }

    public ClassB (int a, int b){
        super();    // 기본 생성자, 생략 가능
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
