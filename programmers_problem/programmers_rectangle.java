import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){//���� 
            for(int j = 0; j < m; j++){//����
                System.out.print("*");//���� ����ϸ鼭 ��� ���� �ش����ŭ �ݺ�
            }//ó���� ���ο� ���θ� �ݴ�� �Է��ؼ� �����ڷẸ�� ����
            System.out.println();
        }
    }
}

//���α׷��ӽ� ���� https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
//���� �ڷ� https://blog.naver.com/PostView.nhn?blogId=yongyos&logNo=221474336211