package extends1.ex;

public class Album extends Item{
    String artist;

    // book 생성자 정의
    public Album(String name, int price, String artist){
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 아티스트 : " + artist);
    }
}
