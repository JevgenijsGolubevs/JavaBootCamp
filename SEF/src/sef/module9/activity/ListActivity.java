package sef.module9.activity;
//Needs to be completed

import sef.module9.sample.ListSample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		ArrayList<String>people = new ArrayList<String>();
		people.add("George");
		people.add("Tom");
		people.add("Jerry");
		people.add("Ken");
		//2 - Call print method to print the list passed as its parameter.
		ListSample obj=new ListSample();
		obj.print(people);
	}
	public void print(List l)
	{
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
	


