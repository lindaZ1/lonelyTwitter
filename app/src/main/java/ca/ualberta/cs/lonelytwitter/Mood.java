package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by dzhang4 on 9/16/15.
 */
public abstract class Mood {
    protected Date date;

    public Mood() {
        this.date=new Date();
    }

    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
