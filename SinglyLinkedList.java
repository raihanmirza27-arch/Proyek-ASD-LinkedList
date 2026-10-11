/**
 * SinglyLinkedList
 */
public class SinglyLinkedList implements LinkedList{

    public Node head,tail;
    private int size=0;

    public SinglyLinkedList(){
        head=tail=null;
    }
    public boolean isEmpty(){
        return(size==0);
    }
    public int size(){
        return size;
    }
    public void addFirst(Object inputData){
        Node baru = new Node(inputData);
        if (isEmpty()){
            head = baru;
            tail = baru;
            size++;
        }
        else {
            baru.pointer = head;
            head = baru;
            size++;
        }
    }

    public void addLast(Object inputData){
        Node baru = new Node(inputData);
        if (isEmpty()){
            head = baru;
            tail = baru;
            size++;
        }
        else {
            tail.pointer = baru;
            tail = baru;
            size++;
        }
    }

    public void addAfter(int index,Object inputData){
        Node baru = new Node(inputData);
        Node C=head;
        for(int i=0;i<index;i++){
            C = C.pointer;
        }
        baru.pointer = C.pointer;
        C.pointer = baru;
    }

    public void deleteFirst(){
        if(isEmpty()){
            System.err.println("Linked list kosong");
        }
        else if(size==1){//else if(head==tail)
            head = null;
            tail = null;
            size--;
        }
        else{
            head = head.pointer;
            size--;
        }
    }

    public void deleteLast(){
        if(isEmpty()){
            System.err.println("Linked list kosong");
        }
        else if(size==1){//else if(head==tail)
            head = null;
            tail = null;
            size--;
        }
        else{
            Node temp = head;
            for(int i=1;i<size;i++){
                temp = temp.pointer;
            }
            tail = temp;
            tail.pointer = null;
            size--;
        }
    }

    public void deleteAfter(int index){
        if(isEmpty()){
            System.err.println("Linked list kosong");
        }
        else if(size==1){//else if(head==tail)
            head = null;
            tail = null;
            size--;
        }
        else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.pointer;
            }
            temp.pointer = temp.pointer.pointer;
            size--;
        }
    }

    public void print(){
        Node currentNode = head;
        for(int i =0;i<size;i++){
            System.out.println(currentNode.data);
            currentNode = currentNode.pointer;
        }
    }
    @Override
    public Object get(int index) {
        // TODO digunakan untuk mengembalikan data pada index ke-i dimulai dari head. Head memiliki index 0
        return null;
    }
    @Override
    public int indexOf(Object targetData) {
        // TODO digunakan mencari kemunculan pertama targetData pada linked list dan mengembalikan indeksnya. Indeks dari head adalah 0. Jika tidak ada targetData pada linked list, kembalikan nilai -1 
        return 0;
    }

    //Dikerjakan oleh Raihan Mirza Firdaus - 255150207111107
    @Override
    public void printReverse() {
        Object[] data = new Object[size];
        Node currentNode = head;

        for(int i = 0; i < size; i++) {
            data[i] = currentNode.data;
            currentNode = currentNode.pointer;
        }

        for(int i = size -1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    //Dikerjakan oleh Raihan Mirza Firdaus - 255150207111107
    @Override
    public boolean remove(Object targetData) {
        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null) {
            if(currentNode.data == targetData) {
                if(currentNode == head) {
                    head = currentNode.pointer;
                } else {
                    prevNode.pointer = currentNode.pointer;
                }

                if(currentNode == tail) {
                    tail = prevNode;
            }

            size--;
            return true;

            }

            prevNode = currentNode;
            currentNode = currentNode.pointer;

        }

        return false;
    }
    
    @Override
    public Object[] toArray() {
        // TODO digunakan untuk mendapatkan keseluruhan data pada node-node di linked list dalam bentuk array. Data-data pada array disusun secara urut mulai dari head sampai dengan tail.
        return null;
    }
}