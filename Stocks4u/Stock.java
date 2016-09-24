package stocks4u;

/**
 *************************************************************** </h1>
 *          Stocks4U Portfolio Management System
 ***************************************************************
 * Filename: Stock.java
 *<b>Requirements:</b>
 * Manage / Store a list of stock purchases
 * View, Add, Remove individual stocks.
 * @author  Johnny Romano
 * @version 1.0.1
 * @since   2016-09-23
 * 
 ***************************************************************
 */
public class Stock {
    private String stockName, lossOrGain;
    private int stockQuantity;
    private float stockPurchasePrice, stockCurrentPrice;
    private Stock stock;
    
    public Stock()
    {
        stockName = "";
        stockQuantity = 0;
        stockPurchasePrice = 0;
        stockCurrentPrice = 0;
    }
    public Stock(String stockName, int stockQuantity, float stockPurchasePrice, float stockCurrentPrice)
    {
        super();
        setStockName(stockName);
        setStockQuantity(stockQuantity);
        setStockPurchasePrice(stockPurchasePrice);
        setStockCurrentPrice(stockCurrentPrice);
    }
    
    public String getStockName()
    {
        return stockName;
    }
    public void setStockName(String stockName) 
    {
        this.stockName = stockName;
    }
    
    public int getStockQuantity()
    {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity)
    {
        this.stockQuantity = stockQuantity;
    }
    
    public float getStockPurchasePrice()
    {
        return stockPurchasePrice;
    }
    public void setStockPurchasePrice(float stockPurchasePrice)
    {
        this.stockPurchasePrice = stockPurchasePrice;
    }
    
    public float getStockCurrentPrice()
    {
        return stockCurrentPrice;
    }
    public void setStockCurrentPrice(float stockCurrentPrice)
    {
        this.stockCurrentPrice = stockCurrentPrice;
    }
    
    public String getLossOrGain()
    {
        if(stockCurrentPrice > stockPurchasePrice)
        {
            lossOrGain = "Gain of +$" + ((stockCurrentPrice - stockPurchasePrice) * stockQuantity);
        }
        else if(stockCurrentPrice == stockPurchasePrice)
        {
            lossOrGain = "Stock has neither (gained/lossed) value.";
        }
        else
        {
            lossOrGain = "Loss of -$" + ((stockPurchasePrice - stockCurrentPrice) * stockQuantity);
        }
        return lossOrGain;
    }
}
