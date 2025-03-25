package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct m : members) {
            System.out.printf("이름 : %s, 나이 : %d, 점수 : %d\n", m.name, m.age, m.grade);
        }
    }
}
