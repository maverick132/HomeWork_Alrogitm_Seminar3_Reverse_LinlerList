package ru.geekbrains.lesson3.Core.Unit;

public class NodeV1 extends Node{

    private int value;
    private NodeV1 next;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeV1 getNext() {
        return next;
    }

    public void setNext(NodeV1 next) {
        this.next = next;
    }

    public NodeV1(int value) {
        this.value = value;
    }
}
