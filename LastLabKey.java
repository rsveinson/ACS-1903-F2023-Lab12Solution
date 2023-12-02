/**
 * ACS-1903 Lab 12 Q8
 * @author (enter your name and student number here)
 */
 
public class LastLabKey{
    public static void main(String[] args) {
        Jar jar = new Jar("My Cookies");
        Cookie pb = new Cookie("Peanut Butter");

        addCookieToJar(jar, new Cookie("Chocolate Chip"));
        addCookieToJar(jar, new Cookie("Gingerbread"));
        addCookieToJar(jar, pb);
        addCookieToJar(jar, new Cookie("Oatmeal Raisin"));

        System.out.println(jar);
    }

    // add method here
    public static void addCookieToJar(Jar j, Cookie c){
        c.setJar(j);
        j.addCookie(c);
    }

}
