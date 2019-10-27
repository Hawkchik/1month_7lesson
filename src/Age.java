import java.util.Date;
import java.util.GregorianCalendar;

public class Age {

    public static void main(String[] args) {
        int a = 7 * 366;
        int b = 23 * 365;
        int c = a+b;

        Date startDate1 = new GregorianCalendar(2019,3, 29,00,00).getTime();//163
        Date endDate1 = new Date();
        long diff = endDate1.getTime() - startDate1.getTime();
        System.out.println(c);
        long d = diff/(1000L*60L*60L*24L);
        System.out.println(d);
        System.out.println(c+d);



    }

}
