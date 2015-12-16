package collectionExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* Program to FindDuplicateItems in ArrayList Data Structure using HashSet 
 * 
 * Output::
 * Original List:: [0, 0, 2, 2, 4, 4, 6, 6, 8, 8, 1, 2, 9]
 * Duplicate Items in List:: [0, 2, 4, 6, 8]
 * */
public class FindDuplicateItems {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			list.add(i);
			list.add(i++);
		}
		list.add(1);
		list.add(2);
		list.add(9);
		
		System.out.println("Original List:: " + list);
		System.out.println("Duplicate Items in List:: " + findDuplicateItems(list));
	}

	private static HashSet<Integer> findDuplicateItems(List<Integer> list) {
		HashSet<Integer> dupList = new HashSet<Integer>();
		HashSet<Integer> listSet = new HashSet<Integer>();
		
		for (Integer val:list) {
			if (!listSet.add(val)) {
				dupList.add(val);
			}
		}
		return dupList;
	}
}
