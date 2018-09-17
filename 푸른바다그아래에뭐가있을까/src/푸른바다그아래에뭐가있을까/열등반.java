package 푸른바다그아래에뭐가있을까;

import java.util.Scanner;

public class 열등반 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, result; //나눌 숫자를 받을 매개변수와, 결과를 저장할 매개변수 선언
		System.out.println("나누기를 실행합니다.");
		Scanner sc = new Scanner(System.in);
		
		try { //트라이문에다 실행 중 오류가 생길 수 있는 부분을 집어넣음
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			result = DevVal(num1,num2); //DevVal 메소드 호출로 받은 수를 대입함
			System.out.println(num1 + " / " + num2 + " = " + result + "입니다."); //오류없이 연산이 진행될 경우 바른 결과를 출력함
		}
		
		catch (java.lang.ArithmeticException e) { //0으로 나누려 할 경우 불가능한 연산임을 출력함
			System.out.println("0은 나눌 수 없습니다.");
		}
		
		catch (java.util.InputMismatchException e) { //숫자 외에 다른 것을 입력할 경우 제대로 된 숫자를 입력하라고 출력함
			System.out.println("제대로 된 숫자를 입력해주세요.");
		}
		
		finally {
			System.out.println("끗");
		};
	}
	
	static int DevVal(int num1, int num2) { //입력 받은 두 수를 나누는 메소드
		int result;
		result = num1 / num2;
		return result;
	}
}