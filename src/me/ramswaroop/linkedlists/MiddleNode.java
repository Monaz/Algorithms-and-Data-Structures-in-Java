package me.ramswaroop.linkedlists;

import me.ramswaroop.common.SingleLinkedList;
import me.ramswaroop.common.SingleLinkedNode;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ramswaroop
 * @date: 6/18/15
 * @time: 10:34 PM
 */
public class MiddleNode<E extends Comparable<E>> extends SingleLinkedList<E> {

    public static <E extends Comparable<E>> SingleLinkedNode<E> getMiddleNode(SingleLinkedNode<E> node) {
        SingleLinkedNode<E> slow = node;
        SingleLinkedNode<E> fast = node;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String a[]) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
        linkedList.add(00);
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        linkedList.add(44);
        linkedList.add(55);
        linkedList.add(66);
        linkedList.add(77);
        linkedList.add(88);
        System.out.println(getMiddleNode(linkedList.getNode(0)).item);
    }
}