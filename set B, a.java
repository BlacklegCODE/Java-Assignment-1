import java.util.Date;
import java.text.SimpleDateFormat;


public class Main
{
    public static void main(String[] args)
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String strDate = formatter.format(date);
        System.out.println("Current date is :"+strDate);

        formatter = new SimpleDateFormat("MMM/dd/yyyy");
        String strDate2 = formatter.format(date);
        System.out.println("Current date is " + strDate2);

        formatter = new SimpleDateFormat("EEEE/dd/MM/yyyy");
        String strDate3 = formatter.format(date);
        System.out.println("Current date :" + strDate3);

        formatter = new SimpleDateFormat("E/MMMM/dd/HH:MM:yyyy");
        String strDate4 = formatter.format(date);
        System.out.println("Next format :"+strDate4);

        formatter = new SimpleDateFormat("hh:mm:ss");
        String strDate5 = formatter.format(date);
        System.out.println("Next format :"+strDate5);

        formatter = new SimpleDateFormat("w");
        String strDate6 = formatter.format(date);
        System.out.println("Next format :" +strDate6);

        formatter = new SimpleDateFormat("D");
        String strDate7 = formatter.format(date);
        System.out.println("Next format :" + strDate7);







    }
}
