import java.util.Scanner;
public class discount{
	public static void main(String[ ] args){
		Scanner input= new Scanner(System.in);
		System.out.print("请输入是否是会员：是（y）/否（其他字符）");
		String men= input.next();
		System.out.println("请输入消费金额");
		double money=input.nextDouble();
		if(men.equals("y")){
			if(money>=200){
			money=money*0.75;
			System.out.println("实际支付："+money);}
			else {money=money*0.8;System.out.println("实际支付:"+money);}
		}
		else {
			if(money>=100){money=money*0.9;System.out.println("实际支付："+money);}
			else {System.out.println("实际支付:"+money);}	
		       }	
}
}