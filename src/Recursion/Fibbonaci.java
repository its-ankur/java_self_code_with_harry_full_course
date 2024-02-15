package Recursion;

public class Fibbonaci {
    static void fibbonaci(int n,int s,int l){
        if(n==0 || n==1){
            System.out.println(s);
        }
        else{
            System.out.print(s+" ");
            fibbonaci(n-1,l,s+l);
        }
    }
    public static void main(String[] args) {
        fibbonaci(2,0,1);
    }
}
