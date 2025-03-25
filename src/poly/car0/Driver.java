package poly.car0;

public class Driver {

    // 객체 생성한건 아님
    private K3Car k3Car;
    private Model3 model3;

    // main에서 k3car를 set하면 그때 객체가 생성되도록 설정
    // 캡슐화 강화하는 수단으로 사용됨
    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    // model3 set 추가
    public void setModel3(Model3 model3) {
        this.model3 = model3;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3 != null) {
            model3.startEngine();
            model3.pressAccelerator();
            model3.offEngine();
        }

    }
}
