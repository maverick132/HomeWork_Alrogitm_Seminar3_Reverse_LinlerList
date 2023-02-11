package ru.geekbrains.lesson3.Core.List;

import ru.geekbrains.lesson3.Core.Unit.NodeV2;

public class MyLinkedListV2 extends MyLinkedList {

    private NodeV2 head;
    private NodeV2 tail;

    public NodeV2 getHead() {
        return head;
    }

    public void addFirst(int value){
        NodeV2 node = new NodeV2(value);
        if (head != null){
            node.setNext(head);
            head.setPrev(node);
            //head = node;
        }
        else {
            tail = node;
            //head = node;
        }

        head = node;

    }

    public void removeFirst(){
        if (head != null && head.getNext() != null){
            head.getNext().setPrev(null);
            head = head.getNext();
        }
        else {
            head = null;
            tail = null;
        }
    }

    public void revert() {
        if (head == null || head.getNext() == null)
            return;

        NodeV2 currentNode = head;
        tail = currentNode;
        NodeV2 nextNode = currentNode.getNext();
        NodeV2 prevNode = currentNode;
        currentNode.setNext(null);
        currentNode.setPrev(nextNode);

        while (nextNode != null) {
            currentNode = nextNode;
            nextNode = currentNode.getNext();
            currentNode.setNext(prevNode);
            currentNode.setPrev(nextNode);
            prevNode = currentNode;
        }
        head = currentNode;
    }

}
