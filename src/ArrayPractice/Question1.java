package ArrayPractice;

public class Question1 {
    public static void main(String[] args) {
        float[] marks={45.3f,67.8f,63.4f,99.2f,100.0f};
        float sum=0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println(sum);
        System.out.println();
    }
}
