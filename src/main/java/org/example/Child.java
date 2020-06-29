package org.example;
import java.util.*;
public class Child {
    String name;
    Vector<Gift> g=new Vector<Gift>();

    public Child(String name) {
        this.name = name;
    }
    public void give(Gift gift,Child child)
    {
        child.take(gift);
    }
    public void take(Gift gift)
    {
        g.add(gift);
    }
    public void show()
    {
        System.out.print(this.name+": ");
        for(int i=0;i<g.size();i++)
        {
            int ans= g.get(i).totalWeight();
            System.out.println(" Total Weight"+ans);
        }
    }
}
