package Day02;

public class Test01 {
	public static void main(String[] abc) {
		String msg = "������";
		String month = "2��";
		String day = "11��";
		String str = "�Դϴ�";
		System.out.print("��� : " +msg + month + day + str); //1��
		System.out.print("��� : " +msg + month + day + str); //2��
		System.out.println("��� : " +msg + month + day + str); //3��
		System.out.println("��� : " +msg + month + day + str); //4��
		System.out.println("��� : " +msg + month + day + str); //5��
		
		//���� �����ϱ�
		msg ="������";
		day = "12��";
		System.out.println();
		System.out.println("��� : " +msg + month + day + str);
		System.out.println("��� : " +msg + month + day + str);
	}

}
