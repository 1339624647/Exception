package cn.edu.qdu.exe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			int b = input.nextInt();
			System.out.println(a / b);
//		} catch (InputMismatchException e) {
//			System.out.println("���ʹ���");
//			e.printStackTrace();// ��ӡ�����ջ
//		} catch (ArithmeticException e) {// ����쳣����catch
//			System.out.println("�������");
//			e.printStackTrace();
		} catch (Exception e) {// ����catch���Exception �����쳣
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		System.out.println("over");
	}
}
