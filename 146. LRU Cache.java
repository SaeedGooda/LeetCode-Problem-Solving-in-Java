class LRUCache {
    private int capacity;
    private Map<Integer, Node> map;
    private DoublyLinkedList list;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        list = new DoublyLinkedList();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        list.moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            list.moveToHead(node);
        } else {
            if (map.size() == capacity) {
                Node tail = list.removeTail();
                map.remove(tail.key);
            }
            Node newNode = new Node(key, value);
            list.addToHead(newNode);
            map.put(key, newNode);
        }
    }
}

class Node{
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}
class DoublyLinkedList {
    private Node head;
    private Node tail;

    DoublyLinkedList() {
        head = new Node(0, 0); // Dummy head
        tail = new Node(0, 0); // Dummy tail
        head.next = tail;
        tail.prev = head;
    }

    void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    Node removeTail() {
        Node res = tail.prev;
        removeNode(res);
        return res;
    }
}
