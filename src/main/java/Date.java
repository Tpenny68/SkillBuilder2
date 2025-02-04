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
        switch (dayValue){
            case 0:
                return "Sunday";
                case 1:
                    return "Monday";
                    case 2:
                        return "Tuesday";
                        case 3:
                            return "Wednesday";
                            case 4:
                                return "Thursday";
                                case 5:
                                    return "Friday";
                                    case 6:
                                        return "Saturday";
                                        default:
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
        if (name.equalsIgnoreCase("January")){
            return 1;
        } else if (name.equalsIgnoreCase("February")){
            return 2;
        } else if (name.equalsIgnoreCase("March")){
            return 3;
        } else if (name.equalsIgnoreCase("April")){
            return 4;
        } else if (name.equalsIgnoreCase("May")){
            return 5;
        } else if (name.equalsIgnoreCase("June")){
            return 6;
        } else if (name.equalsIgnoreCase("July")){
            return 7;
        } else if (name.equalsIgnoreCase("August")){
            return 8;
        } else if (name.equalsIgnoreCase("September")){
            return 9;
        } else if (name.equalsIgnoreCase("October")){
            return 10;
        } else if (name.equalsIgnoreCase("November")){
            return 11;
        } else if (name.equalsIgnoreCase("December")){
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
        switch (month){
            case 1:
                return "January";
                case 2:
                    return "February";
                    case 3:
                        return "March";
                        case 4:
                            return "April";
                            case 5:
                                return "May";
                                case 6:
                                    return "June";
                                    case 7:
                                        return "July";
                                        case 8:
                                            return "August";
                                            case 9:
                                                return "September";
                                                case 10:
                                                    return "October";
                                                    case 11:
                                                        return "November";
                                                        case 12:
                                                            return "December";
                                                            default:
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
        switch (month){
            case 1:
                return 31;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        return 29;
                    } else {
                        return 28;
                    }
                    case 3:
                        return 31;
                        case 4:
                            return 30;
                            case 5:
                                return 31;
                                case 6:
                                    return 30;
                                    case 7:
                                        return 31;
                                        case 8:
                                            return 31;
                                            case 9:
                                                return 30;
                                                case 10:
                                                    return 31;
                                                    case 11:
                                                        return 30;
                                                        case 12:
                                                            return 31;
                                                            default:
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
        switch (month){
            case 1:
                return (startingDay) % 7;
                case 2:
                    if (dayOfMonth <= leapDays){
                        monthDays = 31;
                        theTotalDays = monthDays + dayOfMonth;
                        return (startingDay + theTotalDays -1) % 7;
                    } else {
                        return -1;
                    }
                    case 3:
                        monthDays = 31;
                        theTotalDays = leapDays + monthDays + dayOfMonth;
                        return (startingDay + theTotalDays -1) % 7;
                        case 4:
                            monthDays = 31*(2);
                            theTotalDays = leapDays + monthDays + dayOfMonth;
                            return (startingDay + theTotalDays -1) % 7;
                            case 5:
                                monthDays = 31*(2) + 30;
                                theTotalDays = leapDays + monthDays + dayOfMonth;
                                return (startingDay + theTotalDays -1) % 7;
                                case 6:
                                    monthDays = 31*(3) + 30;
                                    theTotalDays = leapDays + monthDays + dayOfMonth;
                                    return (startingDay + theTotalDays -1) % 7;
                                    case 7:
                                        monthDays = 31*(3) + 30*(2);
                                        theTotalDays = leapDays + monthDays + dayOfMonth;
                                        return (startingDay + theTotalDays -1) % 7;
                                        case 8:
                                            monthDays = 31*(4) + 30*(2);
                                            theTotalDays = leapDays + monthDays + dayOfMonth;
                                            return (startingDay + theTotalDays -1) % 7;
                                            case 9:
                                                monthDays = 31*(5) + 30*(2) + 30;
                                                theTotalDays = leapDays + monthDays + dayOfMonth;
                                                return (startingDay + theTotalDays -1) % 7;
                                                case 10:
                                                    monthDays = 31*(5) + 30*(3);
                                                    theTotalDays = leapDays + monthDays + dayOfMonth;
                                                    return (startingDay + theTotalDays -1) % 7;
                                                    case 11:
                                                        monthDays = 31*(6) + 30*(3);
                                                        theTotalDays = leapDays + monthDays + dayOfMonth;
                                                        return (startingDay + theTotalDays -1) % 7;
                                                        case 12:
                                                            monthDays = 31*(6) + 30*(4);
                                                            theTotalDays = leapDays + monthDays + dayOfMonth;
                                                            return (startingDay + theTotalDays -1) % 7;
                                                            default:
                                                                return -1;
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
        /***int startingDay = ((year + ((year-1) / 4) - ((year-1) / 100) + ((year-1) / 400)) % 7);
        int monthNumber = getMonthNumber(month);
        int monthDays = 0;

        int theTotalDays = 0;
        int leapDays = 0;
        System.out.println(month);
        if (isLeapYear(year)){
            leapDays = 29;
        } else {
            leapDays = 28;
        }
        switch (monthNumber){
            case 1:
                return (startingDay) % 7;
            case 2:
                if (dayOfMonth <= leapDays){
                    monthDays = 31;
                    theTotalDays = monthDays + dayOfMonth;
                    return (startingDay + theTotalDays -1) % 7;
                } else {
                    return -1;
                }
            case 3:
                monthDays = 31;
                theTotalDays = leapDays + monthDays + dayOfMonth;
                return (startingDay + theTotalDays -1) % 7;
            case 4:
                monthDays = 31*(2);
                theTotalDays = leapDays + monthDays + dayOfMonth;
                return (startingDay + theTotalDays -1) % 7;
            case 5:
                monthDays = 31*(2) + 30;
                theTotalDays = leapDays + monthDays + dayOfMonth;
                return (startingDay + theTotalDays -1) % 7;
            case 6:
                monthDays = 31*(3) + 30;
                theTotalDays = leapDays + monthDays + dayOfMonth;
                return (startingDay + theTotalDays -1) % 7;
            case 7:
                monthDays = 31*(3) + 30*(2);
                theTotalDays = leapDays + monthDays + dayOfMonth;
                return (startingDay + theTotalDays -1) % 7;
            case 8:
                monthDays = 31*(4) + 30*(2);
                theTotalDays = leapDays + monthDays + dayOfMonth;
                return (startingDay + theTotalDays -1) % 7;
            case 9:
                monthDays = 31*(5) + 30*(2) + 30;
                theTotalDays = leapDays + monthDays + dayOfMonth;
                return (startingDay + theTotalDays -1) % 7;
            case 10:
                monthDays = 31*(5) + 30*(3);
                theTotalDays = leapDays + monthDays + dayOfMonth;
                return (startingDay + theTotalDays -1) % 7;
            case 11:
                monthDays = 31*(6) + 30*(3);
                theTotalDays = leapDays + monthDays + dayOfMonth;
                return (startingDay + theTotalDays -1) % 7;
            case 12:
                monthDays = 31*(6) + 30*(4);
                theTotalDays = leapDays + monthDays + dayOfMonth;
                return (startingDay + theTotalDays -1) % 7;
            default:
                return -1;
        }*/
        int monthNumber = getMonthNumber(month);
        if (monthNumber == -1) return -1; // Invalid month name
        return dayOfWeek(monthNumber, dayOfMonth, year);
    }
}
