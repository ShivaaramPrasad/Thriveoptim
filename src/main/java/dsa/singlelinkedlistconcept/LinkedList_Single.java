package dsa.singlelinkedlistconcept;

import java.util.LinkedList;

public class LinkedList_Single {
	/*
remove(int index)
remove int value)
set(int index, int value)
get(int index)
	 */
	Node head;
	Node tail;
	int length;

	public void add(int input) {
		if (tail == null) {
			Node temp = new Node(input);
			tail = temp;
			head = temp;
		} else {
			Node temp = new Node(input);
			tail.nextNode = temp; //next node Reference 
			tail = temp;   // move the tail to new node 
		}
		length++;
	}

	public int size() {
		return length;
	}

	public void removeFirst() {

		if (head.nextNode == null) head = null;
		// above if check can be done in 2 other ways
		/*
	                if(head == tail) head = null;
	                if(length ==  1) head = null;
		 */
		else head = head.nextNode;
		length--;
	}
	public void removeLast() {
		if(length==0) return;
		if(length==1) tail =head=null;
		else {
			Node temp = head;
			while(temp.nextNode.nextNode != null)
				temp   = temp.nextNode;
				temp.nextNode= null;
				tail=temp;
		}
		length--;

	}
		public boolean removeAll(int value) { // 3
			boolean isRemoved = false;
			Node temp = head;
			while (temp != null) {  //1,2,3,4,5  -> 1,2,4,5
				if (temp.nextNode.nodeValue == value) {
					temp.nextNode = temp.nextNode.nextNode;  //1,2,3,5
					length--;
					isRemoved = true;
				}
				temp = temp.nextNode;
			}
			if (isRemoved) return isRemoved;
			else
				throw new RuntimeException("value[" + value + "] not present in list");
		}

		public boolean remove(int value){ // 3
			Node temp = head;
			while(temp != null){  //1,2,3,4,5  -> 1,2,4,5
				if(temp.nextNode.nodeValue == value) {
					temp.nextNode = temp.nextNode.nextNode;  //1,2,3,5
					length--;
					return true;
				}
				temp = temp.nextNode;
			}
			throw new RuntimeException("value["+value+"] not present in list");
		}

		public int get(int value){
			Node temp = head;
			while(temp != null){
				if(temp.nodeValue == value) return temp.nodeValue ;
				temp = temp.nextNode;
			}
			throw new RuntimeException("value["+value+"] not present in list");
		}

		public boolean set(int nThNode, int value) {
			Node temp = head;
			int nodePosition = 0;
			while (temp != null) { //while(nodePosition <= n)
				if (nodePosition == nThNode) {
					temp.nodeValue = value;
					return true;
				}
				temp = temp.nextNode;
				nodePosition++;
			}
			return false;
		}

		public void print(){
			Node temp = head;
			while(temp != null){
				System.out.println(temp.nodeValue);
				temp = temp.nextNode;
			}
		}
		//indexof
		//lastIndexOf

		public int indexOf(int input){
			int index = 0;
			Node temp = head;
			while(temp != null){
				if(temp.nodeValue == input)  return index ;
				temp= temp.nextNode;
				index++;
			}
			return-1;
		}

		public int lastIndexOf(int input){
			int index = 0;
			int tempInd=-1;   // if any value 
			Node temp = head;
			while(temp != null){
				if(temp.nodeValue == input)
				{
					tempInd=index;
				}
				temp= temp.nextNode;
				index++;
			}
			return tempInd;
		}
	}