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

    int[] span = solve(a);
    display(span);
 }

 public static int[] solve(int[] arr){
   Stack<Integer> st=new Stack <>();
   int[] nge= new int[arr.length];
   st.push(0); //push 0th element
   nge[0]=1; //push 1 to 1st element in ans
   for(int i=1;i<arr.length;i++){ //loop to traverse whole array
       while(st.size()>0 && arr[st.peek()]<arr[i]){ 
           st.pop();                           //pop all smaller elements
       }
       if(st.size()==0){  // upadate ans if stack==0  
           nge[i]=i+1;      //ans will be index +1  
       }else{   
           nge[i]=i-st.peek();      //ans will be index - present on top of stack
       }
       st.push(i);              //after doing all this push element to stack because it can be ans to any other elements
       
   }
   return nge;
 }

}
