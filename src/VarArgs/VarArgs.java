package VarArgs;

public class VarArgs {
    static int sum(int x,int ...arr){
        int sum=x;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs tutorial.");
        System.out.println(sum(4,5));
        System.out.println(sum(1,2,3));
    }
}
