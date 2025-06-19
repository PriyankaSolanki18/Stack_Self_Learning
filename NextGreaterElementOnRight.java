import java.io.*;
import java.util.*;

public class NextGreaterElementOnRight {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n: ");
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        System.out.print("Enter arr elements (space-separated): ");
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(inputs[i]);
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static void display(int[] a) {
        for (int i : a) {
            System.out.print(i+" ");
        }
    }

    public static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] >= st.peek()) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return nge;
    }
}

/*
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter arr elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        arr[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[i] > st.peek()){
                st.pop();
            }
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        for(int i:nge){
            System.out.print(i+" ");
        }
    }
}
*/