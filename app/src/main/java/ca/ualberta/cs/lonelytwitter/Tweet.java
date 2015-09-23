package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by dzhang4 on 9/16/15.
 */
public abstract class Tweet extends Object implements Tweetable{
    private String text;
    protected Date date;
    private ArrayList<Mood> moodList;

    public Tweet(Date date, String tweet) throws IOException{
        this.date = date;
        this.setText(tweet);

    }

    public Tweet(String tweet) {
        //date default to current date
        this.date = new Date();
        this.setText(tweet);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {

        if (text.length() <= 140) {
            this.text = text;
        } else {
            throw new IllegalArgumentException("too long");
        }

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public abstract Boolean isImportant();
}
