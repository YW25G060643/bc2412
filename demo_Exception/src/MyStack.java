import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> LinkedList;

    public MyStack(){
        this.LinkedList = new LinkedList<>();
    }

    public T pop(){
        return this.LinkedList.pollLast();
    }

    public void push(T data){
        this.LinkedList.addLast(data);
    }

    public static void main(String[] args) {
        MyStack<String> strings = new MyStack<>();
        strings.push("ABC");
        strings.push("DEF");
        System.out.println(strings.pop());
    }
}
