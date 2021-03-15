package p2;

import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {

		TreeSet<String> ts1 = new TreeSet<>();

		ts1.add("hyyy");
		ts1.add("tahyyy");
		ts1.add("tbhyyy");
		ts1.add("kohyyy");
		ts1.add("rdgfhyyy");
		ts1.add("ahyyy");
		ts1.add("aahyyy");
		ts1.add("aehyyy");

		for (String ele : ts1) {
			System.out.println(ele);
		}

		TreeSet<Integer> ts2 = new TreeSet<>();

		ts2.add(45);
		ts2.add(5);
		ts2.add(145);
		
		for (Integer ele : ts2) {
			System.out.println(ele);
		}

	}

}
