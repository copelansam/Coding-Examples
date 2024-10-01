// Do not want to instantiate an Item so
// declared abstract.

abstract public class Item {
    private String name;
    private double price;
     private int quantity;

     Item (){}
     Item(String name, int quantity, double price){
         setName(name);
         setPrice(price);
         setQuantity(quantity);
     }
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name = name;
     }
     public int getQuantity(){
         return quantity;
     }
     public void setQuantity(int quantity){
         if (quantity >= 0){
             this.quantity = quantity;
         }
         // Else statement for if quantity is < 0 is
         // not necessary since it will default quantity to 0
     }
     public double getPrice(){
         return price;
     }
     public void setPrice(double price){
         if (price > 0){
             this.price = price;
         }
     }
     public void addAmount(int added){
         quantity += added;
     }
     public void subtractAmount(int subtracted){
         // Condition set to not have a negative quantity
         // after subtracting.
         if (subtracted <= quantity){
             quantity -= subtracted;
         }
         else{
             System.out.println(getName() + " is now out of stock!");
             setQuantity(0);
         }
     }

     @Override
     public String toString(){
         return "Item: " + getName() + "\nQuantity on Hand: " +getQuantity() +
                 "\nPrice: $" + getPrice();
     }
}
