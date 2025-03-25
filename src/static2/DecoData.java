package static2;

import java.sql.SQLOutput;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
//        inctanceValue++;
        staticValue++;          // 정적 변수 접근

    }

    private void instanceMehtod(){
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue=" + staticValue);
    }
}
