package cn.bjsxt.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * ����List�еĻ�������
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		List list = new ArrayList();
		//�����ǲ�ѯ��죬�����޸�Ч�ʵ�
		//��������޸�Ч�ʸߣ���ѯ��
		//ArrayList:�ײ�ʵ��ʱ���顣�̲߳���ȫ��Ч�ʸߡ����ԣ���ѯ�졣�޸ĺ�ɾ����
		//LinkedList:�ײ�ʵ��ʱ�������ԣ���ѯ�����޸ĺͲ�ɾ����
		//vector:�̰߳�ȫ�ģ�Ч�ʵ�
		list.add("aaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);
	
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		

		System.out.println(list.size());

		List list2= new ArrayList();
		list2.add("bbb");
		list2.add("ccc");
		list.add(list2);
		
		
		//��˳��Ĳ���
		String str = (String)list.get(0);
		System.out.println(str);
		
		list.set(1, "abcd");
		list.remove(0);
		
		}

}

class Dog{
	
}
