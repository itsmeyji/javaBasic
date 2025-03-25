package poly.ex5;

import poly.ex4.AbstractAnimal;

public class InterFaceMain {
    public static void main(String[] args) {
        // 인터페이스 생성 불가
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
    }

    // 변하지 않는 부분
    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
