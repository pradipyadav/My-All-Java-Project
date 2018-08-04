package javaPractice;

import java.util.Scanner;

public class NumberOfDaysInMonth
{
    public static void main(String[] args) {

        int number_of_DaysInMonth=0;
        String monthName="Unknown";

        Scanner s=new Scanner(System.in);

        System.out.println("Enter Month Number ");
        int month=s.nextInt();

        System.out.println("Enter Year");
        int year=s.nextInt();

        switch (month)
        {
            case 1:
                monthName="January";
                number_of_DaysInMonth=31;
                break;

            case 2:
                monthName="Feb";
                        if((year % 400==0) || ((year % 4 == 0) && (year % 100 != 0)))
                        {
                            number_of_DaysInMonth=29;
                        }
                        else
                        {
                            number_of_DaysInMonth=28;
                        }
            case 3:
                monthName="March";
                number_of_DaysInMonth=30;
                break;
            case 4:
                monthName="April";
                number_of_DaysInMonth=31;
                break;
            case 5:
                monthName="May";
                number_of_DaysInMonth=30;
                break;
            case 6:
                monthName="Jun";
                number_of_DaysInMonth=31;
                break;
            case 7:
                monthName="July";
                number_of_DaysInMonth=30;
                break;
            case 8:
                monthName="August";
                number_of_DaysInMonth=31;
                break;
            case 9:
                monthName="Saptember";
                number_of_DaysInMonth=30;
                break;
            case 10:
                monthName="October";
                number_of_DaysInMonth=31;
                break;
                case 11:
                monthName="Nov";
                number_of_DaysInMonth=30;
                break;
            case 12:
                monthName="Dec";
                number_of_DaysInMonth=31;
            break;
        }
        System.out.println("Month Number "+month+"Month: "+monthName+" Days "+number_of_DaysInMonth+ " "+year);
    }
}
