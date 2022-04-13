import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();//num���� ���� ���� ������ �о���� ����
		
		int[][] memo = new int[41][2];//40��° ������ ���ؾߵǴϱ� �ε����� 0������ �����̹Ƿ� 41 
		
		memo[0][0] = 1;//�Ѵ� 0�� 1�� ������ ��Ȳ�� ����
		memo[0][1] = 0;
		memo[1][0] = 0;
		memo[1][1] = 1;
		
		int n;
		int[] idx = new int[num]; // �Է��� n�� �ε��� ���·� ����. (��¿�)
		for(int i = 0; i < num; i++) {
			n = sc.nextInt();
			idx[i] = n;
			if(n == 0 || n == 1) // n�� 0�̳� 1�� �̸� ���������Ƿ� continue
				continue;
			for(int j = 2; j <= n; j++) {// 2���ʹ� ���� �������� �ʿ䰡������ n��ŭ �ݺ�
				memo[j][0] = memo[j-1][0] + memo[j-2][0];
				memo[j][1] = memo[j-1][1] + memo[j-2][1];
			}
		}
		
		for(int i = 0; i < num; i++)
			System.out.println(memo[idx[i]][0]+" "+memo[idx[i]][1]);
		
		sc.close();//������ ���������� ���� ������ sc.close�� ����
		return;
	}
}
//�����ڷ� https://binghedev.tistory.com/9
//�����ڷ� scanner https://mine-it-record.tistory.com/103
                //  https://mine-it-record.tistory.com/103