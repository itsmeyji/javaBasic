package poly.ex3;

import poly.ex2.Animal;

public class AbstractMain {
    public static void main(String[] args) {


        AbstractAnimal animalArr[] = {new Dog(), new Cat(), new Cow()};

        for (AbstractAnimal abstractAnimal : animalArr) {
            soundAnimal(abstractAnimal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
