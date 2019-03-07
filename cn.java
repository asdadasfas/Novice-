import java.util.Scanner;
	public class cn{
		public static void main(String[ ] args){
			Scanner input= new Scanner(System.in);
			System.out.println("刘珊珊的java成绩是：");
			int ment= input.nextInt();
			if(ment==100){System.out.println("父亲给买一辆汽车");
			} else if (ment>=90)	{System.out.println("母亲给买一个笔记本电脑");
			} else if (ment>=60)	{System.out.println("母亲给买一部手机");
			} else if (ment<60){System.out.println("没有礼物");
			}
}
}