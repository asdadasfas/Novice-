import java.util.Scanner;
public class discount{
	public static void main(String[ ] args){
		Scanner input= new Scanner(System.in);
		System.out.print("�������Ƿ��ǻ�Ա���ǣ�y��/�������ַ���");
		String men= input.next();
		System.out.println("���������ѽ��");
		double money=input.nextDouble();
		if(men.equals("y")){
			if(money>=200){
			money=money*0.75;
			System.out.println("ʵ��֧����"+money);}
			else {money=money*0.8;System.out.println("ʵ��֧��:"+money);}
		}
		else {
			if(money>=100){money=money*0.9;System.out.println("ʵ��֧����"+money);}
			else {System.out.println("ʵ��֧��:"+money);}	
		       }	
}
}