package construct;

public class MemberDefault {
    String name;

    // 사실 상단 코드까지만 해놔도 jvm이 알아서 생성자를 만들어 주지만,
    // 굳이 내용이 없고, 생성자만 작성되어있는 코드를 추가해도 됨

    public MemberDefault() {
        System.out.println("생성자 호출");
    }
}
