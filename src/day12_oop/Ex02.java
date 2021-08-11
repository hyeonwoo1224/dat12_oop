package day12_oop;

public class Ex02 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println( i );
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				
			}
		}
		System.out.println("다음 문장들 실행");
	}
}
