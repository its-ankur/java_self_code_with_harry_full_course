package Classes;
class Employee{
    int id;
    String name;
    public void printD(){
        System.out.println("My id : "+id);
        System.out.println("My name : "+name);
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("Custom class");
        Employee ankur=new Employee();
        ankur.id=37;
        ankur.name="ankur";
//        System.out.println(ankur.id);
//        System.out.println(ankur.name);
        ankur.printD();
    }
}
