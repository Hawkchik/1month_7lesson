import java.util.Arrays;
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
String s = "Java";
        System.out.println(s.substring(0,4));
        System.out.println(s.concat("stana"));

        String string = "Java";
        System.out.println(s==string);
        int a = s.length();
        System.out.println((s.charAt(a-1)));
        System.out.println(s.indexOf('a'));

        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        System.out.println(l.replace("a","b"));

        int m = scanner.nextInt();
        int [] arra = new int[5];
        int t = m;
        for (int i=0;i<5;i++)
        {arra[i]=m;
        m=m*t;

        }
        System.out.println(Arrays.toString(arra));

        String  [] arra2 = new String[5];




        int [] los = new int[6];
        int q=0;
        while (true)
        {
            int r = scanner.nextInt();
            los[q]=r;
            if (r==0) break;
            q++;

        }
        System.out.println(Arrays.toString(los));


        int [] mos = new int [10];
        mos[0]=1;
        mos[1]=2;
        mos[2]=6;
        mos[3]=1;
        mos[4]=12;
        mos[5]=1;
        mos[6]=13;
        mos[7]=19;
        mos[8]=10;




    }
}
