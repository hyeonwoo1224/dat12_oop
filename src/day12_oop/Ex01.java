package day12_oop;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		//�ʴ����� ��¥ ǥ��
		System.out.println(time);
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");
		String srt = s.format(time);
		System.out.println(srt);
		
		Date d = new Date();
		//�̱� ǥ���
		System.out.println(d);
		System.out.println("fomat(d) : " + s.format(d));
		//����ȯ���ִ� .format
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " + cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
	}
}
