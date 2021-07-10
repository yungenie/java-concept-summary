package study.date;


import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/*
 * 대소문자 중요
 * yyyy 달력년도
 * YYYY 주의년도 (해당 주의 연도)
 * MM 월
 * dd 일
 * hh 오전/오후 시간(1-12)
 * HH 시간(0-24)
 * mm 분
 * ss 초
 * SSS 밀리초
 * */


public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Date
		Date now = new Date();
		System.out.println(now);
		
		//Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf);
		String today = sdf.format(cal.getTime());
		System.out.println(today);
		
		//yyyy vs YYYY
		System.out.println(new SimpleDateFormat("YYYY.MM.dd").format(now));
		System.out.println(new SimpleDateFormat("yyyy.MM.dd").format(now));
		
		
	}

}
