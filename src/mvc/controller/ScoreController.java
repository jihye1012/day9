package mvc.controller;

import java.util.Scanner;

public class ScoreController {
	public static void main(String args[]) {
		Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("*** 학생들 성적 입력 ***");
		while(true) {
			System.out.print("** 성명 입력 **");
			String name = s1.nextLine();
			
			System.out.print("** 학번 입력 **");
			int stuId = s2.nextInt();
			System.out.print("계속해서 다음 학생의 성적을 입력하시겠습니까? (y/n)");
			String msg = s1.nextLine();
			if(msg.contentEquals("n")||msg.contentEquals("no"))
				break;
		}
		s1.close();
		s2.close();
	}

}
