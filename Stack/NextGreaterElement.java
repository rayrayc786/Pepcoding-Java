import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
   Stack<Integer> st=new Stack<>();
   int[] nge=new int[arr.length];
   st.push(arr[arr.length-1]);
   nge[arr.length-1]=-1;
   int i=arr.length-2;
   while(i>=0){
       //pop all smaller elements
       while(st.size()>0 && arr[i]>st.peek()){
           st.pop();
       }
       //update ans
       if(st.isEmpty()==true){
           nge[i]=-1;
       }else{
           nge[i]=st.peek();
       }
       
       //push current element into stack
       st.push(arr[i]);
        
       i--;
   }
   return nge;
 }
}
