package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age){
        this(name, age, 50);
        this.name = name;
        this.age = age;
        this.grade = 0;
    }

    MemberConstruct(String name, int age, int grade){
        System.out.printf("생성자 호출 name = "+ name+ " age = "+age, "grade = "+ grade + "\n");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
