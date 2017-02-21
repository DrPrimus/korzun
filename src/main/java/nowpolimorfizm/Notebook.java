package main.java.nowpolimorfizm;

/**
 * Created by Vova on 17.02.2017.
 */
public class Notebook extends Computer  {

    @Override
    public void on() {
        System.out.println("я включился " + getName());
    }
    @Override
    public void  of() {
        System.out.println("я выключился " + getName());
    }
    @Override
    public void load(){
        System.out.println("объем жестокго диска" + getHdd() + "гб" );
    }
    public  void charge(){
        System.out.println("наутбук заряжается ");
    }

}

