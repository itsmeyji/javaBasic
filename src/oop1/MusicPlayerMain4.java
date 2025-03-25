package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // 필요한 기능은 새로 생성한 MusicPLayer의 객체 내부에 있기 때문에 기능과 데이터가 통합되어있으며
        // 객체 내부로 메서드들을 접근 가능하기 때문에 사용하는 입장에서는 그저 메서드명만 가져다가 사용하면 됨
        // 기능을 변경시키고자 할 때에도 사용 코드는 건들지 않고 여기서 기능이 정의되어있는 MusicPlayer 코드만 변경시키면 됨 -> 개굿
        // "캡슐화"

        player.on();
        player.up();
        player.up();
        player.down();
        player.down();
        player.showStatus();
        player.off();
    }
}
