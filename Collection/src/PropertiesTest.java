import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		//Properties : key , value -> String�� ��� ����
//		Properties prop = new Properties();
//
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
		
//		String value = prop.getProperty("myid");
//		System.out.println(value);
		
//		Enumeration e = prop.propertyNames();		
//		
//		while(e.hasMoreElements()) { //���� üũ�ϴ� ��
//			String element = (String)e.nextElement(); // key��
//			String value = prop.getProperty(element); // value��
//			System.out.println(value);
//		}
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("input.txt"));
		}catch(IOException e) {
			System.out.println("������ ������ �����ϴ�.");
			System.exit(0); //���α׷� ���� ����
		} //������ �ҷ� �� �� ����� ���� �̸� ó���ϴ� �۾� 
		
		String name = prop.getProperty("name"); // Hong kil Dong
		String[] data = prop.getProperty("data").split(","); 
		                                     //    �� ,�� �������� ���� �ɰ���  ��ȯ
		int max = 0;
		int min = 0;
		int sum = 0;
		

//		�̸�
//		max
//		min
//		sum
//		���
		 
		//���ڿ� -> ���� : Integer.parseInt(���ڿ�)
		//���� -> ���ڿ� : String.valurOf(����)
		
		for(int i=0; i<data.length; i++) {
			int value = Integer.parseInt(data[i]); // ���ڿ��� ���ڷ� �ٲٴ� �۾�
			
			if( i== 0) {
				max = min = value;
			}
			
			if(max < value) {
				max = value;
			}else if (min>value) {
				min= value;
			}
			
			sum += value;
			
			
			double avg = (double)sum / data.length;
			
			System.out.println(name);
			System.out.println(max);
			System.out.println(min);
			System.out.println(sum);
			System.out.println(avg);
			
		}
		
		
		
		
		
		
		
		
	}//main end

}
