import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  n=scn.nextInt();
        int spaces=n/2,star=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<spaces;j++){
                System.out.print("\t");
            }
            for(int j=0;j<star;j++){
                System.out.print("*\t");
            }
            if(i<n/2){
                spaces--;
                star+=2;
            }else{
                spaces++;
                star-=2;
            }
            System.out.println();
        }

    }
}
