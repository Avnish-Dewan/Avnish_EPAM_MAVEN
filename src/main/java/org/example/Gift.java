package org.example;
import java.util.*;
public class Gift {
    public Vector<Sweets> sl;
    int totalweight;

    public Gift(Vector<Sweets> sweets) {
        this.sl = sweets;
    }

    public int totalWeight()
    {

        for(Sweets s1:sl)
        {
            this.totalweight+=s1.getWeight();
        }
        return totalweight;
    }
}
