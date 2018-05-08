package cn.bjsxt.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 测试List中的基本方法
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		List list = new ArrayList();
		//数组是查询最快，插入修改效率低
		//链表插入修改效率高，查询慢
		//ArrayList:底层实现时数组。线程不安全，效率高。所以，查询快。修改和删除慢
		//LinkedList:底层实现时链表。所以，查询满，修改和插删除快
		//vector:线程安全的，效率低
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
		
		
		//跟顺序的操作
		String str = (String)list.get(0);
		System.out.println(str);
		
		list.set(1, "abcd");
		list.remove(0);
		
		}

}

class Dog{
	
}
