package class1;

public class ClassStart2 {
    public static void main(String[] args){
        String[] stdName = {"정윤지", "최은지", "박훈일", "한상윤"};
        int[] age = {22, 22, 27, 26};
        int[] score = {50, 80, 90, 50};

        for (int i = 0; i < stdName.length; i++){
            System.out.println("이름 :" + stdName[i] + "  나이 :" + age[i] + "  점수:" + score[i]);
        }
    }
}