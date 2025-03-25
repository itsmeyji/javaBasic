package extends1.super1;

public class Child extends Parent{

    // value 라는 동일한 이름의 변수에 다른 문자열 값을 넣어놓음
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = " + this.value);      // this는 생략 가능
        System.out.println("super value = " + super.value);

        this.hello();
        super.hello();
    }
}
