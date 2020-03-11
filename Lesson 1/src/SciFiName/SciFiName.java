package SciFiName;


/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 *
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     *
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main(String[] args)
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name


        int r = (int) (Math.random() * firstName.length());
        int argumentRelativeName1 = ( (int) (Math.random() * (relativeName1.length() - 1) ) ) + 1;
        int argumentRelativeName2 = ( (int) (Math.random() * (relativeName2.length() - 1) ) ) + 1;



        firstName = firstName.substring(0, 3);
        lastName = lastName.substring(0, 2);

        city = city.substring(2, 0);
        school = school.substring(3, 0);


        relativeName1 = relativeName1.substring(1, -1);
        relativeName2 = relativeName2.substring(2, 6);

        System.out.println("Hello carki chsal of lesomas. Welcome!" + firstName + lastName + city + school + relativeName1 + relativeName2);


    }
}
