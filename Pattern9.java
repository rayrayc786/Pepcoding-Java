import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int space=1,star=(n/2)+1;
        
        for(int i=0;i<n;i++){
            for(int l=0;l<n;l++){
                if(i+l==n-1||i==l){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
                
            }
            
            System.out.println();
        }

    }
}
