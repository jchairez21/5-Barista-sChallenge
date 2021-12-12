import java.util.ArrayList;
public class Order {

// member variable ------------
   private String name;
   private boolean ready;
   private ArrayList<Item> items = new ArrayList<Item>();


// constructor ----------------
   public Order(){
      setName("guest");
   }

   public Order(String name){
      setName(name);
   }

// method ---------------------
   public void addItem(Item item) {
      items.add(item);
   }

   public String getStatusMessage() {
      if(getReady() == true) {
         return "You order is now ready!";
      }else {
         return "Your order will be ready soon!";
      }
   }

   public double getOrderTotal() {
      double sum = 0.0;
      for(Item x: items) {
         sum += x.getPrice();
      }
      return sum;
}

   public void display(){
      System.out.printf("Customer Name: %s\n", getName());
      for(Item i: getItems()) {
      System.out.println(i.getName() + " - $" + i.getPrice());
      }
      System.out.println("Total: $" + getOrderTotal());
}



// getters and setters --------
   public String getName() {
      return this.name;
   }
   public boolean getReady() {
      return this.ready;
   }
   public ArrayList<Item> getItems() {
      return this.items;
   }

   //--------
   public void setName(String name) {
      this.name = name;
   }
   public void setReady(boolean ready) {
      this.ready = ready;
   }

}




