import java.util.HashMap;

public class lruCache {
    class LRUCache {

        class Node {
            int key;
            int val;
            Node next;
            Node prev;

            public Node(int key, int val) {
                this.key = key;
                this.val = val;
                next = null;
                prev = null;
            }
        }

        HashMap<Integer, Node> hashMap;
        Node MRU;
        Node LRU;
        int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            hashMap = new HashMap<>();
            MRU = new Node(-1, -1);
            LRU = new Node(-1, -1);
            MRU.next = LRU;
            LRU.prev = MRU;

        }

        private void addNode(Node newNode) {
            Node temp = MRU.next;
            MRU.next = newNode;
            newNode.prev = MRU;
            newNode.next = temp;
            temp.prev = newNode;
        }

        private void deleteNode(Node node) {
            Node prev = node.prev;
            Node next = node.next;
            prev.next = next;
            next.prev = prev;
        }

        public int get(int key) {
            if (!hashMap.containsKey(key))
                return -1;
            put(key, hashMap.get(key).val);
            return hashMap.get(key).val;

        }

        public void put(int key, int value) {
            if (hashMap.containsKey(key)) {
                Node node = hashMap.get(key);
                deleteNode(node);
                node.val = value;
                addNode(node);
                hashMap.put(key, MRU.next);
            } else {
                if (hashMap.size() == capacity) {
                    Node prev = LRU.prev;
                    deleteNode(prev);
                    hashMap.remove(prev.key);
                }
                Node newNode = new Node(key, value);
                addNode(newNode);
                hashMap.put(key, MRU.next);
            }
        }
    }
}
