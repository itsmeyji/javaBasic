package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("전원 ON");
    }

    void off() {
        isOn = false;
        System.out.println("전원 OFF");
    }

    void up() {
        volume++;
        System.out.println("플레이어 볼륨 : " + volume);
    }

    void down() {
        volume--;
        System.out.println("플레이어 볼륨 : " + volume);
    }

    void showStatus() {
        System.out.printf("플레이어 상태 확인 : \t");
        if (isOn) {
            System.out.println("음악플레이어 ON, 플레이어 볼륨 : " + volume);
        } else {
            System.out.println("음악플레이어 OFF");
        }
    }
}
