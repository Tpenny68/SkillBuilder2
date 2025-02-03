/**
 * This class provides various static methods that calculate various quantities
 * related to dates, including the day of week a date fall on.
 * @author
 * @version
 */
public class Date {
    /**
     * Returns true if the year is a leap year; otherwise false
     * @param year the year
     * @return true if the year is a leap year; otherwise false.
     */
    public static boolean isLeapYear(int year){
        //TODO: replace this line and the next with your code.
        System.out.println(year);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the name of the day given by dayValue
     * @param dayValue Numerical value of the day in the range 0 to 6, inclusively
     * @return the name of the day given by dayValue
     */
    public static String getNameOfDay(int dayValue){
        if (dayValue == 0)
        {
            return "Sunday";
        } else if (dayValue == 1) {
            return "Monday";
        } else if (dayValue == 2) {
            return "Tuesday";
        } else if (dayValue == 3) {
            return "Wednesday";
        } else if (dayValue == 4) {
            return "Thursday";
        } else if (dayValue == 5) {
            return "Friday";
        } else if (dayValue == 6) {
            return "Saturday";
        } else {
            return null;
        }
    }

    /**\
     * Returns the numeric value of the month.
     *   1 - January
     *   2 - February
     *   ...
     *   12 - December
     * @param name name of the month
     * @return the numeric value of the month.
     */
    public static int getMonthNumber(String name){
        if (name == "January"){
            return 1;
        } else if (name == "February"){
            return 2;
        } else if (name == "March"){
            return 3;
        } else if (name == "April") {
            return 4;
        } else if (name == "May"){
            return 5;
        } else if (name == "June"){
            return 6;
        } else if (name == "July"){
            return 7;
        } else if (name == "August"){
            return 8;
        } else if (name == "September"){
            return 9;
        } else if (name == "October"){
            return 10;
        } else if (name == "November"){
            return 11;
        } else if (name == "December"){
            return 12;
        } else {
            return -1;
        }
    }

    /**
     * Returns the name of the month given the numeric value provided by month
     *      1 - January
     *      2 - February
     *      ...
     *      12 - December
     * @param month Numeric value of the month.  Should be 1 to 12, inclusively
     * @return the name of the month given the numeric value provided by month
     */
    public static String getMonthName(int month){
        if (month == 1){
            return "January";
        } else if (month == 2){
            return "February";
        } else if (month == 3){
            return "March";
        } else if (month == 4){
            return "April";
        } else if (month == 5){
            return "May";
        } else if (month == 6){
            return "June";
        } else if (month == 7){
            return "July";
        } else if (month == 8){
            return "August";
        } else if (month == 9){
            return "September";
        } else if (month == 10){
            return "October";
        } else if (month == 11){
            return "November";
        } else if (month == 12){
            return "December";
        } else {
            return null;
        }

    }

    /**
     * Returns the number of days in the month given by the parameter month
     * @param month the numeric value of the month
     * @param year year
     * @return the number of days in the month given by the parameter month
     */
    public static int getDaysInMonth(int month, int year){
        if (month == 1){
            return 31;
        } else if (month == 2){
            if (year % 4 == 0){
                return 29;
            } else {
                return 28;
            }
        } else if (month == 3){
            return 31;
        } else if (month == 4){
            return 30;
        } else if (month == 5){
            return 31;
        } else if (month == 6){
            return 30;
        } else if (month == 7){
            return 31;
        } else if (month == 8) {
            return 31;
        } else if (month == 9){
            return 30;
        } else if (month == 10){
            return 31;
        } else if (month == 11){
            return 30;
        } else if (month == 12){
            return 31;
        } else {
            return -1;
        }
    }

    /**
     * Returns the number of days in the month given by the parameter month
     * @param month the name of the month
     * @param year year
     * @return the number of days in the month
     */
    public static int getDaysInMonth(String month, int year){
        if (month == "January"){
            return 31;
        } else if (month == "February"){
            if (year % 4 == 0){
                return 29;
            } else {
                return 28;
            }
        } else if (month == "March"){
            return 31;
        } else if (month == "April"){
            return 30;
        } else if (month == "May"){
            return 31;
        } else if (month == "June"){
            return 30;
        } else if (month == "July"){
            return 31;
        } else if (month == "August"){
            return 31;
        } else if (month == "September"){
            return 30;
        } else if (month == "October"){
            return 31;
        } else if (month == "November"){
            return 30;
        } else if (month == "December"){
            return 31;
        } else {
            return -1;
        }
    }

    /**
     * Returns the offset in days for the month relative to January
     * @param month numeric value of the month
     * @param year year
     * @return the offset in days for the month relative to January
     */
    public static int getMonthOffset(int month, int year){
        //TODO: replace this line and next with your code.
        int daysInMonth = getDaysInMonth(1,year);
        if (month == 2){
            return ((59) % 7);
        } else if (month == 4){
            return ((90) % 7);
        } else if (month == 5){
            daysInMonth += getDaysInMonth(month,year);
            return ((148) % 7);
        } else {
            return -1;
        }
    }

    /**
     * Returns the day of the week that the date falls on
     * @param month numeric value of the month
     * @param dayOfMonth day of the month
     * @param year year
     * @return the day of the week that the date falls on
     */
    public static int dayOfWeek(int month, int dayOfMonth, int year){
        /**
        System.out.println("The month is " + getMonthName(month));
        System.out.println("The months number is " + month);
        System.out.println("The day of the month is " + dayOfMonth);
        int startingDay = ((year + ((year-1) / 4) - ((year-1) / 100) + ((year-1) / 400)) % 7);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }
        int totalDays = 0;
        if (month <= 12){
            for (int i = 0; i < month - 1; i++) {
                totalDays += daysInMonth[i];
            }
            totalDays += dayOfMonth;
            return (startingDay + totalDays - 1) % 7;
        } else {
            return -1;
        }
         */

        int startingDay = ((year + ((year-1) / 4) - ((year-1) / 100) + ((year-1) / 400)) % 7);
        int monthDays = 0;
        int theTotalDays = 0;
        int leapDays = 0;
        System.out.println(month);
        if (isLeapYear(year)){
            leapDays = 29;
        } else {
            leapDays = 28;
        }
        if (month == 1){
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay) % 7;
        } else if (month == 2){
            if (dayOfMonth <= leapDays){
                monthDays = 31;
                theTotalDays = monthDays + dayOfMonth;
                System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
                return (startingDay + theTotalDays -1) % 7;
            } else {
                return -1;
            }
        } else if (month == 3){
            monthDays = 31;
            theTotalDays = leapDays + monthDays + dayOfMonth;
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        } else if (month == 4){
            monthDays = 31*(2);
            theTotalDays = monthDays + leapDays + dayOfMonth;
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        } else if (month == 5){
            monthDays = 31*(2) + 30;
            theTotalDays = monthDays + leapDays + dayOfMonth;
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        } else if (month == 6){
            monthDays = 31*(3) + 30;
            theTotalDays = monthDays + leapDays + dayOfMonth;
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        } else if (month == 7){
            monthDays = 31*(3) + 30*(2);
            theTotalDays = monthDays + leapDays + dayOfMonth;
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        } else if (month == 8){
            monthDays = 31*(4) + 30*(2);
            theTotalDays = monthDays + leapDays + dayOfMonth;
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        } else if (month == 9){
            monthDays = 31*(5) + 30*(2);
            theTotalDays = monthDays + leapDays + dayOfMonth;
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        } else if (month == 10){
            monthDays = 31*(5) + 30*(3);
            theTotalDays = monthDays + leapDays + dayOfMonth;
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        } else if (month == 11){
            monthDays = 31*(6) + 30*(3);
            theTotalDays = monthDays + leapDays + dayOfMonth;
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        } else if (month == 12){
            monthDays = 31*(6) + 30*(4);
            theTotalDays = monthDays + leapDays + dayOfMonth;
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        } else {
            System.out.println("Month: " + month + " Year: " + year + " Day: " + dayOfMonth + "The day of the week is " + ((startingDay + theTotalDays -1) % 7));
            return (startingDay + theTotalDays -1) % 7;
        }
    }

    /**
     * Returns the day of the week that the date falls on
     * @param month name of the month
     * @param dayOfMonth day of the month
     * @param year year
     * @return the day of the week that the date falls on
     */
    public static int dayOfWeek(String month, int dayOfMonth, int year){
        System.out.println(month);
        int monthInt = 0;
        if (month == "January"){
            monthInt = 1;
        } else if (month == "February"){
            monthInt = 2;
        } else if (month == "March"){
            monthInt = 3;
        } else if (month == "April"){
            monthInt = 4;
        } else if (month == "May"){
            monthInt = 5;
        } else if (month == "June"){
            monthInt = 6;
        } else if (month == "July"){
            monthInt = 7;
        } else if (month == "August"){
            monthInt = 8;
        } else if (month == "September"){
            monthInt = 9;
        } else if (month == "October"){
            monthInt = 10;
        } else if (month == "November"){
            monthInt = 11;
        } else if (month == "December"){
            monthInt = 12;
        } else {
            return -1;
        }
        int startingDay = ((year + ((year-1) / 4) - ((year-1) / 100) + ((year-1) / 400)) % 7);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }
        int totalDays = 0;
        for (int i = 0; i < monthInt - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += dayOfMonth;
        return (startingDay + totalDays - 1) % 7;
    }
}
