package poly.ex6;

public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        System.out.println("\n1");
        soundAnimal(dog);

        System.out.println("\n2");
        soundAnimal(bird);

        System.out.println("\n3");
        soundAnimal(chicken);

        flyAnimal(chicken);
        flyAnimal(bird);
    }

    // AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


    // Fly interface가 있으면 사용 가능
    private static void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
    }
}
