package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod(){
        System.out.println("publicMethod 호출 "+ publicField);
    }

    void defaultMethod(){
        System.out.println("defaultMethod 호출 "+ defaultField);
    }

    private void privateMethod(){
        System.out.println("privateField 호출 "+ privateField);
    }

    //내부 호출 : 자기 자신에게 접근 -> private 포함한 모든 필드에 접근 가능
    public void innerAccess(){
        System.out.println("내부 호출 ");
        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
