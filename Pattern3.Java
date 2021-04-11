import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            int spaces,star;
            for(spaces=n-i;spaces>0;spaces--){
                System.out.print("\t");
            }
            for(star=1;star<=i;star++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
