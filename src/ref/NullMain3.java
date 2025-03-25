package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = "+ bigData.count);
        System.out.println("bigData.data = "+ bigData.data);

        // 아래 코드에서 NullPointerException 발생
        // bigData.data 가 null이기 때문에 bigData.data.Value 로 접근 불가
        System.out.println("bigData.data.Value" + bigData.data.Value);
    }
}
