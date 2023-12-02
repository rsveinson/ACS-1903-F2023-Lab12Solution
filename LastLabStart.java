/**
 * ACS-1903 Lab 12 Q8
 * @author (enter your name and student number here)
 */
 
public class LastLabStart{
    public static void main(String[] args) {
        Jar jar = new Jar("My Cookies");
        Cookie wcmn = new Cookie("White Chololate Macadamia Nut");

        addCookieToJar(jar, new Cookie("Chocolate Chip"));
        addCookieToJar(jar, new Cookie("Double Chocolate"));
        addCookieToJar(jar, wcmn);
        addCookieToJar(jar, new Cookie("Peanut Butter"));

        System.out.println(jar);
    }

    // add method here

}
