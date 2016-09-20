package BurgerBarn;

import javax.swing.JOptionPane;

/**
 *
 * @author Johnny Romano
 */
public class Order {
   
    private int qty;
    private int orderQty;
    private double total;
    private double extraBacon;
    private double extraCheese;
    private double price;
    private double meal;
    private double orderTotal;
    private String orderReceipt = "";
    private String orderItem;
    
    public void clearOrder()
    {
        orderQty = 1;
        qty = 1;
        price = 0;
        extraBacon = 0;
        extraCheese = 0;
        meal = 0;
        orderReceipt = "";
        orderItem = "";
    }
    public void clearAll()
    {
        orderTotal = 0;
    }
    
      
    public Order()
    {
        qty = 1;
        orderQty = 1;
        price = 0;
        total = 0;
        extraBacon = 0;
        extraCheese = 0;
        orderReceipt = "";
    }
    
    public Order(int qty, double total)
    {
        super();
        setQty(qty);
        setTotal(total);
    }
    
    public void setQty(int qty)
    {
        this.qty = qty;
        
        if (qty == 1)
        {
            price = 3.50;
        }
        if (qty == 2)
        {
            price = 4.75;
        }
         
    }
    
    
    public double getMeal(double meal)
    {
        return meal;
    }
    
    public void setMeal(double meal)
    {
        this.meal = meal;
    }
    
    public double getExtraBacon()
    {
        return extraBacon;
    }
    public void setExtraBacon(double extraBacon)
    {
        this.extraBacon = extraBacon;
    }
    public double getExtraCheese()
    {
        return extraCheese;
    }
    public void setExtraCheese(double extraCheese)
    {
        this.extraCheese = extraCheese;
    }
    
    public int getQty() 
    {
        return qty;
    }
    
     public void setTotal(double total)
    {
        this.total = total;
        total += total;
    }

    public void setOrderQty(int orderQty)
    {
        
        this.orderQty = orderQty;
        
    }
    public String getOrderQty()
    {
        
        return Integer.toString(orderQty);
    }
    
     
    public String getTotal()
    {
        total = (meal + extraBacon + extraCheese + price) * orderQty;
        return String.format("%.2f", total);
        
    }
    
    public String getTotalOrder()
    {
        orderTotal += total;
        return String.format("%.2f", orderTotal);
    }
    
    public String getOrder()
    {
        return orderReceipt;
    }
    
    public void setOrder(String orderItem)
    {
        
        this.orderItem = orderItem;
        
        orderReceipt += orderItem;
        orderReceipt += ", "; 
        
    }
    
        
}
