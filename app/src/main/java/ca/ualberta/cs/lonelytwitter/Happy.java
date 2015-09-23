package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dzhang4 on 9/16/15.
 */
public class Happy extends Mood {
    public Happy(Date date) {
        super(date);
    }

    public String str() {
        return "Happy";
    }

}
