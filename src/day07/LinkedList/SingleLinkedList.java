package day07.LinkedList;

public class SingleLinkedList<T> {
    // 첫번째 시작하는 노드
    public Node<T> head = null;

    // Node 클래스를 이너클래스로
    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    // 삽입
    public void addNode(T data) {
        if (head == null) {
            // 노드가 하나도 없다는 뜻
            // 즉, head부터 데이터를 채워야한다는 듯
            head = new Node<T>(data);
        } else {
            // 노드가 하나라도 있다면
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            // 리스트가 비어있지 않다면
            Node<T> node = this.head;
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }
    }

}
