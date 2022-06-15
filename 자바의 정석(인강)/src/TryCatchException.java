package lai.module.starter.test;

/**
 * try-catch Exception 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
public class TryCatchException {
    public static void main(String[] args) {
        // error
        // throw new Exception(); // Exception을 고의로 발생시킨다.

        // Exception과 그 자손은 반드시 예외처리를 해줘야 한다. (필수)
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴피일 됨
        throw new RuntimeException();

    }
}
