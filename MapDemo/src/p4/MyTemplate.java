package p4;

import java.util.ArrayList;
import java.util.List;


//public class MyTemplate<T> { 
public class MyTemplate<T extends Animal> {
	
	List<T> myList = new ArrayList<>();
	
	public void insertElement(T e)
	{
		myList.add(e);
	}
	
	public T getElement(int index)
	{
		return myList.get(index);
	}

}
