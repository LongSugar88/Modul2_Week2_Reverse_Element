public class Stacktest {
    public static void main(String[] args) throws Exception {
        MyStack<Integer> myIntegerListOrigin = new MyStack<>(5);
        MyStack<Integer> myIntegerListReverse = new MyStack<>(5);
        myIntegerListOrigin.push(1);
        myIntegerListOrigin.push(2);
        myIntegerListOrigin.push(3);
        myIntegerListOrigin.push(4);
        myIntegerListOrigin.push(5);
        while (!myIntegerListOrigin.isEmpty()){
            myIntegerListReverse.push(myIntegerListOrigin.pop());
        }
        for(int i=0; i<myIntegerListReverse.size(); i++){
            System.out.println(myIntegerListReverse.get(i));
        }

        MyStack<String> myStringOrigin = new MyStack<>(15);
        MyStack<String> myStringReverse = new MyStack<>(15);
        String myString = "Long đẹp trai";
        String myStringArray[] = myString.split("\\s");
        for (String element: myStringArray
             ) {
            myStringOrigin.push(element);
        }
        while (!myStringOrigin.isEmpty()){
            myStringReverse.push(myStringOrigin.pop());
        }
        for(int i=0; i<myStringReverse.size(); i++){
            System.out.println(myStringReverse.get(i));
        }

    }
}
