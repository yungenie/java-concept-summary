package basic;


/**
 * 클래스에 사용 가능한 접근 제어자. public, default
 *
 * @author Yunjin
 */
public class AccessModifier {

    public String name = "접근 제한이 없다.";
    protected String name2 = "같은 패키지, 다른 패키지의 자손 클래스에서 접근 가능";
    private String name3 = "같은 클래스 내에서만 접근 가능";
    String name4 = "같은 패키지 내에서만 접근 가능"; // default

    public static void main(String[] args) {

    }
}

class DefaultClass {
    // 클래스는 public, default 접근 제어자만 허용한다.
}