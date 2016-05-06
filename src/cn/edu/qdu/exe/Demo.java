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
//			System.out.println("类型错误");
//			e.printStackTrace();// 打印错误堆栈
//		} catch (ArithmeticException e) {// 多个异常多重catch
//			System.out.println("输入错误");
//			e.printStackTrace();
		} catch (Exception e) {// 多重catch后加Exception 所有异常
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		System.out.println("over");
	}
}
