package Headphones;

/**
 * Created by Vova on 22.02.2017.
 */
public class Nowjson {
        public static String separator;
        private long model;
        private String name;
        private String made;
    public  Nowjson() {
    }
    public Nowjson(Long model,String name,String made){
            this.model=model;
            this.name=name;
            this.made=made;
    }

        public void setName(String name) {this.name = name;}
        public String getName() {return name;}
        public void setMade(String made) {this.made = made;}
        public String getMade() {return made;}
        public void setModel(long model) {this.model = model;}
        public long getModel() {return model;}

}