package Homework8;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class homework8 {
        public static void main(String[] args) {

                Calendar c1 = Calendar.getInstance();
                System.out.println(c1);

                SimpleDateFormat myFormat = new SimpleDateFormat("ha");
                Calendar cal = Calendar.getInstance();
                for (int i = 1; i <= 5; i++) {
                        cal.add(Calendar.HOUR, 2);
                        Date dateFromCal = cal.getTime();
                        System.out.print(" " + myFormat.format(dateFromCal).toLowerCase());

                        for (int a = 1; a <= 2; a++) {
                                cal.add(Calendar.HOUR, 2);
                                Date dateFromCalender = cal.getTime();
                                System.out.print("\n" + myFormat.format(dateFromCal).toLowerCase());

                                for (int b = 1; b <= 8; b++) {
                                        cal.add(Calendar.HOUR, 2);
                                        Date dateFromCalenders = cal.getTime();
                                        System.out.print("\n" + myFormat.format(dateFromCal).toLowerCase());
                                }


//
//                generateTimeline(5)
//                        * Now 11pm 1am 3am 5am
//                        *
//     * generateTimeline(2)
//                        * Now 11pm
//                        *
//     * generateTimeline(8)      // running code at 4:30am
//                        * Now 6am 8am 10am 12pm 2pm 4pm 6pm
//                        *
//     * generateTimeline(11)      // running code at 10:15am
//                        * Now 12pm 2pm 4pm 6pm 8pm 10pm 12am 2am 4am 6am
//
//


                        }
                }
        }
}