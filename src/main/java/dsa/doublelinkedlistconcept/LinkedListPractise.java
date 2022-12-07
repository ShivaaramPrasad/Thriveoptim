package dsa.doublelinkedlistconcept;

import org.junit.Test;

public class LinkedListPractise {

    @Test
    public void singlyLL(){
        LinkedList_Singly list = new LinkedList_Singly();
        list.print();
        for( int each : new int[]{1,2,5,6,7,0,5,3, 0})
            list.add(each);

        list.print();
/*
        list.remove_index(0);
        list.print();
        list.remove_withValue(5);
        list.print();
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(1));
        try{System.out.println(list.get(list.length));} catch(Exception e){
            System.out.println(e.getMessage());
        }
        list.set(0, 0);
        list.print();
        System.out.println(list.indexOf(0));
        System.out.println(list.lastIndexOf(0));*/

        list.removeLastIndex();
        list.print();


        list.addFirst(-2);
        list.print();

    }


    @Test
    public void double_LL(){
        LinkedList_Doubly list = new LinkedList_Doubly();
        list.print();
        for( int each : new int[]{1,2,5,6,7,0,5,3})
            list.add(each);

        list.print();

        list.remove_index(0);
        list.print();

        list.remove_withValue(5);
        list.print();

        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(1));

        try{System.out.println(list.get(3));} catch(Exception e){
            System.out.println(e.getMessage());
        }

        list.set(0, 0);
        list.print();

        System.out.println(list.indexOf(0));
        System.out.println(list.lastIndexOf(0));

        list.addFirst(-2);
        list.print();

        list.removeFirst();
        list.print();
    }
}

