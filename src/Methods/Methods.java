package Methods;

public class Methods {
    int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=1;
        int b=3;
        Methods q=new Methods();
        int c=q.logic(a,b);
        System.out.println(c);
    }
}
