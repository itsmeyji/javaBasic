package static2.ex;

public class Car {

    private static int carNum;
    private String name;

    public Car(String name){
        this.name = name;
        System.out.println("차량 구입, 이름 : "+name);
        carNum ++;
    }

    static void showTotalCars(){
        System.out.println("구매한 차량 수 : "+ carNum);
    }
}
