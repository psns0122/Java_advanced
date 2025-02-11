package day07.LinkedList;

// 싱글(단방향) 링크드리스트의 노드 클래스
public class Node<T> {
    T data;
    Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }
}
