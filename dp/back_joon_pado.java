import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		long T[] = new long[101]; //int������ ��� �����ϸ� ���� �� Ŀ���� ��������� �Ͼ�� �� ū���� �޾Ƶ��ϼ��ִ� longŸ������ ��ȯ
		
		T[1] = 1;//1���ε������� 5�� �ε��� ���ڱ��� ����
		T[2] = 1;
		T[3] = 1;
		T[4] = 2;
		T[5] = 2;
		
		for(int i = 6; i<=100; i++) {//6���� 100���� �Ǻ���ġ ������ ���
			T[i] = T[i-1] + T[i-5];
		}
		for(int i = 0; i<A; i++) {
			int N = sc.nextInt();
			System.out.println(T[N]);
		}
	}
}

//���� �ڷ� https://cocoon1787.tistory.com/675