package ru.geekbrains.lesson3.Core.List;

import ru.geekbrains.lesson3.Core.Unit.NodeV1;

public class MyLinkedListV1 extends MyLinkedList{

    private NodeV1 head;

    public NodeV1 getHead() {
        return head;
    }

    public void addFirst(int value) {
        NodeV1 nodeV1 = new NodeV1(value);
        if (head != null) {
            nodeV1.setNext(head);
        }
        head = nodeV1;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.getNext();
        }
    }

    public NodeV1 contains(int value) {
        NodeV1 nodeV1 = head;
        while (nodeV1 != null) {
            if (nodeV1.getValue() == value)
                return nodeV1;
            nodeV1 = nodeV1.getNext();
        }
        return null;
    }

    public void addLast(int value) {
        NodeV1 nodeV1 = new NodeV1(value);
        if (head == null) {
            head = nodeV1;
        } else {
            NodeV1 last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(nodeV1);
        }
    }

    public void removeLast() {
        if (head == null)
            return;

        NodeV1 nodeV1 = head;
        while (nodeV1.getNext() != null) {
            if (nodeV1.getNext().getNext() == null) {
                nodeV1.getNext().setNext(null);
                return;
            }
            nodeV1 = nodeV1.getNext();
        }

        head = null;

    }

    public void revert() {
        if (head == null || head.getNext() == null)
            return;

        NodeV1 currentNodeV1 = head;
        NodeV1 nextNodeV1 = currentNodeV1.getNext();
        NodeV1 prevNodeV1 = currentNodeV1;
        currentNodeV1.setNext(null);

        while (nextNodeV1 != null) {
            currentNodeV1 = nextNodeV1;
            nextNodeV1 = currentNodeV1.getNext();
            currentNodeV1.setNext(prevNodeV1);
            prevNodeV1 = currentNodeV1;
        }
        head = currentNodeV1;
    }


}
