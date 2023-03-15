package basic;


/**
 * final 필드 개념 잡기
 * <p><blockquote><pre>
 * - final 필드는 초기값이 저장되면 프로그램 실행 도중에 수정할 수 없습니다.
 * - final 필드의 초기값 방법은 2가지 입니다.
 *   1. 필드 선언시 초기화
 *   2. 객체 생성시 외부 데이터로 초기화
 * </p></blockquote></pre>
 *
 * @since  1.8
 * @author Yunjin
 */
public class FinalVariableExam01 {

    /**
     * final 필드 초기화 방법 2가지
     * 1. 필드 선언시 초기화
     * 2. 객체 생성시 외부 데이터로 초기화
     */
    // 1. 필드 선언시 초기화 (final 변수 초기화 시키면 값을 변경할 수 없음)
    private final String kind = "human";
    //kind ="ai"; //comfile error - Unexpected token

    // 2. 객체 생성시 외부 데이터로 초기화 (final 필드 선언 후 생성자 매개변수 추가해야 함)
    private final String name;
    private final int age;
    //private final String test; // comfile error - Variable 'test' might not have been initialized
    public FinalVariableExam01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        // 직접적인 값 변경 불가.
        //kind = "robat";
        //this.kind = "alien";
        //age = 20;
        //this.age = 21;

        // 객체의 인스턴스화를 통해서 초기화 가능.
        FinalVariableExam01 finalVariableExam01 = new FinalVariableExam01("yunjin", 28);
        System.out.println("finalVariableExam01 = " + finalVariableExam01);

        // 최종변수에 값을 할당할 수 없음.
        //finalVariableExam01.age = 10; // comfile error - Cannot assign a value to final variable 'age'
    }
}
