import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		
		 
		Vector<String> v = new Vector<>();
		v.add("Oracle");
		v.add("Microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("IBM");
		System.out.println("--Iterating over vector using for each");
		for (String elem : v)
			System.out.println(elem);

		System.out.println("--Iterating over vector using iterator");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		LinkedList<String> lst = new LinkedList<>();
		lst.add("Tesla");
		lst.add("Apache");
		lst.addFirst("Apple");

		v.addAll(lst); // merging list into vector
		System.out.println("--Iterating over updated vector using for each");
		for (String elem : v)
			System.out.println(elem);

		// Converting vector into set
		HashSet<String> set = new HashSet<>(v);
		System.out.println("--Iterating over HashSet using for each loop");
		for (String elem : set)
			System.out.println(elem);

		// converting set into treeset
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("--Iterating over TreeSet using for each loop");
		for (String elem : tree)
			System.out.println(elem);
		
        
        //elements of the reverseTreeSet
       TreeSet<String> reverseTreeSet = new TreeSet<>(set);
       reverseTreeSet = (TreeSet) tree.descendingSet();
        System.out.println("**Elements of the reverseTreeSet**");
        for(String elem : reverseTreeSet)
            System.out.println(elem);
		
		System.out.println("--Iterating over treeset using java 8 forEach()");
		//New way to iterate from java 8
		tree.forEach(System.out::println);
		
		//Converting array to string
		String[] week= {"Sun","Mon","Tues","Wed","Thurs","Fri","Sat"};
       List<String> days=Arrays.asList(week);
       days.forEach(System.out::println);

	}

}
