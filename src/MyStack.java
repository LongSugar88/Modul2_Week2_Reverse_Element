public class MyStack<T> {
    private int capacity;
    private Object myList[];
    private int currentSize;

    public MyStack(int size){
        myList = new Object[size];
        this.capacity = size;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }
    public boolean isFull(){
        return currentSize == capacity;
    }
    public  int size(){
        return currentSize;
    }
    public void push(T element) {
        if(isFull()){
            throw new StackOverflowError("Array is  full");
        }
        myList[currentSize] = element;
        currentSize++;
    }
    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Array is empty");
        }
        currentSize--;
        return (T) myList[currentSize];
    }
    public T get( int index){
        return (T) myList[index];
    }
}
