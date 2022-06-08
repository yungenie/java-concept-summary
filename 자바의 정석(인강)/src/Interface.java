/**
 * Interface 선언 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
public interface Interface {

    /*
        Interface 선언
        Interface란
        - 추상메서드의 집합 (상수, default 메서드, static 메서드)
        - 선언부 메서드 (구현된 것이 없는 설계도, 껍데기)
        - 모든 멤버가 public
     */

    // 상수 (pulic, static, final 생략가능, 생략해도 붙은 걸로 간주가 됩니다. 컴파일시 붙음)
    public static final String NAME ="yunjin";
    final int AGE = 28;
    static String HOBBY = "thinking";
    int JOB = 1;

    // 추상메서드 (public, abstract 생략가능, 항상 인터페이스의 메서드는 public, abstrac)
    public abstract String getName();
    public int getAge();
    abstract String getHobby();

    //jdk1.8 추가됨 (default 메서드, 본문이 있어야함)
    default String setJOB(int job){
        return "My Job : " + job + "개";
    }

    //jdk1.8 추가됨 (static 메서드, 본문이 있어야함)
    public static void setName() {
        System.out.println("나의 이름은" + NAME);
    }

}
