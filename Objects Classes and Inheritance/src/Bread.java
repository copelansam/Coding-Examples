public class Bread extends Item implements TimePassage{
    int expirationTime;
    String flavor;
    boolean preCut;
    Bread(String name, double price, int quantity, int expirationTime, String flavor, boolean preCut){
        super(name, quantity, price);
        setFlavor(flavor);
        setPreCut(preCut);
        setExpirationTime(expirationTime);
    }
    public void setPreCut(boolean preCut){
        this.preCut = preCut;
    }
    public boolean getPrecut(){
        return preCut;
    }
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
    public String getFlavor(){
        return flavor;
    }

    public void setExpirationTime(int expirationTime) {
        if (expirationTime > 0) {
            this.expirationTime = expirationTime;
        } else{
            System.out.println(getName() + " is expired!");
            this.expirationTime = 0;
        }
    }

    public int getExpirationTime() {
        return expirationTime;
    }

    public void TimePassing(int days){
        expirationTime += (-1 * days);
        setExpirationTime(expirationTime);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFlavor: " + getFlavor() +
                "\nPrecut? " + getPrecut() +
                "\nDays until Expiration: " + getExpirationTime();
    }
}
