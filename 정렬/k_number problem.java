import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];//answer�� ũ�Ⱑ Ŀ�ǵ�� ���� Ŀ�ǵ� ���̸�ŭ �����ְ� �迭������ ��ȯ
        for(int i=0;i<commands.length;i++){
            int x,y,z;
            x=commands[i][0];//�������� i�� x�� �����ؼ� 
            y=commands[i][1];//j�� y�� �޴´�
            z=commands[i][2];//k�� z�� �޴´�
            int[] temp = Arrays.copyOfRange(array,x-1,y);//�����ڷῡ�� copyOfRange �޼ҵ� Ȱ����� �����ؼ� ������ ����
            Arrays.sort(temp);//temp�� �ű� ������ �������� ����
            answer[i]=temp[z-1];
        }
        return answer;
    }
}
//���α׷��ӽ����� https://programmers.co.kr/learn/courses/30/lessons/42748?language=java
//�����ڷ� https://kkmdailylog.tistory.com/entry/AlgorithmJAVA%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4K%EB%B2%88%EC%A7%B8-%EC%88%98