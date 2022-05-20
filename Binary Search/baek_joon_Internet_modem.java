import java.io.*;
import java.util.*;

public class Main {
    static int N,C;
    static int [] house;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        house = new int[N];
        for(int i = 0; i < N; ++i)
        {
            house[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(house);//�̺�Ž���� �߰������� ������ �۰� �������� Ŀ�ߵǱ⶧���� �������� ����

        int left = 1; //�ּ� ����
        int right = house[N-1] - h_point[0]; //�ִ� ����

        while(left <= right)
        {
            int mid = (left + right) / 2;//�߰��� 

            if(set(mid) >= C) left = mid+1;//�ݺ��� ������ �߰����� mid������ ��ġ�Ѱ� ������ ������ ������ ������ ������ȴ�
            else right = mid-1;
        }
        System.out.print(left-1);//Ż�� ����
    }
    static int set(int dist)
    {
        int cur = house[0];
        int cnt = 1;
        for(int i = 1; i < N; ++i)
        {
            if((house[i] - cur) >= dist)
            {
                cur = house[i];//cur�� ���� �߰��ɶ����� ��� �ǳ��� �����ϴ� ���� ����
                cnt++;
            }
        }
        return cnt;
    }
}

//���� https://www.acmicpc.net/problem/2110
//�����ڷ� https://intrepidgeeks.com/tutorial/install-baizhun-2110-router-java-java