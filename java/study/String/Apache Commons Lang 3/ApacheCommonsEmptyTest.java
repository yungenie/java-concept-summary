package lai.module.starter.test;

import org.apache.commons.lang3.StringUtils;

/**
 * Apache Commons Lang 3
 * StringUtils 클래스 예제
 *
 * @author  Yunjin
 * @see     org.apache.commons.lang3.StringUtils#isEmpty(CharSequence)
 * @since   JDK1.8
 */
public class ApacheCommonsEmptyTest {

  public static void main(String[] args) {

    String str = "";

    Boolean result = StringUtils.isEmpty(str) ? true : false;
    System.out.println(result);
  }
}
