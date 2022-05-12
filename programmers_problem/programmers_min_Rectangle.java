class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;//������ ���̸� 0�ʱ�ȭ
        int height = 0;//������ ���̸� 0���� �ʱ�ȭ
        
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] >= sizes[i][1]) {//�տ� �ε����� �� ũ�ų� ������
                width = Math.max(sizes[i][0], width);//���ΰ� �� ū �ε�����
                height = Math.max(sizes[i][1], height);//���ΰ� �� ���� �ڿ� �ε�����
            } else {
                width = Math.max(sizes[i][1], width);//�ݴ�� �ڿ� �ε����� �� ũ�� ���ΰ� ��ū �ε�����
                height = Math.max(sizes[i][0], height);
            }
        }
        
        answer = width * height;//���� ���ϱ� ����
        
        return answer;
    }
}

//�����ڷ� https://discover.tistory.com/47
//���α׷��ӽ� ���� https://programmers.co.kr/learn/courses/30/lessons/86491?language=java