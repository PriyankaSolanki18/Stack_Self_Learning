import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(18);
        st.push(34);
        System.out.println(st);
        st.push(6);
        System.out.println(st);
        st.push(78);
        System.out.println(st);
        System.out.println(st+" -> "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" -> "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" -> "+st.peek()+" "+st.size());
    }
}
