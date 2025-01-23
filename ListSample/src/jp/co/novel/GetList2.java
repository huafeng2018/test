package jp.co.novel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GetList2 {
	public static void main(String[] args) {

		ArrayList<Integer> foo = new ArrayList<>();

		foo.add(110);
		foo.add(30);
		foo.add(5);
		foo.add(2);
		foo.add(11);
		foo.add(90);
		foo.add(200);
		foo.add(201);

//		 Collections.sort(
//		            foo, 
//		            new Comparator<Integer>() {
//		                @Override
//		                public int compare(Integer obj1, Integer obj2) {
//		                    return obj1 - obj2;
//		                }
//		            }
//		        );
		foo.stream().sorted((x,y)-> x-y);
		System.out.println(foo);

//		List<Integer> list = new ArrayList<>();
//
//		list.add(10);
//		list.add(30);
//		list.add(5);
//		list.add(2);
//		list.add(11);
//		list.add(90);
//		list.add(190);
//		System.out.println(list);
//
//		Collections.sort(list, Collections.reverseOrder());
//		System.out.println(list);

//		ArrayList<String> list1 = new ArrayList<>();
//		list1.add("a");
//		list1.add("b");
//		list1.add("c");
//		
//		ArrayList<String> list2 = new ArrayList<>(list1);
//		
//		ArrayList<String> list3 =(ArrayList<String>)list1.clone();
//		
//		list1.set(0, "x");
//		list1.set(1, "y");
//		list1.set(2, "z");
//		
//		System.out.println("copy from list1");
//		for(String s : list1) {
//			System.out.println(s);
//		}
//		
//		System.out.println("copy To list2");
//		for(String s : list2) {
//			System.out.println(s);
//		}
//		
//		
//		System.out.println("clone");
//		for(String s : list3) {
//			System.out.println(s);
//		}

//		ArrayList<String> list1 = new ArrayList<>();
//		list1.add("a");
//		list1.add("b");
//		list1.add("c");
//		
//		ArrayList<String> list2 = list1;
//		
//		list1.set(0, "x");
//		list1.set(1, "y");
//		
//		System.out.println("copy from list1");
//		for(String s:list1) {
//			System.out.println(s);
//		}
//		
//		System.out.println("copy to list2");
//		for(String s:list2) {
//			System.out.println(s);
//		}

//		List<Integer> list = new ArrayList<>();
//		List<String> list1 = new ArrayList<>();
//		list1.add("a");
//		list1.add("b");
//		list1.add("c");
//		
//		ArrayList<String> list2 =(ArrayList<String>) list1.
//		System.out.println(list2);

//		list.add(11);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		
//		for(Integer  value : list) {
//			System.out.printf("%d", value);
//		}

//		for(Iterator it = list.iterator(); it.hasNext();) {
//			System.out.println(it.next());
//		}

//		for(int i = 0; i<list.size();i++) {
//			Integer value = list.get(i);
//			System.out.println(value);
//		}

//		int size = list.size();
//		for(int i = 0; i<size;i++) {
//			Integer value = list.get(i);
//			
//			list.remove(i);
//			
//			size = list.size();
//			System.out.println(value);
//		}

	}

}
