package io_arimethic;

import java.util.Scanner;

public class IO1008 {

	public static void main(String[] args) {
		//����: �� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//�Է�: ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		//���: ù° �ٿ� A/B�� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-9 �����̸� �����̴�.
		
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		double r = (double) a/b;
		System.out.println(r);
		
		s.close();
		
		
		
	}
}
