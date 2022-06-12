/**
 * 캡슐화 예제
 *
 * @author  Yunjin
 * @since   JDK1.8
 */
class Time {

    /**
     * 캡슐화와 접근 제어자
     *
     * 접근 제어자를 사용하는 이유?
     * - 외부로부터 데이터를 보호하기 위해서
     * - 외부에서는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서
     *
     * 접근 제어자
     * - 클래스는 public > default
     * - 변수는 public > protected > default > private
     * */
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour){
        if (isValidHour(hour)) return;

        this.hour = hour;

    }
    private boolean isValidHour(int hour){
        return hour < 0 || hour > 23;
    }

    public int getHour() {
        return hour;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Time time = new Time();
        // error, private 변수 접근 못함.
        //time.hour = -100;
        time.setHour(21);

    }
}
