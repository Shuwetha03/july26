package july26ga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ArrayListProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<String> arrayList =new ArrayList<>();
		List<String> arrayList2 =new ArrayList<>();

		//int size = input.nextInt();

		arrayList.add("C");
		arrayList.add("C++");
		arrayList.add("Java");
		arrayList.add("Python");
		//	for(int i=0;i< size; i++)
		//		array_list.add(input.nextLine());

		System.out.println("Size of the ArrayList : " + arrayList.size());
		System.out.println("ArrayList is Empty : " + arrayList.isEmpty());
		System.out.println("ArrayList at index 0 : " + arrayList.get(0));
		arrayList.set(3,"Python3");
		System.out.println("List after changes : " + arrayList );
		arrayList2.add("R");
		arrayList2.add("MySql");
		arrayList2.add("save");
		arrayList2.add("vase");
		arrayList.addAll(arrayList2);
		System.out.println("After appending the ArrayList : " + arrayList );
		printAnagrams(arrayList);

	}


	private static void printAnagrams(List<String> arr)
	{
		HashMap<String, List<String> > map
		= new HashMap<>();

		for (int i = 0; i < arr.size(); i++) {

			String word = arr.get(i);
			char[] letters = word.toCharArray();
			Arrays.sort(letters);
			String newWord = new String(letters);


			if (map.containsKey(newWord)) {
				map.get(newWord).add(word);
			}
			else {
				List<String> words = new ArrayList<>();
				words.add(word);
				map.put(newWord, words);
			}
		}

		for (String s : map.keySet()) {
			List<String> values = map.get(s);
			if (values.size() > 1) {
				System.out.print("Anagrams in the List: " + values);
			}
		}
	}
}
