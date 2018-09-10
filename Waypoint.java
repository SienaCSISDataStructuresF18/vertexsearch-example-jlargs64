
/**
 * A class to represent a METAL graph vertex, with a label,
 * and coordinates(lat,lng)
 * 
 *
 * @author Justin Largo
 */
public class Waypoint
{
    //instance variables(label, latitude, and longitude)
    private String label;
    private double lat;
    private double lng;
    
    //Waypoint constructor
    //formal paramaters are in the method header
    public Waypoint(String label, double lat, double lng)
    {
        //init instance vars
        this.label = label;
        this.lat = lat;
        this.lng = lng;
    }
    
    // accessor methods
    public String getLabel(){
        
        return label;
    }
    
    public double getLat(){
        
        return lat;
    }
    
    public double getLng(){
        
        return lng;
    }
    
    // human readable
    
    public String toString(){
        
        return label + " (" + lat + ", " + lng + ", " + ")";
    }
}