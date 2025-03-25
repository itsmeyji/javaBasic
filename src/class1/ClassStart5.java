package class1;

public class ClassStart5 {
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

        Student std4 = new Student();
        std4.name = "hunil";
        std4.age = 27;
        std4.score = 90;

        Student[] stdArr = new Student[] {std1, std2, std3, std4};


        for (int i = 0 ; i < stdArr.length; i++) {
            System.out.printf("이름 : %s,  나이 : %d,  성적 : %d\n", stdArr[i].name, stdArr[i].age, stdArr[i].score);
        }

//        System.out.println(std1);
//        System.out.println(std2);
//        System.out.println(std3);

            
        }
    }
