package pack;


import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b .User();
    }

    // package a와 b에 모두 User라는 이름의 클래스 파일리 들어가 있는 경우 둘 중 하나는 import,
    // 나머지는 필연적으로 패키지 경로를 포함하여 작성해야 함
}
