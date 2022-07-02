package test;

import lombok.Cleanup;

import java.io.Closeable;

/**
 * Lombok @Cleanup("메소드명") 테스트
 *
 * @author Yunjin
 * @since JDK1.8
 */

class OverrideClose implements Closeable {

    public OverrideClose() {
        System.out.println("call OverrideClose()");
    }

    @Override
    public void close() {
        System.out.println("call @Override close()");
    }
}

class CustomClose {

    String type = "";
    public CustomClose(String type) {
        this.type = type;
        System.out.println("call CustomClose() : " + this.type);
    }

    public void close() {
        System.out.println("call close() : " + this.type);
    }

    public void closeup() {
        System.out.println("call closeup() : " + this.type);
    }
}

public class LombokCleanupEx {
    /**
     * The @Cleanup annotation automatically closes the resource.
     * but, If there is no close() method in the class object,
     * the method operating close() in the class can be implemented
     * and the implemented method name can be written in the parameter.
     *
     * */

    public static void main(String[] args) {

        @Cleanup() OverrideClose oc = new OverrideClose();
        @Cleanup() CustomClose cc = new CustomClose("cc");
        @Cleanup("closeup") CustomClose ccup = new CustomClose("ccup");


    }
}
