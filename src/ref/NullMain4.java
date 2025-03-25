package ref;

public class NullMain4 {

    // NullMain3에서 발생한 에러 해결한 코드
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();   // 이 한 줄을 추가함으로서 data에도 객체를 부여, null이 아니게 되면서 .Value로의 접근을 가능하게 함
        System.out.println("bigData.count = "+ bigData.count);
        System.out.println("bigData.data = "+ bigData.data);

        // 아래 코드에서 NullPointerException 발생
        // bigData.data 가 null이기 때문에 bigData.data.Value 로 접근 불가
        System.out.println("bigData.data.Value" + bigData.data.Value);
    }
}
