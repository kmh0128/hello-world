import java.io.*;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());//���� ���� 
        int c = Integer.parseInt(st.nextToken());// �������� ���� integer������ ��ȯ

        int[] house = new int[n];//���� �迭�� n���� ����

        for (int i=0; i<n; i++) {
            house[i] = Integer.parseInt(bf.readLine());//n���� ��ŭ �ݺ�
        }

        Arrays.sort(house);// �̺�Ž���� �߰����� �������� ������ ������ �������� ū���� �Ǿ�� ������ �������� 

        int start = 1;//1�� �ʱ�ȭ
        int end = house[n-1] - house[0];

        int result = 0;//������� 0���� �ʱ�ȭ


        while (start <= end) {
            int mid = (start+end)/2;//�����ĺ�
            int left = house[0];//���� ���� 
            int cnt = 1;//������ ���� ->���� �������� �ϳ� ��ġ�ϰ� �����ؼ� 1

            for (int i=1; i<n; i++) {
                if (house[i]-left>=mid) {
                    //house[i]-left = ����
                    //�ּҰŸ��� �߰����� mid���� ũ�� ī��Ʈ�� �������ش�
                    cnt++;
                    left = house[i];
                }
            }

            if (cnt>=c) {
                //���� ��ġ�� �����⺸�� ���� ��ġ���Ȱݿ� ���������� �̵��� �� �� ���� ���������
                result = mid;
                start = mid+1;
            } else {
                //�����⸦ c���� ���� ��ġ�ϸ� �������� �̵��� �� ª�� �������� ���������
                end = mid-1;//��ŸƮ�� 1�� �����ؼ� �ϳ��� ���ش�
            }
        }

        System.out.println(result);

    }
}
// ���� 2110 ������ ��ġ (https://www.acmicpc.net/problem/2110)
// ���� https://hidelookit.tistory.com/168
