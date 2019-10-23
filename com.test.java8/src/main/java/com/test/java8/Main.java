package com.test.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws InterruptedException {
	//	System.out.println("test pedro");
		
	//	Runnable run = () -> System.out.println("tes java 8");
	//	new Thread(run).start();
		//or
		//Lambidas java 8 more
	//	new Thread(() -> System.out.println("otro modelo")).start();
	//java 7
		List<String> strs = Arrays.asList("Joao", "Estudos", "Java");
		//java 7
		for(String str : strs) {
			System.out.println(str);
		}
		System.out.println("lambida");
		//java8
		strs.forEach(str -> System.out.println(str));
		System.out.println("___________________________");

		List<String> result = strs.stream().filter(str -> str.startsWith("J")).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		//result.forEach(str -> { Person.say(str)})
		
		result.forEach(Person::say);
		//java 7
		Myinterface myInterface = new Myinterface() {
			
			@Override
			public void print(String s) {
				System.out.println("java 7- function inteface");
			}
		};
		//myInterface.print();
		
		
		// java 8
		Myinterface my1 = (String s) -> {
			System.out.println("java 8 - function interface " + s);
		};
		//my1.print();
		
		result.forEach(my1::print);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,5,5,6,7,23);
		List<String> text = Arrays.asList("a","b","c","","","d","","t");
		
		List<Integer> filterNumber = numbers.stream().filter(number -> number != 5).collect(Collectors.toList());
		List<String> filterText = text.stream().filter(texts -> !texts.isEmpty()).collect(Collectors.toList());
		filterNumber.forEach(System.out::println);
		filterText.forEach(System.out::println);
		
		Random has = new Random();
		has.doubles().limit(2).forEach(System.out::println);
		
		
		
		List<Person> people = new ArrayList<Person>();
				
		Person person1 = new Person("Pedro");
		Person person2 = new Person("Joao");
		Person person3 = new Person("Mesquita");
		Person person4 = new Person("Eliza");
		Person person5 = new Person(null);
		
		people.add(person5);
		people.add(person4);
		people.add(person3);
		people.add(person2);
		people.add(person1);
		
		Optional<Person> op = Optional.of(person1);
		
		op.ifPresent(p -> {
			System.out.println(p.getName());
		});
		System.out.println("------------------------");
		
		people.forEach(p -> {
			System.out.println(p.getName());
		});
		Instant now = Instant.now();
		
		
		Thread.sleep(1000);
		Instant now2 = Instant.now();
		
		Duration dur = Duration.between(now, now2);
		
		System.out.println(dur.getSeconds());
		
		LocalDate local = LocalDate.now();
		
		System.out.println(local);
		
		LocalDate aniversario1 = LocalDate.of(1992, 9, 24);
		LocalDate aniversario2 = LocalDate.of(2020, 9, 24);
		
		Period period = Period.between(aniversario1, aniversario2);
		
		System.out.printf("%s %s %s ",period.getYears(),period.getMonths(), period.getDays());
		
	}
}
