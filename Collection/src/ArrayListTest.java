import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;


public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList(); //������� , �ߺ�����
//		
//		list.add("1");// ���������� �־�ߵȴ�. (String�� ������)
//		list.add("1");//�ߺ�
//		list.add(new integer(1)); //wrapper(�⺻��-> ������)
//		list.add("2");
//		list.add(2); // �⺻���� ���� �� �Ǵµ� ������Ʈ Ÿ���� ����ȯ�� �ǹǷ� �̷��� ��� �ȴ�.
		   // ���⺻ ������Ʈ Ÿ��
//		
//		list.add("1");  //String -> Object ����ȯ�� �߻�
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
		
//		String str = (String)list.get(0); //Object -> String
//		System.out.println(str);
		
//		int sum = 0;
//		
//		for(Object obj : list) {
//			String str = (String)obj;
//			System.out.println(str);
//			int num = Integer.parseInt(str);
//			sum += num;       // �� ���ڿ� -> ����
//		}
//		
//		System.out.println("sum= " +sum);
//		
//		                //  ��ArrayList�� �迭 ũ��(����) , length�δ� �ȵ�
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i)); //12345
//		}                          // �� (ArrayList�������� �о���� �޼ҵ�)
//		
//		list.remove(3); // 4�� ����
//		
//		for(int i=0;i<list.size();i++) { 
//			System.out.println(list.get(i)); //1235
//		}
//		
//		
//		System.out.println("=========");
		
		
		
//		Stack st = new Stack();   
//		                           //  |  ����>
//		                           //  V  | 
//		st.push("1");              // |  3  |
//		st.push("2");              // |  2  |
//		st.push("3");              // |  1  |
//		                           // ��-----��  Stack�� �ڷᱸ�� : 1-2-3 ������ ä������ 3-2-1������ �������
//		
//		try {                        // �����ؿ��� �ϳ��� �ҷ��ͼ� ������ �ϳ��� ����ִ� �޼ҵ�(Stack�������� �о���� �޼ҵ�) 
//		System.out.println((String) st.pop());
//		System.out.println((String) st.pop());
//		System.out.println((String) st.pop());
//		System.out.println((String) st.pop());
//		}catch(EmptyStackException e) {
//			System.out.println("Stack�� ����ֽ��ϴ�.");  //����ó��
//		}
		
		
//		while(!st.empty()){
//			System.out.println((String) st.pop());
//		}

//		ArrayList list = new ArrayList();
//
//		
//		list.add("1");  
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//				
//		//iterator (�ݺ��� ����)
//		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()){ //������ ���� ���� Ȯ��
//			String str = (String)it.next(); // ���� ������ ���� ����
//			System.out.println(str);
//		}
				
				
     //���׸� : �÷��� ��ü�� ������ Ÿ���� �����Ѵ�.
		
		//ArrayList<E> list = new ArrayList<>();
//		ArrayList<String> list = new ArrayList<String>();
//
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		list.get(0);
//		
//		Iterator<String> it = list.iterator();
//		
//		while(it.hasNext()){ 
//			String str = it.next(); 
//			System.out.println(str);
//		}
		
		
	
    //Set : ���� X, �ߺ�X
	
//		HashSet set = new HashSet();
//		// �� hash: ���� �����͸� ���� ã�� �� �ִ� ������ ����        ��
//		// �� Set : �������� �����͸� �����鼭 �ߺ��� ������� ���� �� ���� ������
//		
//		set.add("1"); //String Ÿ��
//		set.add("2");
//		set.add("1"); //String Ÿ��
//		set.add("4");
//		set.add(new Integer(1)); //������ Ÿ���� �޶� �ߺ����� ġ�� ���� (int Ÿ��)
//		
//		System.out.println(set);
		
//		for(Object obj : set) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
//		HashSet<String> set = new HashSet<String>();
//		set.add("1"); 
//		set.add("2");
//		set.add("1"); 
//		set.add("4");
//		set.add("5");
//		
//		Iterator<String> it = set.iterator();
//
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
		
		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int[][] bingo = new int [5][5];
//		
//		for(int i=0; set.size() < 25; i++) {
//			set.add((int)(Math.random()*50)+1);
//		}
//		
//		//System.out.println(set);
//		
//		ArrayList list = new ArrayList(set); // ���ñ��
//		Collections.shuffle(list);           //   " 
//		
//		Iterator<Integer> it = list.iterator();
//		
//		for(int i=0; i<bingo.length; i++) {
//			for(int j=0; j<bingo[i].length; j++) {
//				bingo[i][j] = it.next();
//			}
//		}
//		
//		for(int i=0; i<bingo.length; i++) {
//			for(int j=0; j<bingo[i].length; j++) {
//				System.out.print(bingo[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		//TreeSet : �ݵ�� ������ ���Ǵ� �ش� Ŭ���� �ȿ��� ���� ������ �������̵� �Ǿ��־���Ѵ�.
		//implements Comparable (integer, String ....)
		
//		TreeSet<Integer> set = new TreeSet<Integer>(); //TreeSet = ���� ���ĵǾ�����.
//		set.add(new Integer(2));
//		set.add(2);
//		set.add(5);
//		set.add(1);
//		set.add(4);
//		set.add(3);
//		
//		System.out.println(set);
//		
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			Integer intg = (Integer)it.next();
//			System.out.println(intg);
//		}
		
		
		
		TreeSet<Student> set = new TreeSet<Student>();
		
		Student s1 = new Student("kim",1,1,10,10,10);
		Student s2 = new Student("pim",3,1,10,10,10);
		Student s3 = new Student("aim",6,1,10,10,10);
		Student s4 = new Student("sim",9,1,10,10,10);
		Student s5 = new Student("fim",4,1,10,10,10);

		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Iterator<Student> it = set.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.toString());
		}
	}
	/*
	<���׸�>
	1. ���׸��̶�?
	- Ŭ���� ���ο��� ����� ������ Ÿ���� �ܺο��� �����ϴ� ���
	- Ŭ������ ���� �� ���� info�� ������ Ÿ���� Ȯ������ �ʰ� �ν��Ͻ��� ������ �� ������ Ÿ���� �����ϴ� ����� ���׸�

	2. ���׸��� ����ϴ� ����
	������ �ܰ迡�� ������ ����ȴ�.
	�ߺ��� ���ſ� Ÿ�� �������� ���ÿ� �߱�

	3. ���׸��� Ư��
	- ������ ���׸�: ������ ���׸��� ����� ���� <T, S>�� ���� ������ ����Ѵ�. ���⼭ T�� S ��� ��� ���ڸ� ����ص� �ȴ�. ������ �������� ���(convention)�� �ֱ�� �ϴ�.- �⺻ ������ Ÿ�԰� ���׸�: ���׸��� ���� ������ Ÿ�Կ� ���ؼ��� ����� �� �ִ�. �⺻ ������ Ÿ�Կ����� ����� �� ����. new Integer�� �⺻ ������ Ÿ���� int�� ���� ������ Ÿ������ ��ȯ���ִ� ������ �Ѵ�. �̷��� Ŭ������ ����(wrapper) Ŭ������� �Ѵ�.

	4. ���׸��� ����
	5. �޼ҵ忡 ����
	6. ���׸��� ����
	- extends
	���׸����� �� �� �ִ� ������ Ÿ���� Ư�� Ŭ������ �ڽ����� ������ �� �ִ�.
    */
}
