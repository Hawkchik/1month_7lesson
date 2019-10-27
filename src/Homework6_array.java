import java.util.Arrays;


public class Homework6_array {
    public static void main(String[] args) {
        Integer[] age = {2, 60, 16, 54};
        Arrays.sort(age);
        int min = age[0];
        int max = age[age.length-1];
        System.out.println(min);
        System.out.println(max);
        int x=12;
        System.out.println("1-ое случайное число: " + Math.random()*(-x));
        System.out.println("2-ое случайное число: " + Math.random());
        System.out.println("3-е случайное число: " + Math.random());

        double a = Math.random();
        int b = (int) a;



    }
}
