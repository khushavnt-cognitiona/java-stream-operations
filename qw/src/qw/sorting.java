package qw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class sorting {

	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();

		// Adding 100 names
		name.add("Khushvant");
		name.add("Sonali");
		name.add("Vivek");
		name.add("Yogesh");
		name.add("Payal");
		name.add("Rame");
		name.add("Chata");
		name.add("Vishal");
		name.add("Rohit");
		name.add("Priya");
		name.add("Rakesh");
		name.add("Sneha");
		name.add("Akash");
		name.add("Harsh");
		name.add("Manisha");
		name.add("Rajesh");
		name.add("Gaurav");
		name.add("Amruta");
		name.add("Neha");
		name.add("Abhishek");
		name.add("Anjali");
		name.add("Shruti");
		name.add("Sahil");
		name.add("Riya");
		name.add("Ankit");
		name.add("Pooja");
		name.add("Kiran");
		name.add("Deepak");
		name.add("Swapnil");
		name.add("Rupesh");
		name.add("Manoj");
		name.add("Vikas");
		name.add("Komal");
		name.add("Sheetal");
		name.add("Suresh");
		name.add("Ritu");
		name.add("Megha");
		name.add("Ajay");
		name.add("Kishore");
		name.add("Bhavesh");
		name.add("Pratik");
		name.add("Vandana");
		name.add("Sumit");
		name.add("Shubham");
		name.add("Tanvi");
		name.add("Divya");
		name.add("Yash");
		name.add("Jyoti");
		name.add("Sandeep");
		name.add("Mahesh");
		name.add("Isha");
		name.add("Vivekanand");
		name.add("Shravan");
		name.add("Kavita");
		name.add("Rohan");
		name.add("Aditi");
		name.add("Sakshi");
		name.add("Jitesh");
		name.add("Pranjal");
		name.add("Sarita");
		name.add("Hemant");
		name.add("Madhuri");
		name.add("Ashwin");
		name.add("Prachi");
		name.add("Dinesh");
		name.add("Nikita");
		name.add("Suraj");
		name.add("Ravindra");
		name.add("Swati");
		name.add("Aditya");
		name.add("Pranav");
		name.add("Tejas");
		name.add("Kajal");
		name.add("Nilesh");
		name.add("Mayuri");
		name.add("Ankita");
		name.add("Aishwarya");
		name.add("Vaibhav");
		name.add("Ketan");
		name.add("Dipti");
		name.add("Sachin");
		name.add("Ashwini");
		name.add("Shashank");
		name.add("Piyush");
		name.add("Rahul");
		name.add("Bharti");
		name.add("Sonal");
		name.add("Lakshmi");
		name.add("Monika");
		name.add("Zita");
		name.add("Gopal");
		name.add("Shivani");
		name.add("Vaishali");
		name.add("Varun");
		name.add("Krishna");
		name.add("Suhas");
		name.add("Poonam");
		name.add("Sudhir");
		name.add("Preeti");
		name.add("K");

// List<String>  sortList=name.stream().filter(n->n.startsWith("K")).collect(Collectors.toList());
// 
// for (String string : sortList) {
//	System.out.println(string);

//        List<String>sortList=name.stream().filter(n->n.endsWith("i")).toList();
//        
//        sortList.forEach(System.out::println);

		// Sort the list alphabetically

//		List<String> sorList = name.stream().sorted().collect(Collectors.toList());
//
//		sorList.forEach(System.out::println);

		// Sort the list in reverse order

//		List<String>reverseSortedList=name.stream().sorted(Comparator.reverseOrder()).toList();
//		
//		reverseSortedList.forEach(System.out::println);

////		
//		List<String> upperCaseList = name.stream().map(String::toUpperCase).toList();
//
//		upperCaseList.forEach(System.out::println);

		// Find names with a specific length (e.g., length 5)
		List<String> fiveLetterNames = name.stream().filter(n -> n.length() == 5).toList();

//		System.out.println("Names with 5 letters: ");
//		
//		fiveLetterNames.forEach(System.out::println);
//		

		// Count names that start with "S"

//		long count=name.stream().filter(n->n.startsWith("S")).count();
//		
//		System.out.println("Number of names starting with S: " + count);
//		

//		 Find the longest name

//		String longestName = name.stream().max((n1, n2) -> Integer.compare(n1.length(), n2.length()))
//				.orElse("No names"); 
//		
//		System.out.println(longestName);
//	
		// Find the smallest name

//		String shortestName=name.stream().min((n1,n2) ->  Integer.compare(n1.length(), n2.length())).orElse("No names");
//		System.out.println(shortestName);
//		 
	}
}