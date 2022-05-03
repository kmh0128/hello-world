import java.util.*;
import java.io.*;

public class Main {
	 
	static long[] arr;//long Ÿ�� �迭�� ���� �̶� intŸ�����δ� �� �޾Ƴ����� ��� longŸ�Լ���
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//�Է�
		
		int N = Integer.parseInt(br.readLine());//���������� ��ȯ
		
		arr = new long[N + 1];// -1�� �ʱⰪ�� ��⶧���� �ε����� +1���ش�
 
		for(int i = 0; i < N + 1; i++) {
			arr[i] = -1;
		}
        
		arr[0] = 0;
		arr[1] = 1;
		System.out.println(Fib(N));
	}
	
	public static long Fib(int N) {
		if(arr[N] == -1) {//�Ǻ���ġ ���� �ʱⰪ -1�� �Ǻ���ġ���� ����
			arr[N] = Fib(N - 1) + Fib(N - 2);
		}
		return arr[N];
	}
 
}

}
//���� ���� https://www.acmicpc.net/problem/2748
//���� �ڷ� https://st-lab.tistory.com/123