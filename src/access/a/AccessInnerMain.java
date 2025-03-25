package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 : 가능
        data.publicField = 10;
        data.publicMethod();

        //default 호출 : 가능 - 같은 패키지
        data.defaultField = 10;
        data.defaultMethod();

        //private 호출 : 불가능
//        data.privateField = 10;
//        data.privateMethod();

        //innerAccess 호출 : 이건 가능함~~~~
        data.innerAccess();
    }
}
