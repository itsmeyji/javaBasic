package class1;

import java.io.PrintStream;

public class ClassStart3 {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "eunji";
        std1.age = 22;
        std1.score = 50;

        Student std2 = new Student();
        std2.name = "yunji";
        std2.age = 22;
        std2.score = 90;

        Student std3 = new Student();
        std3.name = "benny";
        std3.age = 26;
        std3.score = 80;


        System.out.printf("이름 : %s,  나이 : %d,  성적 : %d\n", std1.name, std1.age, std1.score);
        System.out.printf("이름 : %s,  나이 : %d,  성적 : %d\n", std2.name, std2.age, std2.score);
        System.out.printf("이름 : %s,  나이 : %d,  성적 : %d\n", std3.name, std3.age, std3.score);

//        System.out.println(std1);
//        System.out.println(std2);
//        System.out.println(std3);

    }
}