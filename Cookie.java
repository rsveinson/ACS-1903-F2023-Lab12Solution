/** 
 * ACS-1903 Lab 12 Q7
 * @author (enter your name and student number here)
*/
public class Cookie{
    // fields
    private String flavour;
    private Jar jar;
    
    // constructors
    public Cookie(){
        flavour = "unkown";
    }
    
    public Cookie(String f){
        flavour = f;
    }
    
    // getters and setters
    public String getFlavour(){
        return flavour;
    }
    
    public Jar getJar(){
        return this.jar;
    }
    
    public void setFlavour(String f){
        flavour = f;
    }
    
    public void setJar(Jar j){
        this.jar = j;
    }
    
    // other methods
    public String toString(){
      return flavour; 
    }
    
    
}
