import java.util.*;

public class Stack__Queue {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList(); //Queue는 interface이기 때문에 객체 생성 불가 ,따라서 Queue를 구현하는 class인 LinkedList를 이용해서 매개변수 q에 객체 담기.
		//사실상 q는 Queue의 객체 new Queue()한 것과 동일 취급 
		//매개변수 q의 객체는 LinkedList class의 함수를 사용 못 하지만 Queue interface의 Method를 사용하는 데에는 아무 문제 없음. 
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");//Queue의 함수(offer)를 사용 
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //poll은 개표하다 라는 뜻
		}
		

	}

}
