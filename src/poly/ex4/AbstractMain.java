package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal animalArr[] = {new Dog(), new Cat(), new Cow()};
        int i = 1;

        for (AbstractAnimal abstractAnimal : animalArr) {
            System.out.println("------" + i);
            i++;
            soundAnimal(abstractAnimal);
            moveAnimal(abstractAnimal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal){
        System.out.println("동물 이동 시작");
        animal.move();
        System.out.println("동물 이동 종료");
    }


}
