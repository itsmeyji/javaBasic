package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        // 자식의 메서드 사용 불가
        // poly.childMethod() <- 이거 사용 안된다는 뜻

        // down casting (부모 타입 -> 자식 타입)
        Child child = (Child) poly;  // x001
        child.childMethod();

        // 일시적 다운캐스팅
        ((Child) poly).childMethod();
    }
}
