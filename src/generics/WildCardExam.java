package generics;

import java.util.ArrayList;
/**
 * Generics 클래스, 메서드 매개변수 와일드카드 <?> 예제
 *  <p>
 *  <blockquote><pre>
  *- 하나의 참조 변수로 대입된 타입이 다른 객체를 참조 가능
  *- <? extends T> T와 그 자손들만 가능. 와일드 카드의 상한 제한.
  *- <? super T> T와 그 조상들만 가능. 와일드 카드의 하한 제한.
  *- <?> 제한 없음. 모든 타입 가능 <? extends object>와 동일
  *- 메서드의 매개변수에 와일드 카드를 사용
 *  </pre></blockquote>
 *  </p>
 *
 * @author  Yunjin
 * @since 1.8
 */
class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {
        list.add(item);
    }
    T get(int i) {
        return list.get(i);
    }
    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}

class Fruit2 {
    public String toString() {
        return "Fruit";
    }
}
class Apple2 extends Fruit2	{
    public String toString() {
        return "Apple";
    }
}
class Grape2 extends Fruit2	{
    public String toString() {
        return "Grape";
    }
}

class Juice {
    String name;
    Juice(String name) {
        this.name = name + "Juice";
    }
    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
        String tmp = "";

        for(Fruit2 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

public class WildCardExam {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();

        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        appleBox.add(new Apple2());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}
