package cn.java;
import java.util.Scanner;
public class Lucky {
	public static void main(String[] args){
		System.out.println("������4λ��Ա���ţ�");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		System.out.println("��Ա���Ÿ�λ֮�ͣ�23\n�����˿ͻ���?");
		int kilobit=number/1000;
		int hundreds=(number%1000)/100;
		int ten=(hundreds%100)/10;
	}
}
