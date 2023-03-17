package collectionframework.arrays;

public class ArrayExam01 {
    public static void main(String[] args) {
        // 배열의 생성과 초기화
        int[] candy1 = new int[]{10, 20, 30, 40, 50};
        int[] candy2 = {10, 20, 30, 40, 50}; // new int[] 생략 가능. 더 간단!

        // 잘못된 코드의 예
        // 배열의 선언과 생성을 따로 하는 경우에는 new 타입[] 생략 불가능
        int[] candy3;
        candy3 = new int[] {10, 20, 30, 40, 50}; // OK
        //candy3 = {10, 20, 30, 40, 50}; // 에러 발생. new int[] 생략 불가능

        // 길이가 0인 배열을 생성하는 세 가지 예시
        // 괄호{} 안에 아무것도 넣지 않으면 길이가 0인 배열이 생성된다.
        int[] candy4 = new int[0];
        int[] candy5 = new int[]{};
        int[] candy6 = {};


        System.out.println("candy6 = " + candy6);
    }
}
