package day12_oop;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ ���� ��ɾ� �Է�");
		String s = input.next();
		
		ProcessBuilder pro = new ProcessBuilder(s);
		
		pro.start();
		//���콺 tryŬ���ϸ� ������ ���� ��ɾ� �Է� â�� ����
	}
}
