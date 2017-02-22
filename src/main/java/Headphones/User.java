package Headphones;

import java.util.List;

/**
 * Created by Vova on 22.02.2017.
 */
public class User {
    private String name;
    private int age;
    private List<String> messages;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
