package test;

import lombok.Cleanup;
/**
 * Lombok @Cleanup("메소드명") 테스트
 *
 * @author Yunjin
 * @since JDK1.8
 */
public class LombokCleanupTest {
    public static void main(String[] args) {

        /**
         * @Cleanup Annotation is automatically cleaned up that resource.
         * but, If there is no close() method in the class object,
         * the method operating close() in the class can be implemented
         * and the implemented method name can be written in the parameter.
         *
         * */
        @Cleanup("closeup") RunTest rt = new RunTest();
        rt.Run();

    }
}
