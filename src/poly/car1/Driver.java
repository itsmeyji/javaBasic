package poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car){
        System.out.println("차량 설정 : " + car);
        this.car = car;
    }

    public void drive(){
        System.out.println("차량 운행 시작");
        car.startEngine();
        car.offEngine();
        car.pressAccelerator();
    }
}
