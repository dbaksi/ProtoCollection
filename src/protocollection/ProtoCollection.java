/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package protocollection;

import java.util.*;
/**
 *
 * @author Dibyendu
 */
public class ProtoCollection {
    A a;
    B b;
    /**
     * @param args the command line arguments
     */
   public static void main(String [] args) {   
      
      System.out.println("Bs are about to be constructed "); 
      B b1 = new B(1, "b11" , "b12", "b13", 1);
      B b2 = new B(2, "b21" , "b22", "b23", 1);
      Iterator iter;
      List<B> bins1 = new ArrayList<B>();
      bins1.add(b1);
      bins1.add(b2); 
      System.out.println("Bs are constructed ");       
      
 //     A a = new A(1, "a11" , "a12", "a13", bins);

      A a = new A();
      
      a.setA_id(1);
      a.setA1("a11");
      a.setA2("a12");
      a.setA3("a13");
      a.setMyBs(bins1);
      
      B b3 = new B(1, "b31" , "b32", "b33", 1);
      B b4 = new B(2, "b41" , "b42", "b43", 1);
      Iterator iter2;
//      List<B> bins2 = new ArrayList<B>();
      bins1.add(b3);
      bins1.add(b4);
      
      a.setMyBs(bins1);
     
      System.out.println("A instance with Bs done ");       
      //System.out.print("Collection data: "); 
      System.out.print("a1 is  ");       
      System.out.println(a.getA1());       
      System.out.print("bs are  ");       
      System.out.println(a.getMyBs());
      List<B> bouts = new ArrayList<B>();
      bouts = (List<B>) a.getMyBs();
      Iterator itrtr = bouts.iterator(); 
      B bout;
      while (itrtr.hasNext()){
         bout = new B();
         bout= (B) itrtr.next();
         System.out.print("b1 is  ");  
         System.out.println(bout.b1);
         System.out.print("b2 is  ");  
         System.out.println(bout.b2);
      }
      
   }
}
