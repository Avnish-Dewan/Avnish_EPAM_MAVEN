package org.example;

public class Sweets {
    public String n;
    public int w;
    public int p;
    public int quantity;
    public Sweets(String s,int w, int p ,int q)
    {
        n=s;
        this.w=w;
        this.p=p;
        quantity=q;
    }
    public String getName()
    {
        return n;
    }
    public int getWeight()
    {
        return w;
    }
    public int getPrice()
    {
        return p;
    }
    public int getQuantity()
    {
        return quantity;
    }
}
