
package cabusasit2c;


public class Inventories {
    int id,stock;
    String name,category;
    double price;
    static Inventories[] ins = new Inventories[100];
    static int currentCount = 0;
    
    public Inventories (int pid, String pname, String pcate, int pstock, double pprice){
        
        this.id = pid;
        this.name = pname;
        this.category = pcate;
        this.stock = pstock;
        this.price = pprice;
        ins[currentCount++] = this; 
        }
    
        public void viewInventories(){
           
            System.out.printf("%-10d %-10s %-10s %-10d %-10.2f %-10s",
                    id,name,category,stock,price);
        }
        
        public static boolean checkID(int cid){
            for(int i =0; i<currentCount; i++){
                if(ins[i].id == cid){
                    System.out.println("ID already exists. Please enter a different ID.");
                    return false;
                }    
        }
        return true;   
    }
        
        
       public static boolean checkStock(int stockss){
            for(int i =0; i<currentCount; i++){
                if(ins[i].stock < 0){
                    System.out.println("Should be non-negative and represent the actual count");
                    return false;
                }    
        }
        return true;   
    }
         public static boolean checkPrice(double pricee){
            for(int i =0; i<currentCount; i++){
                if(ins[i].price < 0){
                    System.out.println("Should be a positive value indicating the cost of one unit of the product");
                    return false;
                }    
        }
        return true;   
    }
    }

