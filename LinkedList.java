public class LinkedList {
    private Node root;
    private Node tail;
    private int size;

    private class Node {
        int value;
        Node next;
        Node previous;
        public Node() {}
        public Node (int _value) {
            this.value = _value; }
        public Node (int _value, Node _next, Node _previous) {
            this.value = _value;
            this.next = _next;
            this.previous = _previous;
        }
    }

    public int size() {return size; }

    public void add (int value) {
        if (root == null) {
            root = new Node(value);
            size = 1;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = new Node(value);
        size++;
    }

    public void addSorted (int value) {
        if (root == null){
            root = new Node(value);
            size = 1;
            return;
        }
        Node addedNode = new Node(value);
        if (root.value > value){
            addedNode.next = root;
            root = addedNode;
            size++;
            return;
        }
        Node currentNode = root;
        while (currentNode.next != null){
            if (currentNode.next.value > value){
                addedNode.next = currentNode.next;
                currentNode.next = addedNode;
                size++;
                return;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = addedNode;
        size++;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size)
            return null;
        Node currentNode = root;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.next;
        return currentNode;
    }

    public int getValue(int index){
        if (index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        Node currentNode = root;
        for (int i = 0; i < index; i++)
            currentNode = currentNode.next;
        return currentNode.value;
    }

    public boolean remove (int value) {
        if (root.value == value){
            root = root.next;
            size--;
            return true;
        }
        Node currentNode = root;
        while (currentNode.next != null){
        if (currentNode.next.value == value) {
            currentNode.next = currentNode.next.next;
            size--;
            return true;
            }
        currentNode = currentNode.next;
        }
        return false;
    }

    public boolean removeAt(int index){
        if (index < 0 || index >= size)
            return false;
        if (index == 0){
            root = root.next;
            size--;
            return true;
        }
        Node prev = getNode(index - 1);
        if (prev == null)
            return false;
        prev.next = prev.next.next;
        size --;
        return true;
    }

    public int removeAll (int value){
        if (root == null)
            return -1;
        int counter = size;
        while (root.next != null && root.value == value){
            root = root.next;
            size--;
            if (root == null)
                return -1;
        }
        Node currentNode = root;
        while (currentNode.next != null){
            if (currentNode.next.value == value){
                currentNode.next = currentNode.next.next;
                size--;
                continue;
            }
            currentNode = currentNode.next;
        }
        return counter - size;
    }

    public void print() {
        Node currentNode = root;
        System.out.print("[ ");
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println("] size: " + size);
        System.out.println();
    }


    public void swap (int index1, int index2){
        if (index1 < 0 || index1 >= size || index2 < 0 || index2>= size)
            return;
        Node node1 = null, node2 = null, currentNode = root;
        for (int i = 0; currentNode != null; i++){
            if (node1 == null)
                if (index1 == i)
                    node1 = currentNode;
            if (node2 == null)
                if (index2 == i)
                    node2 = currentNode;
            if (node1 != null && node2 != null)
                break;
            currentNode = currentNode.next;
        }
        int temp = node1.value;
        node1.value = node2.value;
        node2.value = temp;
    }

    public void quickSort(){
        quickSort(0, size-1);
    }

    private void quickSort(int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = this.getValue((leftMarker + rightMarker) / 2);
        while (leftMarker <= rightMarker){
            while (this.getValue(leftMarker) < pivot)
                leftMarker++;
            while (this.getValue(rightMarker) > pivot)
                rightMarker--;
            if (leftMarker <= rightMarker){
                if (leftMarker < rightMarker)
                    swap(leftMarker, rightMarker);
                leftMarker++;
                rightMarker--;
            }
        }
        if (leftMarker < rightBorder)
            quickSort(leftMarker, rightBorder);
        if (leftBorder < rightMarker)
            quickSort(leftBorder, rightMarker);
    }

//    public void reverse () {
//        Node currentNode = root;
//        while (currentNode != null) {
//            Node nextNode = currentNode.next;
//            Node previous = currentNode.previous;
//            currentNode.next = previous;
//            currentNode.previous = nextNode;
//            if (previous == null){
//                tail = currentNode;
//            }
//            if (nextNode == null){
//                root = currentNode;
//            }
//            currentNode = nextNode;
//        }
//    }

    public void revert(){
        if (root != null && root.next != null){
            revert (root.next, root);
        }
    }

    private void revert (Node currentNode, Node previousNode){
        if (currentNode.next == null){
            root = currentNode;
        }
        else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }
}
