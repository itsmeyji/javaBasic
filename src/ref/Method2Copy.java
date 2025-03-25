package ref;

public class Method2Copy {
    public static void main(String[] args) {
        String name;
        int age;
        int grade;

        Student student1 = createStudent("학생1", 22, 90);
        Student student2 = createStudent("학생2", 27, 70);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    static void printStudent(Student student){
        System.out.printf("이름 : "+ student.name + "\t나이 : "+ student.age + "\t점수 : "+student.grade);
    }
}
