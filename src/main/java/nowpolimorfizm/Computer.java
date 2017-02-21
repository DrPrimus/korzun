package nowpolimorfizm;

/**
 * Created by Vova on 17.02.2017.
 */
public abstract class Computer {
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
    abstract public void on();
   // abstract public void  of();
  //  abstract public void load();
}
