package AccessMod;

public class Animal {

    public String namePublic;
    protected int ageProtected;
    String colorDefault;
    private double weightPrivate;

    public void eatPublic(){
        System.out.println("EAT"+weightPrivate);
    }
    protected void runProtected(){
        System.out.println("RUN");
    }
    private void sleepPrivate(){
        System.out.println("SLEEP"+weightPrivate);
    }
    void jump(){
        System.out.println("JUMP");
    }



}
