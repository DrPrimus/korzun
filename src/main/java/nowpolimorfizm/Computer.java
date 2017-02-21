package main.java.nowpolimorfizm;

import main.java.nowpolimorfizm.api.IRebootable;

/**
 * Created by Vova on 17.02.2017.
 */
public class Computer implements IRebootable{
    private String name;
    private int ram;
    private  int hdd;
    private  int weight;

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public int getHdd() {
        return hdd;
    }
    public int getWeight() {
        return weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
     public void on() {
        System.out.println("я включился " + getName());
     }
   public void  of() {
        System.out.println("я выключился " + getName());
   }
  public void load(){
        System.out.println("объем жестокго диска" + getHdd() + "гб" );
  }

    public void reboot() {
        System.out.println("перезагружаюсь");
    }
}
