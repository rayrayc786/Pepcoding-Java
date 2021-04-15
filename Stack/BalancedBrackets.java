import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Stack<Character> st=new Stack<>();
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int i=0;
        boolean ans=true;
        while(i<str.length()){
            char ch=str.charAt(i);
            if(ch=='{' ||ch=='('||ch=='['){
                st.push(ch);
            }else if(ch=='}'||ch==')'||ch==']'){
                if(st.size()==0){
                    ans= false; //more closing brackets (a+b)]
                    break;
                }if(ch==')'){
                    if(st.peek()!='('){
                        ans= false; //mismatch (a+b]
                        break;
                    }
                }else if(ch=='}'){
                    if(st.peek()!='{'){
                        ans= false; //mismatch
                        break;
                    }
                }else{
                    if(st.peek()!='['){
                        ans= false; //mismatch
                        break;
                    }
                }
                st.pop(); //removing after checking both equals ( and ) the pop it
                    
            }else{
                
            }
            i++;
        }
        if(st.size()>0){
            ans= false; //more opening ((a+b)
        }
        System.out.println(ans);

    }

}
