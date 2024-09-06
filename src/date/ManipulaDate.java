package date;

import java.util.Date;

public class ManipulaDate {
    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println("Date1" + date1.getTime());//apresenta a data em milisegundos

        Date date2 = new Date(System.currentTimeMillis() + 1000);
        System.out.println("Date2" + date2.getTime());

        if (date1.before(date2)) {
            System.out.println("Data1 antes de data2");
        }
        if (date2.after(date1)) {
            System.out.println("Data2 depois de data1");
        }

    }
}
