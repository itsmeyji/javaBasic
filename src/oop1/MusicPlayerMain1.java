package oop1;

// 절차지향적으로 작성한 코드 예시, 이후 해당 코드를 리팩토링하며 사용

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume =1;
        boolean isOn = false;

        // 플레이어 켜기
        isOn = true;
        System.out.println("플레이어를 시작합니다");

        //볼륨 증가
        volume ++;
        System.out.println("플레이어 볼륨 : "+volume);

        // 볼륨 감소
        volume --;
        System.out.println("플레이어 볼륨 : "+volume);

        // 플레이어 상태
        System.out.println("플레이어 상태 확인 : ");
        if (isOn){
            System.out.println("음악플레이어 ON, 볼륨 : "+ volume);
        } else{
            System.out.println("음악플레이어 OFF, 볼륨 : ");
        }

        // 플레이어 끄기
        isOn = false;
        System.out.println("음악플레이어를 종료합니다.");
    }
}
