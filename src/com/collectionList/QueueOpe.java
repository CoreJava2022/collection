package com.collectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOpe {
     
	public Queue<String> display(){
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("amey");
		queue.add("manasi");
		queue.add("Ruthuja");
		queue.add("Tushar");
		queue.add("Bhushan");
		queue.add("kiran");
		
		
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("size of queue :"+queue.size());
		System.out.println("*****************************");
		System.out.println("Peek of queue :"+queue.peek());
		System.out.println("Poll of queue :"+queue.poll());
		System.out.println(queue.peek());
		queue.remove(6);
		System.out.println("After remove ele : "+queue);
		return queue;
	}
	
	public void  convetListToQ(){
		List<String> list = new ArrayList<String>();
		list.add("manasi");
		list.add("Rutuja");
		list.add("Bhushan");
		list.add("kiran");
		list.add("Tushar");
		list.add("Hitesh");
		list.add("pyush");
		list.add("amey");
		list.add("amol");
		list.add("abc");
		list.add("def");
		list.add("ghi");
		list.add("jkl");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println("List is :"+itr.next());
		}
		
		Queue<String> queue = new PriorityQueue<String>(list);
		
            for(String i : queue){
			   list.add(i);
		     }
            System.out.println("queue is :"+queue);
	}
	
	
	public static void main(String[] args) {
		
		QueueOpe qOpe = new QueueOpe();
		//qOpe.display();
		qOpe.convetListToQ();
	}
}
