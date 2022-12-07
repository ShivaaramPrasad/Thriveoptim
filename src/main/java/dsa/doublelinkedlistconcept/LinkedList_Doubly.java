package dsa.doublelinkedlistconcept;

public class LinkedList_Doubly {
    Node head, tail;

    int length;

    /**
     * Method to add elements
     * @param input - input value
     */
    public void add(int input){
        if(head == null) tail = head = new Node(input);
        else tail = tail.next = new Node(input, tail);
        length++;
    }

    public void addFirst(int value){
        Node temp = head;
        head = new Node(value);
        temp.prev = head;
        head.next = temp;
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
    public void removeFirst(){
        if(length==1) tail = head = null;
        else {
            head = head.next;
            head.prev = null;
        }
        length--;
    }

    /**
     * Removes last element of the list
     */
    public void removeLast(){
        if(length==1) tail = head = null;
        else {
            tail = tail.prev;
            tail.next = null;
        }
        length--;
    }

    /**
     * Method to remove based on the index
     * @param index - index to be removed
     */
    public void remove_index(int index){
        if(index >= length && index < 0) throw new ArrayIndexOutOfBoundsException();
        if(index ==0) removeFirst();
        else if(index == length-1) removeLast();
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
        if(head.value == value) removeFirst();
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
        if(index >= length && index < 0) throw new ArrayIndexOutOfBoundsException();
        return getNode(index).value;
    }


    /**
     * Method to get the node object based on index
     * @param index - index value
     * @return - node object of the index
     */
    private Node getNode(int index){
        Node temp;
        int currentIndex;

        if(index < length/2) {
            temp = head;
            currentIndex =0;
            while (index >= 0 && currentIndex++ != index)
                temp = temp.next;
        }else{
            temp = tail;
            currentIndex = length-1;
            while (index < length && currentIndex-- != index)
                temp = temp.prev;
        }
        return temp;
    }

    /**
     * Setting new value for an existing node
     * @param index - index to set value
     * @param value - new value
     * @return - boolean if the new value is set or not
     */
    public boolean set(int index, int value){
        if(index >= length && index < 0) return false;
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

    /**
     * Method to find the index of the first occurrence of the value
     * @param value - value's for which index to be returned
     * @return - -1 if no value and index if found
     */
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

    /**
     * Method to find the index of the last occurrence of the value
     * @param value - value's for which index to be returned
     * @return - -1 if no value and index if found
     */
    public int lastIndexOf(int value){
        Node temp = tail;
        int counter = length-1;
        while (temp != null){
            if(temp.value == value) return counter;
            temp= temp.prev;
            counter--;
        }
        return -1;
    }

}
