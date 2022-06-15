
/**
 * 사용자 정의 Exception 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
public class UserdefinedException extends Exception{
    /**
     * 사용자 정의 예외 만들때 주의사항
     * - 조상은 Exception과 RuntimeException 중에서 선택
     * - 조상인 Exception 클래스의 생성자 호출
     * */
    private final int ERR_CODE;

    public UserdefinedException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    UserdefinedException(String msg) {
        this(msg, 100);
    }

    public int getErrCode(){
        return ERR_CODE;
    }
}
