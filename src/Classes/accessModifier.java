package Classes;

class MyEmployee{
    private int id;
    private String name;
    public void setName(String n){
        name=n;
    }
    public void setId(int n){
        id=n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
public class accessModifier {
    public static void main(String[] args) {
        MyEmployee ankur=new MyEmployee();
        ankur.setId(37);
        ankur.setName("Ankur");
        System.out.println(ankur.getName());
        System.out.println(ankur.getId());
    }
}
