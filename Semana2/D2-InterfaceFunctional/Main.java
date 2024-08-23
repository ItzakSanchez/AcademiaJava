package com.edgaritzak.interfacefunctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.stream.Stream;

import org.w3c.dom.Element;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ana","Torres",98);
		Student s2 = new Student("Jose","Ramirez",82);
		Student s3 = new Student("Daniela","Cruz",73);
		
		//------------Supplier--------------
		
		//Supplies a new stream 
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("a","b","c","d"); 
        Stream<String> stream1 = streamSupplier.get();
        
        //Supplies a new Student instance
		Supplier<Student> emptyStudentSupplier = () -> new Student();
		Student s4 = emptyStudentSupplier.get();
		
		//Supplies a new Student List
		Supplier<ArrayList<Student>> studentListSupplier = () -> new ArrayList();
		ArrayList<Student> list1 = studentListSupplier.get();
		
		//Supplies a random number from 0 to 1000
		Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(1000);
		int number1 = randomNumberSupplier.get();
		
		//------------Consumer--------------
		
		//Clears all values from a set
		Consumer<HashSet<Integer>> consumerClearSet = (s) -> s.clear();
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(200);
		set1.add(3000);
		consumerClearSet.accept(set1);
		
		//Prints a string on console
		Consumer<String> consumerPrintString = (s) -> System.out.println(s);
		consumerPrintString.accept("Hello world");
		
		//Fills an array with the given value
		Consumer<int[]> consumerFillArray = (a) -> {for(int i:a) {a[i] = i;}};
		int[] array1 = new int[10];
		consumerFillArray.accept(array1);
		System.out.println(array1);
		
		// Adds "!!!" to a string
		Consumer<StringBuilder> consumerAppendStringBuilder = (sb) -> sb.append("!!!");
		StringBuilder textSB = new StringBuilder("Hi");
		consumerAppendStringBuilder.accept(textSB);
		System.out.println(textSB); 
		
		//------------BiConsumer--------------
		
		//Concatenate 2 strings and print it
		BiConsumer<String,String> BiConsumerConcatenateAndPrint = (a,b) -> System.out.println(a+b);
		BiConsumerConcatenateAndPrint.accept("Edgar", "Itzak");
	
		//Adds a value to a treeSet
		BiConsumer<TreeSet<Integer>, Integer> BiConsumerAddToTreeset = (a,b) -> a.add(b);
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		BiConsumerAddToTreeset.accept(treeSet1, 30);
		
		//Update a Student's Name
		BiConsumer<Student, String> BiConsumerUpdateStudentName = (a,b) -> a.setName(b);
		BiConsumerUpdateStudentName.accept(s1, "Anna");
		
		//Replace all Values from a list to a given value
		BiConsumer<ArrayList<Integer>, Integer> BiConsumerReplaceAllValues = (a,b) -> a.replaceAll(element -> b);
		ArrayList<Integer>z = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		System.out.println(z);
		BiConsumerReplaceAllValues.accept(z, (Integer)10);
		System.out.println(z);
		
		
		//------------Predicate--------------
	
		
		Predicate<Student> PredicateStudentApproval = (s) -> s.getScore()>=70;
		
		
		Predicate<String> PredicateHasAt = (s) -> s.contains("@");
		
		
		Predicate<ArrayList> PredicateIsEmpty = (l) -> l.isEmpty();
		
		
		Predicate<HashMap<Integer, String>> PredicateHasEmptySeats = (h) -> {for(String e:h.values()) {
			if(e == null) 
				return true;
			};
			return false;
		};
		//------------BiPredicate--------------
		
		BiPredicate<Student, Integer> BiPredicateScoreGraterThan = (st,sc) -> st.getScore()>sc;
		BiPredicate<ArrayList<Student>,Student> BiPredicateContainsStudentInArrayList = (l,s) -> l.contains(s);
		BiPredicate<String, Integer> BiPredicateExceedsStringLengthLimit = (s, l) -> s.length()>l;
		BiPredicate<Integer,Integer> BiPredicateIsDivisible = (x, y) -> (x % y==0);
		
		//------------Function--------------
		
		Function<Integer,String> FunctionGeneratePassword = (x) -> {
			String s = "abcdefghijklmnñopqrstuvwxyz";
			s= s.concat(s.toUpperCase()).concat("1234567890");
			String output="";
			for(int i=0; i<x;i++) {
				output=output+((s.charAt(new Random().nextInt(s.length()))));
			}
			return output;
		};
		Function<Student,Double> FunctionGetStudentScore = (x) -> x.getScore();
		Function<String,Integer> FunctionGetLength = (x) -> x.length();
		Function<String,Integer> FunctionCountLowercase = (x) -> {
			int lowercase = 0;
			for(char c:x.toCharArray()) {
				if (Character.isLowerCase(c)) {
					lowercase++;
				}
			}
			return lowercase;
		};
		
		//------------BiFunction--------------
		
		BiFunction<Integer,Integer,Float> BiFunctionDivision = (x,y) -> (float)x/y ;
		BiFunction<String,String,Student> BiFunctionNewStudent = (n,l) -> new Student(n,l,0);
		BiFunction<Integer,Character,String> BiFunctionGenerateString = (i,c) -> {
			String stringText = "";
			for (int j =0;j<i;j++) {
				stringText = stringText+c;
			}
			return stringText;
		};
		BiFunction<Student,Integer,ArrayList<Student>> BiFunction = (s,n) -> {
			ArrayList<Student> sl = new ArrayList<>();
			for(int i=0;i<n;i++) {
				sl.add(s);
			}
			return sl;
		};

		
		//------------UnaryOperator--------------
		
		UnaryOperator<Integer> FunctionGenerateRandom = (n) -> new Random().nextInt(n);
		UnaryOperator<Student> FunctionClearStudentData = (s) -> {s.setName(""); s.setLastname("");s.setScore(0); return s;};
		UnaryOperator<String> FunctionReverseString = (s) -> new StringBuilder(s).reverse().toString();
		UnaryOperator<Set<Integer>> Function = (s) -> { int min = 0; int max=0; for(Integer i:s) {
			if(i<min)min=i;
			if(i>max)max=i;
		};
		for(int j = min; min<max; j++) {
			s.add(j);
		};
		return s;
		};
		
		//------------BinaryOperator--------------
		
		BinaryOperator<Integer> BinaryOperatorRandomNumber = (a,b) -> (a+new Random().nextInt(b-a));
		BinaryOperator<String> BinaryOperatorConcatString = (a,b) -> a+b;
		BinaryOperator<Double> BinaryOperatorPower = (a,b) -> Math.pow(a, b);
		BinaryOperator<Student> BinaryOperatorCompareScore = (a, b) -> {if(a.getScore()>=b.getScore())return a;else return b;};

	}

}
