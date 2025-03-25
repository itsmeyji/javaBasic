package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1; // 상속관계 or 같은 패키지
//        default, private value는 접근 불가

        printParent();
        // 이건 가능 : 자식클래스를 통해 접근하는 것이기 때문
    }
}
