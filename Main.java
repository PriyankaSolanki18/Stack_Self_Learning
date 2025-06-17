import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(18);
        System.out.println(st+" -> "+st.peek()+" "+st.size());
        st.push(34);
        System.out.println(st+" -> "+st.peek()+" "+st.size());
        st.push(6);
        System.out.println(st+" -> "+st.peek()+" "+st.size());
        st.push(78);
        System.out.println(st+" -> "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" -> "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" -> "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" -> "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" -> "+st.size());

        //Underflow Condition : No more elements are present to be removed from stack
        //st.pop();
        //System.out.println(st);
    }
}
