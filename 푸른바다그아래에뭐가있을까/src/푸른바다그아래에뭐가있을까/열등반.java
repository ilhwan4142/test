package Ǫ���ٴٱ׾Ʒ�������������;

import java.util.Scanner;

public class ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, result; //���� ���ڸ� ���� �Ű�������, ����� ������ �Ű����� ����
		System.out.println("�����⸦ �����մϴ�.");
		Scanner sc = new Scanner(System.in);
		
		try { //Ʈ���̹����� ���� �� ������ ���� �� �ִ� �κ��� �������
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			result = DevVal(num1,num2); //DevVal �޼ҵ� ȣ��� ���� ���� ������
			System.out.println(num1 + " / " + num2 + " = " + result + "�Դϴ�."); //�������� ������ ����� ��� �ٸ� ����� �����
		}
		
		catch (java.lang.ArithmeticException e) { //0���� ������ �� ��� �Ұ����� �������� �����
			System.out.println("0�� ���� �� �����ϴ�.");
		}
		
		catch (java.util.InputMismatchException e) { //���� �ܿ� �ٸ� ���� �Է��� ��� ����� �� ���ڸ� �Է��϶�� �����
			System.out.println("����� �� ���ڸ� �Է����ּ���.");
		}
		
		finally {
			System.out.println("��");
		};
	}
	
	static int DevVal(int num1, int num2) { //�Է� ���� �� ���� ������ �޼ҵ�
		int result;
		result = num1 / num2;
		return result;
	}
}