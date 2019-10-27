import java.util.Arrays;

public class RepeatNumber {
    public static void main(String[] args) {

int [] repeat = new int[11];
int c = 0;
for (int i = 0; i<11;i++)

{
    repeat[i]=i+1;
}
repeat[10]=5;
repeat[4]=10;
int b = 0;
for (int i =0;i<5;i++)
{
    c=repeat[i];
    for (int k =6;k<11;k++)
    {
        b=repeat[k];
        if (b==c){
            System.out.println(b);
        }
    }

}

System.out.println(Arrays.toString(repeat));
    }


}
// Очень туго, но когда сделал со спокойно душой поел=)