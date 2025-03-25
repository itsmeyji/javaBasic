package oop1;

// 클래스 내부에 데이터인 value와 데이터를 사용하는 기능인 add 메서드까지 사용
public class ValueData {
    int value;

    // 하단의 add() 메서드는 static 키워드를 사용하지 않음
    // 왜냐하면 static 키워드는 객체를 생성하지 않고도 메서드를 호출할 수 있기 때문임
    void add(){
        value ++;
        System.out.println("숫자 증가 : "+ value);
    }

    public static void main(String[] args) {

    }
}
