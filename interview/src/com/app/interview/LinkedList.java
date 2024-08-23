package com.app.interview;

import java.util.List;
import java.util.Stack;

public class LinkedList {
	private Node head;
	
	public void insert(int data)
	{
		Node newnode=new Node();
		newnode.setData(data);
		if(head==null) {
			head=newnode;
		} 
		else {
		Node temp=head;
		
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(newnode);
		//System.out.println("temp"+temp.getData());
		}
		}
	
	
	
	public void display()
	{
		System.out.println("in display");
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	public int findMidElement()
	{
		Node temp1=head;
		Node temp2=temp1.getNext();
		Node mid=temp1;
		int count=1;

		while(temp2!=null)
		{
			++count;
			if(count%2!=0)
			{
			mid=mid.getNext();	
			}
			temp2=temp2.getNext();
			
		}
		System.out.println("count "+count);
		System.out.println("mid element="+mid.getData());
		
		return 0;
	}
	
	public void reverseList()
	{
	  Node temp1=head;
	  Stack<Integer> stack=new Stack<Integer>();
	 
	  while(temp1!=null)
	  {
		  stack.push(temp1.getData());
		  temp1=temp1.getNext();  
		  
	  }
	  head=null;
	  while(!stack.empty())
	  {
		  
		  insert(stack.pop());
	  }
	 
	}
}
