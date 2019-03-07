package cn.java;
import java.util.Scanner;
public class Lucky {
	public static void main(String[] args){
		System.out.println("请输入4位会员卡号：");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		System.out.println("会员卡号各位之和：23\n是幸运客户吗?");
		int kilobit=number/1000;
		int hundreds=(number%1000)/100;
		int ten=(hundreds%100)/10;
	}
}
