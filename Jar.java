import java.util.ArrayList;
/** 
 * ACS-1903 Lab 12 Q7
 * @author (enter your name and student number here)
*/

public class Jar{
    // fields
    private String name;
    private ArrayList<Cookie> cookies;
    
    // constructor
    public Jar(String name){
        this.name = name;
        cookies = new ArrayList<Cookie>();
    }
    
    // getters and setters
    public String getName(){
        return name;
    }
    public ArrayList<Cookie> getCookies(){
        return this.cookies;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setCookies(ArrayList<Cookie> c){
        this.cookies = c;
    }
    
    // other methods 
    public void addCookie(Cookie c){
        cookies.add(c);
    }
    
    public String toString(){
        String s = "My cookies: " + cookies;
        
        return s;
    }

}
