package PracticeSetMethods;
import java.util.*;
public class Question1 {
    static void mul(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    static void pattern1(int n){
        int q=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<q;j++){
                System.out.print("* ");
            }
            System.out.println();
            q=q-1;
        }
    }

    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int nFibbo(int n){
//       if(n==1){
//           return 0;
//       }
//       else if (n==2){
//           return 1;
//       }
        if(n==1 || n==2){
            return n-1;
        }
       else{
           return nFibbo(n-1)+nFibbo(n-2);
       }
    }
    static int sum(int ...arr){
        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //mul(5);
        //pattern(5);
        //System.out.println(sum(5));
        //pattern1(4);
        //System.out.println(sum(5,3,4,2,1));
        pattern1_rec(5);
    }
}
