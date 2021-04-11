import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        int space=1,star=(n/2)+1;
        
        for(int i=0;i<n;i++){
            for(int l=0;l<star;l++){
                System.out.print("*\t");
            }
            for(int j=0;j<space;j++){
                System.out.print("\t");
            }
            for(int k=star;k>0;k--){
                System.out.print("*\t");
            }
            if(i<n/2){
                star--;
                space+=2;
            }else{
                
                star++;
                space-=2;
            }
            System.out.println();
        }

    }
}
