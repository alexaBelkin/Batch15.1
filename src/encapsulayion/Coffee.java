package encapsulayion;

public class Coffee {
    //create 3 instance variables as private
    //create seller and getter to give acces to those variables
    //in a different class try to access in instance variables to initialize or manipulate

    private double size;
    private String type;
    private boolean HotOrIce;

    public boolean isHotOrIce() {
        return HotOrIce;
    }

    public void setHotOrIce(boolean hotOrIce) {
        HotOrIce = hotOrIce;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
