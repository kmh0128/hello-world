import java.util.Arrays;//�ڹ� ��ƿ ���̺귯������ �迭�� �Է¹޽��ϴ�.

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);//�ε����� �Է¹޽��ϴ�.
        Arrays.sort(completion);//�ΰ��� �κ��� �ٸ��κ��� �ִ��� Ȯ���մϴ�.
		
        
        int i=0;
        for(i=0; i<completion.length; i++)//�ڽ��� ���⼭ ó���� �� ū �ε����� �����ؼ� ������ �߻��ߴµ� �����ڷῡ ���� �� ª�� �ε����� �����ؾߵǴ°��� �����Ͽ����ϴ�.
	}
            if(!participant[i].equals(completion[i]))
                break;
        
        return participant[i];/���⼭�� ������ �Ȱɷ����� ��� �������� ������ �����ڰ� �������� ���Ѽ����Դϴ�
		//���⼭�� �ڽ��� ���� �ݺ������� �� �ɷ������� �߸� �Է¹޾Ұ� ���� �ڷḦ �̿��� �����Ͽ����ϴ�.
    }
}
//���� �ڷ�:https://www.youtube.com/watch?v=_2yD46UxSso&t=951s
//���� �ڷ�:https://programmers.co.kr/learn/courses/30/lessons/42576?language=java