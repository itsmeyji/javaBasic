package static1;

import memory.Data;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("a", counter);
        System.out.println("A count  = "+ counter.count);

        Data2 data2 = new Data2("b", counter);
        System.out.println("B count  = "+ counter.count);

        Data2 data3 = new Data2("c", counter);
        System.out.println("C count  = "+ counter.count);
    }
}
