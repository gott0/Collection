import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		       //  ��key: �ߺ� �� ��
		       //  |      ��value: �ߺ�����(intŸ�Ե� ���������� ���׸����� String����)
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); // key �ߺ� �� �׻� ������ key�� value�� ��� ��
		
		//keySet() : Ű�� ��ü�� ��ȯ�Ѵ�.
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
//        �� keySet()���� ��ȯ �� Ű������ �о�´�.(keySet()�� Ű���� �з�,iterator()�� �׷� Ű������ �д� ����)
		
		/*Iterator�� �ڹ��� �÷��� �����ӿ�ũ���� �÷���(Set, List, Map)�� ����Ǿ� �ִ� ��ҵ��� �о���� ����� ǥ��ȭ�� ���̴�.
		  
		  hasNext() : �о�� ��Ұ� �����ִ��� Ȯ���ϴ� �޼ҵ��̴�. ��Ұ� ������ true, ������ false
		     next() : ���� �����͸� ��ȯ�Ѵ�.
		   remove() : next()�� �о�� ��Ҹ� �����Ѵ�.*/
	
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		
		for(String key: map.keySet()){// ���� for���� Ȱ���� ���
			System.out.println(key);
		}
		
		System.out.println("=====================");
		
		//values() : values ��ü�� ��ȯ�Ѵ�.
		Collection<String> values = map.values();
		Iterator<String> itV = values.iterator();

		while(itV.hasNext()) {
			String value = itV.next();
			System.out.println(value);
		}
		
		System.out.println("=====================");
		
		       // �� key,value�� ��� ��ȯ  = Map.Entry<>
		Set<Map.Entry<String,String>> entry = map.entrySet();
		Iterator<Map.Entry<String,String>> itE = entry.iterator();
		
		while(itE.hasNext()) {     //  �� key, value�� �ּҰ�
			Map.Entry<String, String> ent = itE.next();
			String key = ent.getKey();
			String value = ent.getValue();
			
			System.out.println("[key]" + key +", [value]" + value);
		}
		
		System.out.println("=====================");

		for(Map.Entry<String, String> ent : map.entrySet()){ // ���� for���� Ȱ���� ���
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[key]" + key +", [value]" + value);
		}
		
//		System.out.println(map);
//		
//		Scanner sc = new Scanner (System.in);
//		
//		while(true) {
//			System.out.println("���̵� �Է�: ");
//			String id = sc.next();
//			
//			System.out.println("��� �Է�: ");
//			String password = sc.next();
//			
//			//get(key) -> value�� ��ȯ
//			//get("myid") -> "1234"
//			//containKey(key) -> �������� Ȯ��(truw,false)
//			
//			if(!map.containsKey(id)) {
//				System.out.println("���̵� �������� �ʽ��ϴ�. �ٽ��Է�");
//				continue;
//			}else {   //��value�� �޾ƿ�(���ڿ�)
//				if(!(map.get(id)).equals(password)) { // => StringŸ���� �񱳴� .equals()���
//					System.out.println("����� �������� �ʽ��ϴ�. �ٽ��Է�");
//				}else {
//					System.out.println("�α��� ����");
//					break;
//				}
//			}
//		} //while end
		
//		map.remove("myid");
//		System.out.println(map);
		
		
		
		
		/*Iterator

		- Vector<E>, ArrayList<E>,LinkedList<E> �� ��ӹ޴� �������̽� 
		-����Ʈ ������ �÷��ǿ��� ����� �����˻��� ���� �޼ҵ� ����
		- iterator()�� ȣ���ϸ� iterator ��ü ��ȯ
		-�ڹ��� �÷��ǿ� ����Ǿ� �ִ� ��ҵ��� �о���� ����� �������̽�
		�� ���� �÷������κ��� ������ ���� �������̽� �̴�.
	 
		iterator�� ���� ������ ���� �ִ�.
		-�츮�� å�� �����ϴ� å��(�÷���)�� �ְ�, �װ����� å(�÷��� �ȿ� �� ��ü)�� �ִ�.
		-�� å���� ������ �缭(iterator)�� �����Ѵ�. 
		-�缭�� �ܼ� ������ �༮�̶� å�� ó������ ������ �ѹ��� �ϳ��� �ۿ� ������ �´�. 

		iterator method
		1) hasNext(): ���� ��ҿ� �о� �� ��Ұ� �ִ��� Ȯ�� �ϴ� �޼ҵ� ������ true, ������ false �� ��ȯ�Ѵ�.
		2) next(): ���� ��Ҹ� �����´�. 
		3) remove(): next()�� �о�� ��Ҹ� �����Ѵ�.
		�޼ҵ��� ȣ�� ������ hasNext() -> next() -> remove() �̴�.*/
		
	} //main end

}//class end
