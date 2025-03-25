package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "yunji", 15, 90);


        MemberInit member2 = new MemberInit();
        initMember(member2, "eunji", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members){
            System.out.printf("이름 : %s, 나이 : %d, 점수 : %d\n", s.name, s.age, s.grade);
        }
    }

    static void initMember (MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
