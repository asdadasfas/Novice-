import java.util.Scanner;
	public class member{
		public static void main(String[ ] args){
		Scanner input= new Scanner(System.in);
		System.out.println("���й������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		System.out.println("�������Ա�ţ�4λ������");
		int custNo= input.nextInt();//��Ա��
		System.out.println("�������Ա���գ���/��<����λ����ʾ>��:");
		String cusBirth=input.next();
		System.out.println("��������֣�");
		String cusScore=input.next();
		if(custNo>=1000 && custNo<=9999)
		{System.out.println("��¼��Ļ�Ա��Ϣ:"+"\n"+custNo+"\t"+cusBirth+"\t"+cusScore);
		} else {System.out.println("��Ϣ¼��ʧ��");
		}
}	
}