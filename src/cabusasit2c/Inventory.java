
package cabusasit2c;

import java.util.*;
public class Inventory {
    public void inputInventory(){
        Inventories[] ins = new Inventories[100];
        Scanner in = new Scanner (System.in);
        int stock=0;
        System.out.print("Enter number of Products: ");
        int np = in.nextInt();
        
        for(int i = 0; i<np; i++){

            System.out.println("Enter details of product "+(i+1));
            int id;
           do{
                System.out.print("ID: ");
                id = in.nextInt();
            }while(!Inventories.checkID(id));
            
            System.out.print("Name:");
            String name = in.next();
            System.out.print("Category: ");
            String cate= in.next();;
             
             
            do{
                System.out.print("Stock Quatity: ");
             stock = in.nextInt();
            }while(!Inventories.checkStock(stock));
            
            double ppu;
            do{
            System.out.print("Price per Unit: ");
             ppu = in.nextFloat();
            }while(!Inventories.checkPrice(ppu));
            
            new Inventories(id,name,cate,stock,ppu);
            
        }
         String status;
            if(stock>0){
                status = "Valid";
            }else{
                status = "Invalid";
            }
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s",
            "ID", "Name","Category", "Stock Quantity","Price Per Unit", "Status");
            System.out.println("");
        for(int i=0; i<np; i++){
            
            Inventories.ins[i].viewInventories();
        }
    }
    
}
