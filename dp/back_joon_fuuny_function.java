import java.util.*;
import java.io.*;

public class Main {
	static int[][][]dp = new int[21][21][21];//if���� 20�� ������ 20���� �����ɰ��̱� ������ 20������ �迭����
	
	static int x(int a, int b, int c) {//0<= a,b,c<=20�� ������ �ѹ��̶� ��������ִ� ���̸� ��ȯ
		if(isRange(a,b,c) && dp[a][b][c]!=0) return dp[a][b][c];
		
		if (a <= 0 || b <= 0 || c <= 0) return 1;
		// dp[a][b][c]�� ���� ����
		if (a > 20 || b > 20 || c > 20) return dp[20][20][20] = w(20, 20, 20);
		//  a, b, c�� 20�� ���� ����
		if (a < b && b < c)
			return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
	static boolen isRange(int a, int b, int c) {//a�ϰ� b �׸��� c�� �ε����� 0�Ʒ��� 20������ �ε����� �����ʰ� üũ
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}

	public static void main(String[] args) throws IOException {
		BufferReader br = new BufferReader(new InputStreamReader(System.in)); �ݺ��ؼ� �о�´�
		BufferWriter bw = new BufferWriter(new outputStreamReader(System.out)); �ݺ��ؼ� ����Ѵ�
		StringTokenizer st;//Ư�� ���ڿ��� �и��Ҷ� ����ϴ� Ŭ����
		
		while (true) {
    		st = new StringTokenizer(br.readLine());//���پ� �о����
    		
    		int a = Integer.parseInt(st.nextToken());//integer.parseInt�� ���ڿ��� ���ڷ� ��ȯ�ϴ� ���
    		int b = Integer.parseInt(st.nextToken());//nexttoken ���� ��ū�� �о�´�
    		int c = Integer.parseInt(st.nextToken());
    		
    		// a, b, c�� ��� -1�̸� ����
    		if (a == -1 && b == -1 && c == -1) break;
    		
    		// ���
    		bw.write("w(" + a + ", " + b + ", " + c + ") = "
    				+ w(a, b, c) + "\n");
    	}
        bw.flush(); //�����ִ� �����͸� ��� ��½�Ŵ
        bw.close();
        br.close();

	}

}
//�����ڷ� https://min-wachya.tistory.com/47?category=844670
// integer.parseInt https://jamesdreaming.tistory.com/125
//���� �ų��� �Լ�