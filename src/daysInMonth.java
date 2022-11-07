public class daysInMonth
{

    // method that calculates whether the year is a leap year
    // has 1 parameter, int year
    // Returning a boolean value
    public static boolean isLeapYear (int year)
    {

        //range is set between 1 and 9999
        if((year >= 1) && (year <= 9999))
        {
            if(((year % 4 == 0)&& (year % 100 != 0)) || (year % 400 == 0))
            {
                return true;
            }
            else
            {
                return false;
            }

        }
        return false;
    }

    // method that returns the number of days in a given month of the year
    //hase two int parameters
    //returning an int value
    public static int getDaysInMonth(int month, int year)
    {
        // has a range of 1 and 9999
        if((year < 1) || (year > 9999))
        {
            return -1;
        }
        else
        {

            // months are branched into Switch case method
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                // case 2 being February
                // calls the method that calculates if is leap year
                case 2:
                    if(isLeapYear(year))
                    {
                        return 29;
                    }
                    else
                    {
                        return 28;
                    }
                case 4: case 6: case 9: case 11:
                    return 30;


            }
        }

        return -1;
    }


}