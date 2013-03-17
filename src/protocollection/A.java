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
public class A {

    public A(int a_id, String a1, String a2, String a3, Collection<B> myBs) {
        this.a_id = a_id;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.myBs = myBs;
    }

    public A() {
    }
    
    
    private int a_id;
    private String  a1;
    private String  a2;
    private String a3;

    public Collection<B> getMyBs() {
        return myBs;
    }

    public void setMyBs(Collection<B> myBs) {
        this.myBs = myBs;
    }
    
    private Collection<B> myBs;

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }
    
    
    
    
}
