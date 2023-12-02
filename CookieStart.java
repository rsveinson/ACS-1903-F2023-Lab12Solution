/** 
 * ACS-1903 Lab 12 Q7
 * @author (enter your name and student number here)
*/
public class CookieStart{
    // fields
    private String flavour;
    
    // constructors
    public Cookie(){
        flavour = "unkown";
    }
    
    public Cookie(String flavour){
        this.flavour = flavour;
    }
    
    // getters and setters
    public String getFlavour(){
        return flavour;
    }
    
    public void setFlavour(String flavour){
        this.flavour = flavour;
    }
    
    // other methods
    public String toString(){
        return flavour; 
    }
    
    
}
