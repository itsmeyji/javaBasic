package oop1;

// 절차지향적으로 작성한 코드 예시, 이후 해당 코드를 리팩토링하며 사용

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        // 이렇게 새 객체를 만들어 접근하면 음악플레이어 관련된 변수들을 data 객체로 접근 가능하므로
        // 소속(?) 어디에 속해있는지에 대한 확인이 용이해짐
        // 다른 변수들을 추가하고 싶을 때, MusicPlayerData에 멤버변수를 추가하여 사용 가능 -> 관리 쉬워짐

        // 플레이어 켜기
        on(data);

        //볼륨 증가
        up(data);

        // 볼륨 감소
        down(data);

        // 플레이어 상태
        showStatus(data);

        // 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("전원 ON");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("전원 OFF");
    }

    static void up(MusicPlayerData data) {
        data.volume++;
        System.out.println("플레이어 볼륨 : " + data.volume);
    }

    static void down(MusicPlayerData data) {
        data.volume--;
        System.out.println("플레이어 볼륨 : " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.printf("플레이어 상태 확인 : \t");
        if (data.isOn) {
            System.out.println("음악플레이어 ON, 플레이어 볼륨 : " + data.volume);
        } else {
            System.out.println("음악플레이어 OFF");
        }
    }
}
