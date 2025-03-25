package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        // 보통은 new Data(); 이렇게 하는데, 미리 선언하지 않고 우선 null로 작성해놓음
        // 왜지근데.. zzz
        // 참조할 대상이 아직 없다는 뜻
        System.out.println("1. data =" + data);
        data = new Data();
        System.out.println("2. data = " + data);
        System.out.println("2-1. data = " + data.Value);
        // 여기서 출력되는 data = 0 이거는 Data class file을 보면 정의 된 값을 말함
        // int Value; 로 멤버변수가 지정되었기 때문에 자동 초기화 과정을 통해서 Value = 0으로 지정되었음

        data = null;
        // 이렇게 하면 대입해놨던 주소지를 다시 뺌
        // 다시 박탈시켜서 data라는 변수명만 남기고 내용 또는 생성자 자체를 비움
        // 대체 왜? > 코드 재사용성의 향상을 위해
        System.out.println("3. data = " + data);
    }
}
