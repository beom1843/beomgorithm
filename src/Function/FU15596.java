package Function;

public class FU15596 {
	//Java: long sum(int[] a); (Ŭ���� �̸�: Test)
	//a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 
	//(0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
	//���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��

	
	//�迭�� ���̰� ������ ���� �ʾƵ� ����� �� ����
		long sum(int[] a){
			long res = 0;
			for(int i =0;i<a.length ; i++){
				res += a[i];
			}
			return res;
		
		
	}
}
