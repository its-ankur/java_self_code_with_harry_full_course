package Classes.Practice;
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setSalary(int s){
        salary=s;
    }
}
public class PracticeQuestions {
    public static void main(String[] args) {
        Employee ankur=new Employee();
        ankur.setName("ankur");
        System.out.println(ankur.getName());
        ankur.setSalary(230);
        System.out.println(ankur.getSalary());
    }
}
