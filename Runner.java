import java.util.*;
public class Runner
{
	public Runner()
	{
//		DoublyLinkedList<DoublyLinkedList<DoublyLinkedList<Integer>>> list = new DoublyLinkedList<DoublyLinkedList<DoublyLinkedList<Integer>>>();
//		
//		DoublyLinkedList<DoublyLinkedList<Integer>> one = new DoublyLinkedList<>();
//		DoublyLinkedList<DoublyLinkedList<Integer>> two = new DoublyLinkedList<>();
//		DoublyLinkedList<DoublyLinkedList<Integer>> three = new DoublyLinkedList<>();
//		
//		DoublyLinkedList<Integer> four = new DoublyLinkedList<>();
//		four.add(1);
//		four.add(2);
//		four.add(3);
//		DoublyLinkedList<Integer> five = new DoublyLinkedList<>();
//		five.add(4);
//		five.add(5);
//		five.add(6);
//		DoublyLinkedList<Integer> six = new DoublyLinkedList<>();
//		six.add(7);
//		six.add(8);
//		six.add(9);
//		
//		one.add(four);
//		one.add(five);
//		one.add(six);
//		two.add(four);
//		two.add(five);
//		two.add(six);
//		three.add(four);
//		three.add(five);
//		three.add(six);
//		
//		list.add(one);
//		list.add(two);
//		list.add(three);
//		
//		System.out.println(list);
//		System.out.println(list.get(0));
//		System.out.println(list.get(0).get(0));
//		System.out.println(list.get(0).get(0).get(0));
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		
		for(int i = 0; i < 30; i++) {
			list.add((int)(Math.random()*1000)+1);
		}
		
		System.out.println("List: "+list);
		System.out.println("List Reversed: "+list.toReversedString());
		System.out.println("List Size: "+list.size());
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println("List Average: "+(sum/list.size()));
		
		int sumEven = 0;
		int sumOdd = 0;
		for(int i = 0; i < list.size(); i++) {
			if(i % 2 == 0)
				sumEven += list.get(i);
			else
				sumOdd += list.get(i);
		}
		
		System.out.println("List Average of Even Indexes: "+(sumEven/(list.size()/2))+"\nList Average of Odd Indexes: "+(sumOdd/(list.size()/2)));
		
		int init_size = list.size();
		for(int i = 0; i < init_size; i++) {
			if(list.get(i) % 2 != 0) {
				list.add(list.get(i));
			}
		}
		
		System.out.println("List with Added Duplicate Odds: "+list);
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i)%4 == 0) {
				list.remove(i);
			}
		}
		
		System.out.println("List with Removed Values Divisible by 4: "+list);
		
		list.add(4, 45454);
		
		System.out.println("List with Added '45454' in 4th Position: "+list);
		
	}
	
	public static void main(String args[])
	{
		Runner app=new Runner();
	}

}