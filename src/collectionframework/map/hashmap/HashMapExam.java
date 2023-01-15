package collectionframework.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 * HashMap id, password 일치유무 확인 예제
 *  <p>
 *  <blockquote><pre>
 *  - 저장(put) : 순서를 유지하지 않고, Key 중복 허용하지 않으며 Value 중복 허용 함
 *  </pre></blockquote>
 *  </p>
 *
 * @author  Yunjin
 * @see Collection
 * @see java.util.Map
 * @see HashMap
 * @since 1.8
 */
public class HashMapExam {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");

        Scanner scanner = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id :");
            String id = scanner.nextLine().trim();

            System.out.print("password :");
            String password = scanner.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            if(!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }

    }
}
