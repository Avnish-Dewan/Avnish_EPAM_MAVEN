package org.example;

/**
 * Hello world!
 *
 */
import java.util.Vector;
public class App 
{
    public static  void main(String args[]){

        Sweets cc=new Choco("Munch",1,2,6);
        Sweets c2=new Candy("Pulse",1,1,100);
        Vector<Sweets> gift=new Vector<Sweets>();
        gift.add(cc);gift.add(c2);
        Child child=new Child("Bob Wells");
        Gift gift1=new Gift(gift);
        child.give(gift1,child);
        child.show();
    }

}
