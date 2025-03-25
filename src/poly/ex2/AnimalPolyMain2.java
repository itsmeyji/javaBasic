package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
/*        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();
        Animal duck = new Duck();*/

        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("종료");
    }
}
