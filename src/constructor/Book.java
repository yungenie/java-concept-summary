package constructor;

/**
 * 생성자 기본 예제
 *
 * 디폴트 생성자
 * 인자가 있는 생성자 (매개변수)
 * 복제 생성자
 *
 * @author yunjin
 */
public class Book {
    String title;
    int price;

    public Book() {

    }

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    Book(Book copyBook) {
        title = copyBook.title;
        price = copyBook.price;
/*        title = "찾을 수 없음";
        price = 0;
        this.title = "찾을 수 없음";
        this.price = 0;*/

    }

    void print(){
        System.out.println("제 목 : " + title);
        System.out.println("가 격 : " + price);
    }

    public static void main(String[] args) {
        Book book = new Book();

        Book book1 = new Book("자바 기본 개념" , 20000);
        book1.print();

        // 복제 생성자
        // 동일한 클래스의 객체를 인수로 받아 대응하는 필드에 값을 대입하는 생성자
        Book book2 = new Book(book1);
        book2.print();
        book1.print();



    }
}
/*
* result :
제 목 : 자바 기본 개념
가 격 : 20000
제 목 : 찾을 수 없음
가 격 : 0
제 목 : 자바 기본 개념
가 격 : 20000

* book2에서 this.변수 변경했을 때 book1의 변수들도 바뀔 줄 알았음.
* heap 영역에서 book1, book2 주소도 다르고 stack 영역에서 book1의 인스턴스 변수, book2의 인스턴스 변수 각각 생기기 때문에 변수를 공유하는 게 아님.
* 각각의 객체 인스턴스 생각해야함.
* + this를 사용하는 거랑 사용하지 않는 거의 차이?
*
* */