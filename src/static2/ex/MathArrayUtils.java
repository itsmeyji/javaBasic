package static2.ex;

public class MathArrayUtils {
//    private static int sum = 0;
//    private static int ave;
//    private static int min;
//    private static int max;

    // private으로 선언해서 인스턴스의 생성을 막음
    private MathArrayUtils(){
    }

    public static int sum(int[] values){
        int sum =0;
        for (int i = 0; i < values.length; i++) {
            sum+= values[i];
        }
        return sum;
    }

    public static int average(int[] values){
        return sum(values) / values.length;
    }

    public static int min(int[] values){
        int min = values[0];

        for (int i = 1; i < values.length; i++) {
            if (min > values[i]){
                min = values[i];
            }
        }

        return min;
    }

    public static int max(int[] values){
        int max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (max < values[i]){
                max = values[i];
            }
        }
        return max;
    }

}
