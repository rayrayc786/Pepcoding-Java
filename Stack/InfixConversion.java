import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack <String> prefix=new Stack<>();
    Stack <String> postfix=new Stack<>();
    Stack <Character> op=new Stack<>();
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if(ch=='('){
            op.push(ch);
        }else if((ch>='0' && ch<='9')||(ch>='a'&& ch<='z')||(ch>='A' && ch<='Z')){
            postfix.push(ch+"");
            prefix.push(ch+"");
        }else if(ch==')'){
            while(op.peek()!='('){
                char optr=op.pop();
                String val2=postfix.pop();
                String val1=postfix.pop();
                String val=val1+val2+optr;
                postfix.push(val);
                
                String pval2=prefix.pop();
                String pval1=prefix.pop();
                String pval=optr+pval1+pval2;
                prefix.push(pval);
            }
            op.pop();
        }else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
           while(op.size()>0 &&    op.peek()!='(' && precedence(ch)<=precedence(op.peek())){
                char optr=op.pop();
                String val2=postfix.pop();
                String val1=postfix.pop();
                String val=val1+val2+optr;
                postfix.push(val);
                
                String pval2=prefix.pop();
                String pval1=prefix.pop();
                String pval=optr+pval1+pval2;
                prefix.push(pval);
                
            }
           op.push(ch); 
        }
    }
    while(op.size()>0){
        char optr=op.pop();
                String val2=postfix.pop();
                String val1=postfix.pop();
                String val=val1+val2+optr;
                postfix.push(val);
                
                String pval2=prefix.pop();
                String pval1=prefix.pop();
                String pval=optr+pval1+pval2;
                prefix.push(pval);
    }
    System.out.println(postfix.pop());
    System.out.println(prefix.pop());
 }
    public static int precedence(char ch){
        if(ch=='+'||ch=='-'){
            return 1;
        }else if(ch=='*'||ch=='/'){
            return 2;
        }else{
            return 0;
        }
    }
    
 
}
