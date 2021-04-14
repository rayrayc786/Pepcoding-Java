import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Stack<Character> st=new Stack<>();
        Scanner scn=new Scanner(System.in);
        String  str=scn.nextLine();
        int i=0;
        boolean ans=false;
        while(i<str.length()){
            char ch=str.charAt(i);
            if(ch==' '){
                
            }else if(ch==')'){
                if(st.peek()=='('){
                    ans=true;
                    break;
                }
                else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
            i++;
        }
        System.out.println(ans);
    }

}
