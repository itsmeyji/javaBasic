package class1;

public class ClassStart6 {
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
        std3.name = "sangyoon";
        std3.age = 26;
        std3.score = 80;

        Student std4 = new Student();
        std4.name = "hunil";
        std4.age = 27;
        std4.score = 90;

        // 1. 배열 선언하여 접근
//        Student[] stdArr = new Student[]{std1, std2, std3, std4};
//        for (int i = 0; i < stdArr.length; i++){
//            System.out.printf("name : %s,  age : %d, score : %d\n", stdArr[i].name, stdArr[i].age, stdArr[i].score);
//        }

        // 2. 변수에 객체를 저장해서 접근
//        Student[] stdArr = new Student[]{std1, std2, std3, std4};
//        for (int i = 0; i < stdArr.length; i++) {
//            Student s = stdArr[i];      // 객체를 저장해야 하니까 string이 아니라 Student class 의 변수가 필요함
//            System.out.printf("name : %s,  age : %d, score : %d\n", s.name, s.age, s.score);
//        }

        // 3. for each문 사용해서 접근
        Student[] stdArr = new Student[]{std1, std2, std3, std4};
        for (Student s : stdArr) {
            System.out.printf("name : %s,  age : %d, score : %d\n", s.name, s.age, s.score);
        }



    }
}