import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int[] dp=new int[n+1];
        System.out.println(cs(arr,0,dp));
        
    }
    public static int cs(int[] arr,int src,int[] dp){
        if(src==arr.length){
            return 1;
        }
        if(src>arr.length){
            return 0;
        }
        if(dp[src]!=0){
            return dp[src];
        }
        int ans=0;
        for(int jump=1;jump<=arr[src];jump++){
            ans+=cs(arr,src+jump,dp);
        }
        dp[src]=ans;
        return ans;
    }
    public static int cst(int[] arr,int src){
        int n=arr.length;
        int[] dp=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            for(int jump=1;jump<=arr[i];jump++){
                if(i+jump<=n){
                    dp[i]+=dp[i+jump];
                }
            }
        }
        return dp[0];
    }

}
