package sg.edu.np.madexercise2;

import java.io.Serializable;
import java.util.Random;

public class User implements Serializable {
    String name;
    String description;
    int id;
    static Boolean followed;

    public User() {
        this.name= "Name" + Math.round((Math.random() * 1000000000)+1000000000);
        this.description= "Description " + String.valueOf(Math.round((Math.random() * 1000000000)+1000000000));
        this.id=0;
        this.followed= new Random().nextBoolean();
    }
}

