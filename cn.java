import java.util.Scanner;
	public class cn{
		public static void main(String[ ] args){
			Scanner input= new Scanner(System.in);
			System.out.println("��ɺɺ��java�ɼ��ǣ�");
			int ment= input.nextInt();
			if(ment==100){System.out.println("���׸���һ������");
			} else if (ment>=90)	{System.out.println("ĸ�׸���һ���ʼǱ�����");
			} else if (ment>=60)	{System.out.println("ĸ�׸���һ���ֻ�");
			} else if (ment<60){System.out.println("û������");
			}
}
}