public class PaperTowels extends Item {
    int numOfSheets;
    String type;

    PaperTowels(){
        super();
    }
    PaperTowels(String name, int quantity, double price, int numOfSheets, String type){
        super(name, quantity, price);
        setType(type);
        setNumOfSheets(numOfSheets);

    }
    public void setType(String type){
        this.type = type;
    }
    public void setNumOfSheets(int sheets){
        if (sheets > 0){
            numOfSheets = sheets;
        }
    }
    public String getType(){
        return type;
    }
    public int getNumOfSheets(){
        return numOfSheets;
    }
    @Override
    public String toString(){
        return super.toString() +
                "\nType: " + getType() +
                "\nNumber of Sheets: " + getNumOfSheets();
    }
}
