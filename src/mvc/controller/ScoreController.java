package mvc.controller;

import java.util.Scanner;

public class ScoreController {
	public static void main(String args[]) {
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("*** �л��� ���� �Է� ***");
		while(true) {
			System.out.print("** ���� �Է� **");
			String name = s1.nextLine();
			
			System.out.print("** �й� �Է� **");
			int stuId = s2.nextInt();
			System.out.print("����ؼ� ���� �л��� ������ �Է��Ͻðڽ��ϱ�? (y/n)");
			String msg = s1.nextLine();
			if(msg.contentEquals("n")||msg.contentEquals("no"))
				break;
		}
		s1.close();
		s2.close();
	}

}
