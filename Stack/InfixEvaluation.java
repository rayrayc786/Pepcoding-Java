import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack <Integer> oprnd=new Stack<>();
    Stack <Character> op=new Stack<>();
    
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if(ch=='('){
            op.push(ch);
        }else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            if((op.size()>0 )&& (op.peek()!='(')&& (precedence(ch)<=precedence(op.peek()))){
                int val2=oprnd.pop();
                int val1=oprnd.pop();
                char chop=op.pop();
                int val=operations(val1,val2,chop);
                oprnd.push(val);
            }
            op.push(ch);
        }else if(ch==')') {
            while(op.peek()!='('){
                int val2=oprnd.pop();
                int val1=oprnd.pop();
                char chop=op.pop();
                int val=operations(val1,val2,chop);
                oprnd.push(val);
            }
            op.pop();
        }else if(Character.isDigit(ch)){
            oprnd.push(ch-'0');
        }
        
    }
    while(op.size()!=0){
        int val2=oprnd.pop();
        int val1=oprnd.pop();
        char chop=op.pop();
        int val=operations(val1,val2,chop);
        oprnd.push(val);
    }
    System.out.println(oprnd.peek());
}
    public static int operations(int val1,int val2,char ch){
        if(ch=='+'){
            return val1+val2;
        }else if(ch=='-'){
            return val1-val2;
        }else if(ch=='*'){
            return val1*val2;
        }else{
            return val1/val2;
        }
    }
    public static int precedence(char ch){
        if((ch=='+')||(ch=='-')){
            return 1;
        }else if((ch=='*')||(ch=='/')){
            return 2;
        }else{
            return 0;
        }
    }
}
