import java.io.*;

public class Main {
	static Integer[] dp; //�޸����̼��� �迭 ����

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�Է��� �޴´�
		
		int N = Integer.parseInt(br.readLine());//int������ ��ȯ
		
		dp = new Integer[N + 1];//�ε����� �ϳ� ����
		dp[0] = dp[1] = 0;
		
		System.out.print(recur(N));
		 
	}
 
	static int recur(int N) {//����Լ� ����
 
		if (dp[N] == null) {
			// 6���� �������� ��� 
			if (N % 6 == 0) {//1�� ���°�� 3�� ���� ��� 2�� �������
				dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
			}
			// 3���θ� �������� ��� 
			else if (N % 3 == 0) {//3���� ���� ��� 1�� �����
				dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
			}
			// 2�θ� �������� ��� 
			else if (N % 2 == 0) {//2�� ���� ��� 1�� �����
				dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
			}
			// 2�� 3���� ���������� �ʴ� ���
			else {
				dp[N] = recur(N - 1) + 1;
			}
		}
		return dp[N];
	}
 
}


//���� �ڷ� https://st-lab.tistory.com/133
//���� ���� https://www.acmicpc.net/problem/1463
