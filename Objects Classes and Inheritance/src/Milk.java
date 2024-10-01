public class Milk extends Item implements TimePassage{
    private int expirationTime;
    private String flavor;

    Milk(){
        super();
    }
    Milk(String name, int quantity, double price, int expirationTime, String flavor){
        super(name, quantity, price);
        setExpirationTime(expirationTime);
        setFlavor(flavor);

    }
    public void setExpirationTime (int expirationTime){
        if (expirationTime > 0){
            this.expirationTime = expirationTime;
        }
        else {
            System.out.println(getName() + " is expired!");
            this.expirationTime = 0;
        }
    }
    public int getExpirationTime(){
        return expirationTime;
    }
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }
    public String getFlavor(){
        return flavor;
    }
    public void TimePassing(int days){
        expirationTime += (-1 * days);
        setExpirationTime(expirationTime);
    }

    public String toString(){
        return super.toString() +
                "\nFlavor: " + getFlavor()  +
                "\nDays Until Expiration: " + getExpirationTime();
    }
}
