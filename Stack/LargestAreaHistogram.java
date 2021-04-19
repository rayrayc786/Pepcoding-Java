import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int[] nsr=new int[a.length]; //new array for next smallest element in right
    int[] nsl=new int[a.length];    //new array for next smallest element in left
    Stack<Integer> st=new Stack<>();    //new stack 
    st.push(a.length-1);                //push last element to stack
    nsr[a.length-1]=a.length;             //assign last(nth) value pf array to last eleemnt of new  array
    for(int i=a.length-2;i>=0;i--){             //loop started from n-1 terms to 0 
        while(st.size()>0 && a[st.peek()]>=a[i]){   //if size od stack is greater than 0 and peek element of stack concludes array element is greater than array element 
            st.pop();               //pop all the greater value 
        }
        if(st.size()==0){       //update ans id size is 0 i.e last element
            nsr[i]=a.length;
        }else{
            nsr[i]=st.peek();   // update ans i.e peek of stack
        }
        st.push(i);             //push curent element to stack
    }
    st=new Stack<>();
    st.push(0);
    nsl[0]=-1;
    for(int i=1;i<a.length;i++){
        while(st.size()>0 && a[st.peek()]>=a[i]){
            st.pop();
        }
        if(st.size()==0){
            nsl[i]=-1;
        }else{
            nsl[i]=st.peek();
        }
        st.push(i);
    }
    int ans=0;
    for(int i=0;i<a.length;i++){
        ans=Math.max(ans,a[i]*(nsr[i]-nsl[i]-1));
    }
    System.out.println(ans);
  //alternative approach for max
  //int maxArea=0;
  //for(int i=0;i<a.length;i++){
    //int width=nsr[i]-nsl[i]-1;
    //int area=a[i]*width;
    //if(maxArea<area){
      //maxArea=area;}}
 }
}
