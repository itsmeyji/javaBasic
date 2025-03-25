package poly.ex3;

public abstract class AbstractAnimal {

    // 추상메서드
    public abstract void sound();

    // 일반메서드 -> 오버라이딩 꼭 필요하진 않음
    public void move(){
        System.out.println("동물이 움직입니다");
    }
}
