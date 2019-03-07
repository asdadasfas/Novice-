import java.util.Scanner;
	public class member{
		public static void main(String[ ] args){
		Scanner input= new Scanner(System.in);
		System.out.println("超市购物管理系统>客户信息管理>添加客户信息");
		System.out.println("请输入会员号（4位数）：");
		int custNo= input.nextInt();//会员号
		System.out.println("请输入会员生日（月/日<用两位数表示>）:");
		String cusBirth=input.next();
		System.out.println("请输入积分：");
		String cusScore=input.next();
		if(custNo>=1000 && custNo<=9999)
		{System.out.println("已录入的会员信息:"+"\n"+custNo+"\t"+cusBirth+"\t"+cusScore);
		} else {System.out.println("信息录入失败");
		}
}	
}