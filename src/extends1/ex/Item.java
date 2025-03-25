package extends1.ex;

public class Item {
    private String title;
    private int price;

    // item 생성자 정의
    public Item(String title, int price){
        this.title = title;
        this.price = price;
    }

    // getPrice() 정의
    public int getPrice(){
        return price;
    }

    // print() 정의
    public void print(){
        System.out.println("이름 : " + title + "  가격 : " + price);
    }
}
