package dsa.doublelinkedlistconcept;

public class LinkedList_Singly {

	/**
     * Head, Tail, Node
     */

    Node head, tail;

    int length;

    // input = 1,2 3,4,5,6,7,           9

    /**
     * Method to add elements
     * @param input - input value
     */
    public void add(int input){
        if(head == null) tail =head = new Node(input);
        else tail = tail.next = new Node(input);


      /*  if(head == null) {
            Node temp= new Node(input);
            tail = temp;
            head = temp;
        }else {
            Node temp = new Node(input);
            tail.next = temp;
            tail = temp;
        }*/
        length++;
    }

    /**
     * Returns size of the element
     * @return - length of the list
     */
    public  int size(){
        return length;
    }

    /**
     * Removes first element of the list
     */
    public void removeFirstIndex(){
        if(length == 0) return;
        if(length==1) tail = head = null;
        else head = head.next;
        length--;
    }


    /**
     * Removes last element of the list
     */
    public void removeLastIndex(){
        if(length == 0) return;
        if(length==1) tail = head = null;
        else{
            Node temp = head;
            while(temp.next.next != null)
                temp = temp.next;
            temp.next = null;
            tail = temp;
        }
        length--;
    }


    public void addFirst(int value){
        Node temp = head;
        head = new Node(value);
        head.next = temp;
    }

    /**
     * Method to remove based on the index
     * @param index - index to be removed
     */
    public void remove_index(int index){
        if(index >= length && index < 0) throw new ArrayIndexOutOfBoundsException();
        if(index ==0) removeFirstIndex();
        else {
            Node temp = getNode(index-1);
            temp.next = temp.next.next;
            length--;
        }
    }

    /**
     * Remove the node based on the first occurrence of the value
     * @param value - value to be removed
     */
    public void remove_withValue(int value){
        if(head.value == value) removeFirstIndex();
        else{
            Node temp = head;
            while(temp.next != null && temp.next.value != value)
                temp = temp.next;

            if(temp.next != null) {
                temp.next = temp.next.next;
                length--;
            }
        }
    }

    /**
     * Method to get the index value
     * @param index index to be fetched
     * @return value
     */
    public int get(int index){
        if(index >= length) throw new ArrayIndexOutOfBoundsException();
        return getNode(index).value;
    }

    /**
     * Method to get the node object based on index
     * @param index - index value
     * @return - node object of the index
     */
    private Node getNode(int index){
        Node temp = head;
        int currentIndex = 0;

        while(index >= 0 && currentIndex++ != index)
            temp = temp.next;

        return temp;
    }

    /**
     * Setting new value for an existing node
     * @param index - index to set value
     * @param value - new value
     * @return - boolean if the new value is set or not
     */
    public boolean set(int index, int value){
        if(index >= length) return false;
        else{
            getNode(index).value = value;
            return true;
        }
    }

    /**
     * Print the list
     */
    public void print(){
        Node temp = head ;
        StringBuffer buffer = new StringBuffer("[");
        if(head != null){
            while (temp != null) {
                buffer.append(temp.value + ",");
                temp = temp.next;
            }
            buffer.deleteCharAt(buffer.length()-1);
        }
        buffer.append("]");
        System.out.println(buffer);
    }

    public int indexOf(int value){
        Node temp = head;
        int counter = 0;
        while (temp != null){
            if(temp.value == value) return counter;
            temp= temp.next;
            counter++;
        }
        return -1;
    }


    public int lastIndexOf(int value){
        Node temp = head;
        int counter = 0, index = -1;
        while (temp != null){
            if(temp.value == value) index = counter;
            temp= temp.next;
            counter++;
        }
        return index;
    }

}