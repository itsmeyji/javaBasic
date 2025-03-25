package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("yunji", 15, 90);
        //initMember 는 Member의 초기값 설정을 만들어주는 메서드

        MemberInit member2 = new MemberInit();
        member2.initMember("eunji", 23, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members){
            System.out.printf("이름 : %s, 나이 : %d, 점수 : %d\n", s.name, s.age, s.grade);
        }
    }
}
