package day12_oop;

import java.util.HashMap;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("�޸���","notepad");
		map.put("����","calc");
		map.put("�׸���","mspaint");
		
		System.out.println(map);
		
		System.out.println("���� ��ɾ� �Է�");
		String key = sc.next();
		if(map.containsKey(key)) {
			ProcessBuilder pro =
					new ProcessBuilder((String)map.get(key));
			
			pro.start();
		
		}else {
			System.out.println("�ش� ��ɾ�� �������� �ʽ��ϴ�");
		}
	}
}
