package ru.geekbrains.lesson3;

import ru.geekbrains.lesson3.Core.List.MyLinkedList;
import ru.geekbrains.lesson3.Core.List.MyLinkedListV1;
import ru.geekbrains.lesson3.Core.List.MyLinkedListV2;
import ru.geekbrains.lesson3.Core.Unit.Node;

public class Main {

    public static void main(String[] args) {

        MyLinkedListV1 linkedListV1 = new MyLinkedListV1();
        MyLinkedListV2 linkedListV2 = new MyLinkedListV2();

        setLinkedList(linkedListV1);
        setLinkedList(linkedListV2);

        System.out.println("Unidirectional:");

        printLinkedList(linkedListV1);
        linkedListV1.revert();
        System.out.println("Reverse:");
        printLinkedList(linkedListV1);


        System.out.println("Directional:");

        printLinkedList(linkedListV2);
        linkedListV2.revert();
        System.out.println("Reverse:");
        printLinkedList(linkedListV2);



    }

    public static void setLinkedList (MyLinkedList linkedList){
        linkedList.addFirst(6);
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);

    }
    public static void printLinkedList (MyLinkedList linkedList){
        Node node = linkedList.getHead();
        while (node.getNext() != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
            if (node.getNext() == null) System.out.println(node.getValue());
        }
        System.out.println();

    }

}
