import java.util.*;

public class Stack__Queue {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); //Queue�� interface�̱� ������ ��ü ���� �Ұ� ,���� Queue�� �����ϴ� class�� LinkedList�� �̿��ؼ� �Ű����� q�� ��ü ���.
		//��ǻ� q�� Queue�� ��ü new Queue()�� �Ͱ� ���� ��� 
		//�Ű����� q�� ��ü�� LinkedList class�� �Լ��� ��� �� ������ Queue interface�� Method�� ����ϴ� ������ �ƹ� ���� ����. 
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");//Queue�� �Լ�(offer)�� ��� 
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //poll�� ��ǥ�ϴ� ��� ��
		}
		

	}

}
