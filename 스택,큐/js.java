public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {//i���� �ݾ� ���θ� �ݺ��Ѵ�
            for (int j = i + 1; j < prices.length; j++) {//��ȭ�� �ݾװ� �񱳸� �ϱ� ���� +1
            	answer[i]++;//ī��Ʈ ���ִ� �Է��� if�� �Ŀ� �Է����༭ ������ ���µ� �����ڷẸ�����
            	if (prices[i] > prices[j])//���� i��°�� j���� ũ�� ������ ������ �����̺�� break
                    break;
                
            }
        }
        return answer;
    }
}


//���α׷��ӽ� ����:https://programmers.co.kr/learn/courses/30/lessons/42584?language=java
//�����ڷ�:https://velog.io/@hong-brother/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%A3%BC%EC%8B%9D%EA%B0%80%EA%B2%A9java-%EA%B3%A0%EB%93%9D%EC%A0%90-kit