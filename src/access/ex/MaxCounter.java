package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if (isNumValid()){
            count += 1;
        }else{
            System.out.println("최대값입니다");
        }
    }

    private boolean isNumValid(){
        return count < max;
    }

    public int getCount(){
        return count;
    }
}
