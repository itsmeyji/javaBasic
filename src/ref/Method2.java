package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 22, 80);

//        Student student1 = new Student();
//        Student student2 = new Student();

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;    // 만들어진 student의 참조값을 반환함
    }

    static void printStudent(Student student){
        System.out.println("이름 : "+student.name + "\t나이 : "+student.age + "\t성적 : "+student.grade);
    }
}
