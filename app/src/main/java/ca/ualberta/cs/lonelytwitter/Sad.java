package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dzhang4 on 9/16/15.
 */
public class Sad extends Mood {
    public Sad(Date date) {
        super(date);
    }

    public String str() {
        return "Sad";
    }
}
