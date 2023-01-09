package myjava.learn;

import java.util.ArrayList;
import java.util.List;

public class LearnArraryLinkedList {

	/*
	add (E e) --> boolean
	 *) It is used to append the specified element at the end of a list.

    add(int index, E element )	--> void 
	 *) It is used to insert the specified element at the specified position in a list.

  	addAll(Collection<? extends E> c) --> boolean 
	 *) It is used to append all of the elements in the specified collection to the end of a list.

  	 addAll(int index, Collection<? extends E> c) --> boolean	
	 *) It is used to append all the elements in the specified collection, 
	 *)  starting at the specified position of the list.

    size()	--> int 
     *) It is used to return the number of elements present in the list.	
    
	 clear() --> void
	 *) It is used to remove all of the elements from this list.

     equals(Object o)	--> boolean
	 *) It is used to compare the specified object with the elements of a list.

	 hashcode()	  --> int
	 *) It is used to return the hash code value for a list.

	 get(int index)	--> E
	 *) It is used to fetch the element from the particular position of the list.

 	 isEmpty()	--> boolean
	 *) It returns true if the list is empty, otherwise false.

    lastIndexOf(Object o)	int 
	 *) It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.

	toArray()	--> <T> T[] 
	 *) It is used to return an array containing all of the elements in this list in the correct order.
	
	 containsAll(Collection<?> c)	--> boolean
	 *) It returns true if the list contains all the specified element

 	 indexOf(Object o)	 -->  int 
 	 *) It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.

      remove(int index)  --> boolean 
      *) It is used to remove the element present at the specified position in the list.	

	  removeAll(Collection<?> c)	---> boolean 
	   *) It is used to replace all the elements from the list with the specified element.	
	  
	  replaceAll(UnaryOperator<E> operator)  --> void 
		*) It is used to replace all the elements from the list with the specified element.	
		
	  retainAll(Collection<?> c) --> void 
	   *) It is used to retain all the elements in the list that are present in the specified collection.	
	   
	   set(int index, E element) --> E 
	    *) It is used to replace the specified element in the list, present at the specified position.	
     
      sort(Comparator<? super E> c)	-->	void
       *) It is used to sort the elements of the list on the basis of specified comparator.	
       *
      Spliterator<E> spliterator()	
      *) It is used to create spliterator over the elements in a list.	
     
     List<E> subList(int fromIndex, int toIndex)	
      *) It is used to fetch all the elements lies within the given range.	
     
     
	indexOf(T value)
	lastindexOf(T value)  
	toArray() 
	sort(comparator)

	addAll(Collection value)
	remove(T value)
	removeAll(Collection value)
	get(int index)
	set(int index, T value)
	clear()
	clone()
	isEmpty() - boolean
	contains(Tvalue)
	size()
*/
	public static void main(String[] args) {
		ArrayList<String> carName = new ArrayList<String>();

		List<String> cName = new ArrayList<String>();

		carName.add("Volvo");
		carName.add("BMW");
		carName.add("Ford");
		carName.add("Mazda");
		carName.trimToSize();
		carName.ensureCapacity(20);
		System.out.println(carName);

	}




}
