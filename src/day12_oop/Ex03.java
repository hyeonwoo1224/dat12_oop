package day12_oop;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("윈도우 실행 명령어 입력");
		String s = input.next();
		
		ProcessBuilder pro = new ProcessBuilder(s);
		
		pro.start();
		//마우스 try클릭하면 윈도우 실행 명령어 입력 창이 켜짐
	}
}
